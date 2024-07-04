//import MatrixMakerIdentical2.MatrixMakerIdentical2.matrixDisp();
/*
 * TEST STATUS: SUCCESSFUL
 */
class tstMul{
    public static void main(String args[]){
        // Matrix 1: 3x3 matrix
    int[][] matrix1 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Matrix 2: 3x5 matrix
    int[][] matrix2 = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 0},
        {1, 2, 3, 4, 5}
    };
    int[][] matrix3 = mul(matrix1, matrix2);

    matrixDisp(matrix3);
    }

    private static int[][] mul(int[][] matrix1, int[][] matrix2){
        int[][] mulMatrix = new int[matrix1.length][matrix2[1].length];

        for(int i = 0; i< matrix1.length;i++){
            for(int k = 0; k< matrix2[0].length; k++){
                mulMatrix[i][k] = 0;
                for(int j = 0; j<matrix2.length; j++){
                    mulMatrix[i][k] = mulMatrix[i][k] + matrix1[i][j]*matrix2[j][k];
                }
            }
        }
        return mulMatrix;
    }

    private static void matrixDisp(int[][] matrix){
        for(int i = 0; i< matrix.length; i++){
            System.out.println("\t");
            for(int j = 0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}