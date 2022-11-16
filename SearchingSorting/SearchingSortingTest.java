import java.util.Scanner;

public class SearchingSortingTest {
	public static void main(String[] args) {
		
		int array[]= {10,90,50,65,20,4,60};
		
		/*int array2 []  = new int[100];
		array2 [0]=10;
		array2 [1]=90;
		array2 [2]=50;
		array2 [3]=65;*/
		
		for(int i=0;i<array.length;i++) {
			System.out.println("array : "+array[i]);
		}
		
		int data=MyIOService.getInteger("Enter data to search : ");

		boolean found = false;
		for(int i=0;i<array.length;i++) {
			if(data == array[i]) {
				found=true;
				break;
			}
		}
		if(found==true) {
			System.out.println("data found : "+data);
		}
		else {
			System.out.println("data NOT found : "+data);
		}
		
		
		
	}
}
class MyIOService
{
	public static int getInteger(String msgToPrint) {
		System.out.println(msgToPrint);
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		return temp;
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