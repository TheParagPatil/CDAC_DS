
public class InsertionSortTest {
	public static void main(String[] args) {
	int array [] = {10,  90,  50,  65,  20,  4,  60 };
	for(int i=0;i<array.length;i++)	System.out.println("array : "+array[i]);
		
	System.out.println("Sorting.....");
		int d,t;
		for(int c=1;c<=array.length-1;c++ ) {
			d=c;
				while( d > 0 && array[d] < array [d-1]) {
					t = array [d];
					array[d]= array[d-1];
					array[d-1]=t;
					
					d--;
				}
		}
		
	System.out.println("Sorted.....");
		
		
	for(int i=0;i<array.length;i++)
		System.out.println("array : "+array[i]);
		
	}
}
