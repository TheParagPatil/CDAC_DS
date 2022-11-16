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
												//0			5
												//0         3
												//0         2
												//0         -1
	private int doPartition(int array[], int startPos, int endPos)
	{
		int pivot = array [ endPos ];//25 | 19 | 2
		int i = (startPos - 1 );//0-1 = -1
		
				//j=1       j<=2       j++
		for(int j=startPos; j <=endPos; j++)
		{	    //   
			if(array [ j ] < pivot ) {
				i++; // i = 2
				int tempValue = array [ i] ;
				array [ i ] = array [j ];
				array [ j ] = tempValue;
			}
		}
		int tempValue = array [ i + 1 ]; // 3+1 = 4 
		array [ i + 1 ] = array [ endPos ];
		array [ endPos ] = tempValue;
		System.out.println((i+1)+"\t"+Arrays.toString(array));
		return i+1; //new position  = 4(1st call) 
	}
	public void performQuickSort(int array[], int startPos, int endPos)
	{	//    0      <  5
		if(startPos < endPos ) {
					//			         0         5
					//					 0         3
					//					 0         2
			int p = doPartition(array, startPos, endPos);
			
			performQuickSort(array, startPos, p-1);//4 = 3-1=3 ,  2
			performQuickSort(array, p+1, endPos);// 4 = 4+1 = 5
		}
	}
	public void printArrayContent(int array[], int len) {
		System.out.println("---------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Value : "+array[i]);
		}
	}
}
