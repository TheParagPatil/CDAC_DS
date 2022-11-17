import java.util.Arrays;
import java.util.Iterator;

public class QuickSortTest {
	public static void main(String[] args) {
		int array [] = { 13,18,27,2,19,25};
		//int array [] = { 3,2,1,6,5,4};
		QuickSort quickSort = new QuickSort();
		quickSort.printArrayContent(array, array.length-1);
			quickSort.performQuickSort(array, 0, array.length-1);
		quickSort.printArrayContent(array, array.length-1);
	}
}
class QuickSort
{

	private int doPartition(int array[], int startPos, int endPos)
	{
		System.out.println(">---doPartition----started---------start:"+startPos+"end:"+endPos);
		int pivot = array [ endPos ];//25 | 19 | 2
		System.out.println("--pivot--"+pivot);
		int i = (startPos - 1 );//0-1 = -1
		System.out.println("--i:"+i);
				//j=1       j<=2       j++
		for(int j=startPos; j <=endPos; j++)
		{	    //   
			System.out.println("\t--j--"+j);
			if(array [ j ] < pivot ) {
				System.out.println("\t\n--if(array[j]<pivot:"+array[j]+"<"+pivot);
				i++; // i = 2
				System.out.println("\t--i++:"+i);
				System.out.println("\t--swapping..."+array[i]+ " and "+array[j]);
				int tempValue = array [ i] ;
				array [ i ] = array [j ];
				array [ j ] = tempValue;
				System.out.println("\t--after swap : "+Arrays.toString(array));
			}
			else {
				
				System.out.println("\t\n--NO SWAP--"+array[j]+"<"+pivot +" failed : i:"+i);
				System.out.println("\t--NO SWAP--"+Arrays.toString(array));
			}
		}
		System.out.println("\n--after for loop : ");
		int tempValue = array [ i + 1 ]; // 3+1 = 4 
		array [ i + 1 ] = array [ endPos ];
		array [ endPos ] = tempValue;
		System.out.println("\t--swapping...(i+1)+"+(i+1)+":"+array[i+1]+ " and "+array[endPos]+":endPos:"+endPos);
		System.out.println((i+1)+"\t"+Arrays.toString(array));
		System.out.println("<---doPartition----complete---------returning -- "+(i+1)+"\n\n");
		return i+1; //new position  = 4(1st call) 
	}
	
	public void performQuickSort(int array[], int startPos, int endPos)
	{	//    0      <  5
		//System.out.println("performQuickSort : "+Arrays.toString(array)+"start:"+startPos+" : endPos:"+endPos);
		if(startPos < endPos ) {
			System.out.println("if startPos < endPos "+startPos+"<"+endPos);
			int p = doPartition(array, startPos, endPos);
			
			System.out.println("RI:performQuickSort : "+Arrays.toString(array)+"start:"+startPos+" : p-1:"+(p-1));
			performQuickSort(array, startPos, p-1);//4 = 3-1=3 ,  2
			
			System.out.println("RII:performQuickSort : "+Arrays.toString(array)+"start is (p+1):"+(p+1)+" endPos:"+endPos);
			performQuickSort(array, p+1, endPos);// 4 = 4+1 = 5
		}
		else {
			System.out.println("\nelse if startPos < endPos FAILED "+startPos+"<"+endPos+"\n");
		}
	}
	public void printArrayContent(int array[], int len) {
		System.out.println("---------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Value : "+array[i]);
		}
	}
}
