import java.util.Arrays;
import java.util.Scanner;

public class SearchingSortingTest2 {
	public static void main(String[] args) {
					 //0 1   2  3  4  5 6
		int array[]= {10,90,50,65,20,4,60};
		
	
		for(int i=0;i<array.length;i++) {
			System.out.println("array : "+array[i]);
		}
		
		System.out.println("Sorting....");
			Arrays.sort(array);
		System.out.println("Sorted....");
		
		for(int i=0;i<array.length;i++) {
			System.out.println("array : "+array[i]);
		}
		
		int data=MyIOService.getInteger("Enter data to search : ");

		int first =0;
		int last = array.length-1; // 7 - 1 = 6
		int middle = (first + last ) / 2; //3 

		              //0  1  2  3  4  5  6
		//int array[]= {4,10,20,50,60,65, 90};    <-- data = 20
		//				|	  |	 |	|	   |
		//				f	  |	 m	|	   l
		//        			  |     f      l
			//			f     l
			//			   f  l
			   // 0     6 
		while(first <= last) {
			//   50            20
			if(array[middle] < data) {// to branch into the right side of the mid
				first = middle + 1;
			}
			else if(array[middle]==data) { // find out at the mid
				System.out.println("found the data: "+data+" at location "+middle+1);
				break;
			}
			else 
					last = middle-1;
			middle = (first + last)/2;
		}
		if(first > last) 
			System.out.println("Data not found.....");
	}
}
//Array list

/*
		  0    1    2    3    4   5   6
		------------------------------------
		| 10 | 90|	50 | 65	| 20| 4	| 60 | <-----
		------------------------------------
		
	Enter data to search : 20
		 
			int data2=MyIOService.getInteger("Enter empnumber to search : ");
		int data3=MyIOService.getInteger("Enter age to search : ");
		int data4=MyIOService.getInteger("Enter salary to search : ");
		 

*/