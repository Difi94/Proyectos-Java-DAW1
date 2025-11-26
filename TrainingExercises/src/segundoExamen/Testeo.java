package segundoExamen;

public class Testeo {

	public static void main(String[] args) {
		
		int[][] matrix = new int[2][20];
		
		int multiplos3;
		int multiplos5;
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random()*51); 
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		

	}

}