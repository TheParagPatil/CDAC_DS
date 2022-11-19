
public class CreateGraph {

	public static void main(String[] args) {
		Graph myGraph = new Graph(4);
		myGraph.addEdge(0, 1);
		myGraph.addEdge(0, 2);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(2, 0);
		myGraph.addEdge(2, 3);
		
		System.out.println("myGraph : \n"+myGraph);
	}
}
class Graph
{
	private boolean adMatrix[][];
	private int numberOfVertices;
	
	public Graph(int numberOfVertices) {
		super();
		this.numberOfVertices = numberOfVertices;
		adMatrix= new boolean[numberOfVertices][numberOfVertices];
	}

	void addEdge(int i,int j) {
		System.out.println("Adding edge....");
		adMatrix[i][j]=true;
		adMatrix[j][i]=true;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numberOfVertices; i++) {
			sb.append(i+": "); // i : 
			for (boolean j : adMatrix[i]) {
				sb.append((  j ? 1 : 0)+  " ");  
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}




