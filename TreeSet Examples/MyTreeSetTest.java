import java.util.Scanner;

public class MyTreeSetTest {
	public static void main(String[] args) {
		
		ChemicalElement gold = new ChemicalElement(79,"Gold","Au",196.97f); //R
		ChemicalElement silver = new ChemicalElement(47,"Silver","Ag",107.87f); //L
		ChemicalElement radium = new ChemicalElement(88,"Radium","Ra",226.03f); //R
	
		ChemicalElement calcium = new ChemicalElement(20,"Calcium","Ca",40.08f); // L L
		ChemicalElement tin  = new ChemicalElement(50,"Tin","Sn",118.711f);// L R
		
		ChemicalElement lead = new ChemicalElement(82,"Lead","Pb",207.2f); // R L
		ChemicalElement uranium  = new ChemicalElement(92,"Uranium","U",238.29f);// R R

		Scanner scan = new Scanner(System.in);
		
		MyTreeSet myTreeSet = new MyTreeSet();
		
		int choice = 0;
		do
		{
			System.out.println("1. Insert an Element ");
			System.out.println("2. Delete an Element ");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PreOrder Traversal");
			System.out.println("5. PostOrder Traversal");
			System.out.println("6. Exit");
			System.out.println("Enter choice : ");
			choice = scan.nextInt();
			
				switch(choice) {
					case 1: 
						myTreeSet.insert(); break; 
					case 3:
						myTreeSet.inOrder(myTreeSet.root); break;
					case 6: break;
				}
		} while(choice!=6);
	}
}

class MyTreeSet //Container
{
	ChemicalElement root =null, temp;
	
	//function to add
	void insert() {
		create();
		if(root == null) {
			root = temp; 
		}
		else {
			search(root);
		}
	}
	
	void create() { // create a node of the TREE
		System.out.println("Enter atomic number : ");
		Scanner scan = new Scanner(System.in);
		int tempAtomicNumber = scan.nextInt();
		
		temp = new ChemicalElement();
		temp.atomicNumber = tempAtomicNumber;
		
		temp.left = null;
		temp.right= null;
	}
	
	void search(ChemicalElement ce)
	{
		if((temp.atomicNumber > ce.atomicNumber) && (ce.right!=null))
			search(ce.right); //recursive call
		else if((temp.atomicNumber > ce.atomicNumber) && (ce.right==null))
			ce.right=temp; // assing the node

		else if((temp.atomicNumber < ce.atomicNumber) && (ce.left!=null)) 
			search(ce.left); //recursive call
		else if((temp.atomicNumber < ce.atomicNumber) && (ce.left==null)) 
			ce.left=temp; // assing the node
	}
	
	void inOrder(ChemicalElement ce) {
		if(root == null) {
			System.out.println("No elements to show in the tree");
			return ;
		}
		
		if(ce.left !=null) 
			inOrder(ce.left);
		
		System.out.println("DATA :"+ce);
		
		if(ce.right !=null) 
			inOrder(ce.right);
	}
	
	//function to search
	/*
	 * Kite k1 = new Kite();
	 * Kite k4 = k1;
	 * 
	 */
}


/*
		gold.left= silver;
		gold.left.left = calcium;
		gold.left.right = tin;
		
		gold.right = radium;
		gold.right.left = lead;
		gold.right.right = uranium;
*/
