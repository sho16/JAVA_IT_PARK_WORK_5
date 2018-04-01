public class MainB {

	public static void main(String[] args) {

		int[][] matrixB = {
			{1,2,3,4},
			{8,7,6,5},
			{12,11,10,9}
		};		

		for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
            	        System.out.print(matrixB[i][j] + "\t");
                    }
                    System.out.println();
                }
	}
}