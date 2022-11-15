
public class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	
	//97 66 99   97 98 67
	//a  B  c    a  b  C
	
//	
	public int compareTo(ChemicalElement o) {
		System.out.println("Comapring "+atomicNumber+" with "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	
}
