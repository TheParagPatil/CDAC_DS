
public class LinearProbingTest {
	public static void main(String[] args) {
		LinearProbingHashSet linProbHs = new LinearProbingHashSet(5);
		linProbHs.insertElement("ind", "India");
		linProbHs.insertElement("usa", "America");
		linProbHs.insertElement("uk", "London");
		linProbHs.insertElement("chi", "China");
		linProbHs.insertElement("uae", "Emirates");

		System.out.println("-------------");
		
		linProbHs.printHashTableValues();
		
		linProbHs.remove("chi");
		
		linProbHs.printHashTableValues();
		
		/*String countryName=linProbHs.get("ukk");
		System.out.println("CountryName : "+countryName);*/
		
		/*String keyToSearch = "uk";
		boolean status = linProbHs.containsKey(keyToSearch);
		System.out.println("status "+status);
		
		if(status ==true) {
			System.out.println("Key found");
			String value = linProbHs.get(keyToSearch);
			System.out.println("Key's value : "+value);
		}
		else {
			System.out.println("Key not found...");
		}*/
		
		
		
	}
}

class LinearProbingHashSet
{
	String keys[]; // array
	String vals[]; //array
	int maxSize,currentSize;
	
	LinearProbingHashSet(int capacity) {
		currentSize=0;
		maxSize = capacity; //5
		keys = new String [ maxSize];
		vals = new String [ maxSize];
	}
	
	public void printHashTableValues() {
		for (int i = 0; i < maxSize; i++) {
			
			if(keys[i]!=null) {
				System.out.println("Key : "+keys[i]+" and Value : "+vals[i]);
			}
		//	System.out.println("\n");
		}
	}
	
	private int getSize() {
		return currentSize;
	}
	
	public boolean containsKey(String key) {
		boolean keyFound=false;		
		for (int i = 0; i < maxSize; i++) {
			if(keys[i].equals(key)) {
				keyFound=true;
				break;
			}
		}
		return keyFound;
				
	}
	
	public String get(String keyToFind)
	{
		int i = hash(keyToFind);
 
		while(keys[i]!=null) {
			
			if(keys[i].equals(keyToFind)) {
				return vals[i];
			}
			
			i=(i+1)%maxSize;
			System.out.println("i:"+i);
		}
		return null;
	}
	
	private int hash(String key) {
		System.out.println("key.hashCode         : "+key.hashCode());
		System.out.println("key.hashCode%maxSize : "+(key.hashCode()%maxSize));
		return key.hashCode() % maxSize;//0 to 4
	}
							//"ind"			"India"
	public void insertElement(String key, String val) {
		System.out.println("inserting element...");
		int temp = hash(key);
		int i = temp; //0
		
		do {
				if(keys[i]==null) {
					keys[i]=key;
					vals[i]=val;
					currentSize++;
					return;
				}
					//ind         uae
				if(keys[i].equals(key)) {
					vals[i] = val;
					return;
				}
				i = (i+1)%maxSize; // 2%5=2
		} while (i!=temp);
	}
	
	public void remove(String keyToRemove) {
		
		if(containsKey(keyToRemove)) {
			System.out.println("Key found to remove...");
			int i = hash(keyToRemove);//3
			while(!keyToRemove.equals(keys[i])) {
				i=(i+1)%maxSize;
			}
			keys[i] = vals[i] = null;
			currentSize--;
		}
		else {
			System.out.println("Key not found.....");
		}
	}
}

/*

	
*/
