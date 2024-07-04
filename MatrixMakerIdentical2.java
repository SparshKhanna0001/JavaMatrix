import java.util.Scanner;

class MatrixMakerIdentical2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will create 2 matrices of the dimensions provided by the user.");
        
        int[] order = dimensionsIn();
        int[][] matrix1 = new int[order[0]][order[1]];
        
        System.out.println("Enter data for matrix1: \n");
        for (int i = 0; i < order[0]; i++) {
            for (int j = 0; j < order[1]; j++) {
                System.out.print("> ");
                matrix1[i][j] = scan.nextInt();
            }
        }

        order = dimensionsIn();
        int[][] matrix2 = new int[order[0]][order[1]];
        System.out.println("Enter data for matrix2: \n");
        for (int i = 0; i < order[0]; i++) {
            for (int j = 0; j < order[1]; j++) {
                System.out.print("> ");
                matrix2[i][j] = scan.nextInt();
            }
        }
        
        scan.close(); // Close scanner after all input operations are done
        
        // Print matrices or perform further operations
    }

    private static int[] dimensionsIn() {
        Scanner scan0 = new Scanner(System.in);
        int[] order = new int[2];
        
        System.out.print("Enter the number of rows\n\t> ");
        order[0] = scan0.nextInt();

        System.out.print("Enter the number of columns\n\t> ");
        order[1] = scan0.nextInt();

        // Do not close scan0 here to keep System.in open
        
        return order;
    }

    private static boolean sameDimensions(int[][] matrix1, int[][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            return true;
        }
        else{
            return false;
        }
    }
    
    private static int[][] add(int[][] matrix1, int[][] matrix2){
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];

        for(int i = 0; i<matrix1.length; i++){
            for(int j =0; j< matrix1[0].length; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return sumMatrix;
    }

    private static int[][] sub(int[][] matrix1, int[][] matrix2){
        int[][] subMatrix = new int[matrix1.length][matrix1[0].length];

        for(int i = 0; i<matrix1.length; i++){
            for(int j =0; j< matrix1[0].length; j++){
                subMatrix[i][j] = matrix1[i][j] - matrix1[i][j];
            }
        }
        
        return subMatrix;

    }

    private static boolean orderMul(int[][] matrix1, int[][] matrix2){
        if(matrix1[0].length == matrix2.length){
            return true;
        }
        else{
            return false;
        }
    }

    private static int[][] mul(int[][] matrix1, int[][] matrix2){
        int[][] mulMatrix = new int[matrix1.length][matrix2[1].length];

        for(int i = 0; i< mulMatrix.length; i++){
            for(int j = 0; j< mulMatrix[1].length; j++){
                
            }
        }
    }
}
