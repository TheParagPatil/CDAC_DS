
public class StringBuilderTest {
	public static void main(String[] args) {
		
		
		String str1="jack";
		System.out.println("str1 "+str1);
		System.out.println("str1 "+str1.hashCode());

		
		str1=str1+"dsouza";
		System.out.println("str1 "+str1);
		System.out.println("str1 "+str1.hashCode());
		
		StringBuilder sb = new StringBuilder("Jack");
		
		System.out.println("sb :"+sb);
		System.out.println("sb "+sb.hashCode());
		
		sb.append("dsouza");
		System.out.println("sb :"+sb);
		System.out.println("sb "+sb.hashCode());

	}
}
