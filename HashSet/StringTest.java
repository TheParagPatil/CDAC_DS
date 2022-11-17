
public class StringTest {
	public static void main(String[] args) {
		
		String str1=new String("ind");
		String str2=new String("usa");
		String str3=new String("uk");
		String str4=new String("chi");
		String str5=new String("uae");
		
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		System.out.println("str4:"+str4);
		System.out.println("str5:"+str5);
		
		System.out.println("str1:"+str1.hashCode());
		System.out.println("str2:"+str2.hashCode());
		System.out.println("str3:"+str3.hashCode());
		System.out.println("str4:"+str4.hashCode());
		System.out.println("str5:"+str5.hashCode());
		
		System.out.println("str1:"+str1.hashCode()%5);
		System.out.println("str2:"+str2.hashCode()%5);
		System.out.println("str3:"+str3.hashCode()%5);
		System.out.println("str4:"+str4.hashCode()%5);
		System.out.println("str5:"+str5.hashCode()%5);
	}
}
