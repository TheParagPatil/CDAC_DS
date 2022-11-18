
public class StringTest {
	public static void main(String[] args) {
		
		String str1=new String("ind");
		String str2=new String("usa");
		String str3=new String("uk");
		String str4=new String("chi");
		String str5=new String("uae");
		String str6=new String("eur");
		String str7=new String("nep");
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		System.out.println("str4:"+str4);
		System.out.println("str5:"+str5);
		System.out.println("str6:"+str6);
		System.out.println("str7:"+str7);
		
		System.out.println("str1:"+str1.hashCode());
		System.out.println("str2:"+str2.hashCode());
		System.out.println("str3:"+str3.hashCode());
		System.out.println("str4:"+str4.hashCode());
		System.out.println("str5:"+str5.hashCode());
		System.out.println("str6:"+str6.hashCode());
		System.out.println("str7:"+str7.hashCode());
		
		System.out.println("str1:"+str1.hashCode()%7);
		System.out.println("str2:"+str2.hashCode()%7);
		System.out.println("str3:"+str3.hashCode()%7);
		System.out.println("str4:"+str4.hashCode()%7);
		System.out.println("str5:"+str5.hashCode()%7);
		System.out.println("str6:"+str6.hashCode()%7);
		System.out.println("str7:"+str7.hashCode()%7);
		
		int idx = 5 - 3 % 5;
		System.out.println("idx "+idx);
		
		
	}
}
