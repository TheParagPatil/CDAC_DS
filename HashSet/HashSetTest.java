import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {
		Book b1 = new Book(101);  
		Book b2 = new Book(102);
		Book b3 = new Book(103);
		Book b4 = new Book(102);
		Book b5 = new Book(103);
		
		System.out.println("b1 "+b1);
		System.out.println("b2 "+b2);
		System.out.println("b3 "+b3);
		System.out.println("b4 "+b4);
		System.out.println("b5 "+b5);
		
		System.out.println("b1 "+b1.hashCode());
		System.out.println("b2 "+b2.hashCode());
		System.out.println("b3 "+b3.hashCode());
		System.out.println("b4 "+b4.hashCode());		
		System.out.println("b5 "+b5.hashCode());
		System.out.println("---------");
		HashSet bookShelf = new HashSet();
		bookShelf.add(b1);
		bookShelf.add(b2);
		bookShelf.add(b3);
		bookShelf.add(b4);
		bookShelf.add(b5);
		
		Iterator<Book> bookIterator  = bookShelf.iterator();
		while(bookIterator.hasNext()) {
			Book theBook = bookIterator.next();
			System.out.println("theBook : "+theBook);
		}
	}
}
class Book
{
	int number;

	public Book(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number); // prime 31 + number
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return number == other.number;
	}

	
	
	
}
