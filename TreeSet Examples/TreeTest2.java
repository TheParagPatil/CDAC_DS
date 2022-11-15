 import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest2 {
	public static void main(String[] args) {
		
		ChemicalElement gold = new ChemicalElement(79,"Gold","Au",196.97f); //R
		
		ChemicalElement silver = new ChemicalElement(47,"Silver","Ag",107.87f); //L
		ChemicalElement radium = new ChemicalElement(88,"Radium","Ra",226.03f); //R
		
		ChemicalElement calcium = new ChemicalElement(20,"Calcium","Ca",40.08f); // L L
		ChemicalElement tin  = new ChemicalElement(50,"Tin","Sn",118.711f);// L R
		
		ChemicalElement lead = new ChemicalElement(82,"Lead","Pb",207.2f); // R L
		ChemicalElement uranium  = new ChemicalElement(92,"Uranium","U",238.29f);// R R


		TreeSet<ChemicalElement> periodicTableSet = new TreeSet<ChemicalElement>();
		System.out.println("Container created....");
		
		System.out.println("Adding 1st value...");
		periodicTableSet.add(gold);
		
		System.out.println("Adding 2nd value...");
		periodicTableSet.add(silver);
		
		System.out.println("Adding 3rd value...");
		periodicTableSet.add(radium);
		
		System.out.println("Adding 4th value...");
		periodicTableSet.add(calcium);
		
		System.out.println("Adding 5th value...");
		periodicTableSet.add(tin);
		
		System.out.println("Adding 6th value...");
		periodicTableSet.add(lead);
		
		System.out.println("Adding 7th value...");
		periodicTableSet.add(uranium);
		
		Iterator<ChemicalElement> periodicTableIterator = periodicTableSet.iterator();
		System.out.println("Retrieved the iterator....");
		
		
		while(periodicTableIterator .hasNext()) {
			ChemicalElement theElement = periodicTableIterator.next();
			System.out.println("Element : "+theElement);
		}
		
		
		
	}
}
