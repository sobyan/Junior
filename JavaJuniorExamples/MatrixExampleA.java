public class MatrixExampleA {

	public static void main(String[] args) {

		int[][] matrixA = {{-9, 1, 1}, {5, 12 , -7}, {3, 55, -22}};
		
		for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
            	        System.out.print(matrixA[i][j] + "\t");
                    }
                    System.out.println();
                }
	}
}