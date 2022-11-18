
public class DoubleHashingTest {
	public static void main(String[] args) {
	
		//2 3 5 7
		
		HashTable ht = new HashTable(7); //container
		
		ht.printHashTable();
		
		ht.insert("ind", 50); 
		ht.insert("usa", 700);
		ht.insert("uk", 76);
		ht.insert("chi", 85);
		ht.insert("uae", 92);
		ht.insert("eur", 73);
		ht.insert("nep", 103);
		
		ht.printHashTable();
		
		
	}
}
//HashEntry he1 = new HashEntry("ind0",50);
class HashEntry 
{
    String key;
    int value;    
 
    /* Constructor */
    HashEntry(String key, int value) 
    {
        this.key = key;
        this.value = value;        
    }
}

class HashTable
{
    private int TABLE_SIZE; //7
    private int size; 
    private HashEntry[] table;
    private int primeSize;
 
     /* Constructor */
    public HashTable(int ts) 
    {
        size = 0;
        TABLE_SIZE = ts;
        table = new HashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
        primeSize = getPrime();       
    } 
    /* Function to get prime number less than table size for myhash2 function */
    public int getPrime()
    {
        for (int i = TABLE_SIZE - 1; i >= 1; i--)
        {
            int fact = 0;
            for (int j = 2; j <= (int) Math.sqrt(i); j++)
                if (i % j == 0)
                    fact++;
            
            
            if (fact == 0)
                return i;
        }
        /* Return a prime number */
        return 3;
    }
   
    
    /* Function to insert a key value pair */
    public void insert(String key, int value) 
    {
        if (size == TABLE_SIZE)
        {
            System.out.println("Table full"); 
            return;
        }           
        int hash1 = myhash1( key );//3  4  3
        int hash2 = myhash2( key );  //2 1 2
        
        while (table[hash1] != null)
        {
            hash1 += hash2;  // hash1 = hash1+hash2-> 5
            hash1 %= TABLE_SIZE;  //  hash1 = hash1 % 7 = 5%7 
        }
        table[hash1] = new HashEntry(key, value);        
        size++;
    }
   
    /* Function myhash which gives a hash value for a given string */
    private int myhash1(String x ) //ind/usa uk
    {
    	//104415  116099 3734
        int hashVal = x.hashCode( ); //FIRST KEY
        //104415 % 7 = 3      116099%7   3734%7
        hashVal %= TABLE_SIZE; //hashVal = hashVal%TABLE_SIZE;
        
        if (hashVal < 0)
            hashVal += TABLE_SIZE;
        
        System.out.println("myhash1() : "+hashVal);
        return hashVal;
    }
    
    
    
    
    /* Function myhash function for double hashing */
    private int myhash2(String x )
    {
        int hashVal = x.hashCode( ); //104415  116099 3734
        hashVal %= TABLE_SIZE; //104415%7 = 3  4
        
        if (hashVal < 0)
            hashVal += TABLE_SIZE;
        
        System.out.println("primeSize : "+primeSize +" - hashVal "+hashVal+" % primeSize "+primeSize);
        int newHashVal = primeSize - hashVal % primeSize; // MAIN  CODE
        //					5       -   3  % 5  ind
        //					5       -   4  % 5   usa
        //					5       -   3  % 5    uk
        System.out.println("myhash2() : "+newHashVal);// 2
        
        return newHashVal;
    }
    
    
    
    
    /* Function to print hash table */
    public void printHashTable()
    {
        System.out.println("\nHash Table");
        for (int i = 0; i < TABLE_SIZE; i++)
            if (table[i] != null)
                System.out.println(table[i].key +" "+table[i].value);
    }
}








/*
 * 
 * 		Account a= new Account(101,"jack");
 * 		Account b= new Account(102,"jane");
 * 		Account c= new Account(103,"jill");
 * 
 * 		Account staff [] = new Account [ 3 ];
 * 		starff[0] = new Account(101,"Jack");
 * 		starff[1] = new Account(102,"Jane");
 * 		starff[2] = new Account(103,"Jill");
 * 
 * 		ArrayList staffList = new ArrayList();
 * 		staff.add(new Account(101,"Jack"));
 * 		staff.add(new Account(102,"Jane"));
 * 		staff.add(new Account(103,"Jill"));
 * 
 */











