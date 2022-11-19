import java.util.Iterator;

public class DDArray {
	public static void main(String[] args) {
		
		int ROW=4;
		int COL=11;
		int teamscore[][]= new int[ROW][COL];
		
		int score[][]= {
				{10,23,55, 66,80,12, 56,8,91, 13,12},
				{20,13,51, 16,85,32, 62,12,8, 32,1},
				{30,25,50, 96,18,52, 16,80,29, 34,2},
				{40,20,53, 56,12,19, 63,83,29, 35,3}
			};
				
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.print(" "+score[i][j]);
			}
			System.out.println("\n--------------------");
		}
	}
}
