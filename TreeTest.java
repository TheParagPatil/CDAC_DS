import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest {
	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		System.out.println("Container created....");
		
		System.out.println("Adding 1st value...");
		ts.add(10);
		
		System.out.println("Adding 2nd value...");
		ts.add(20);
		
		System.out.println("Adding 3rd value...");
		ts.add(5);
		
		System.out.println("Adding 4th value...");
		ts.add(15);
		
		System.out.println("Adding 5th value...");
		ts.add(3);
		
		System.out.println("Adding 6th value...");
		ts.add(8);
		
		System.out.println("Adding 7th value...");
		ts.add(25);
		
		Iterator<Integer> integerIterator = ts.iterator();
		System.out.println("Retrieved the iterator....");
		
		
		while(integerIterator.hasNext()) {
			Integer theValue = integerIterator.next();
			System.out.println("Integer value : "+theValue);
		}
		
		
		
	}
}
