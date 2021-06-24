
public class Main {
	public static void main(String[] args) {
		int[][] ex = {{1,2,3},{4,5,6}};
		int[][] matrix = transpose(ex);
		
		for(int i=0; i<matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] transpose(int[][] array) {
		int[][] result = new int[array[0].length][array.length];
		
		for(int i=0; i<result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = array[j][i];
			}
		}
		
		return result;
	}

}
