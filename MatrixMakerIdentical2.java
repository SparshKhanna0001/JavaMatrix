import java.util.Scanner;

class MatrixMakerIdentical2 {
    private static Scanner scan = new Scanner(System.in);
    private static String clrScn = "\033[H\033[2J";
    public static void main(String args[]) {

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

        String msg = "You have entered valid data. \n\n";
        System.out.println(msg);
        clrScn();
        //enterToContinue();
        
        operationExecution(matrix1, matrix2);
        scan.close();
                
        // Print matrices or perform further operations
    }

    private static int[] dimensionsIn() {
        //Scanner scan0 = new Scanner(System.in);
        int[] order = new int[2];
        
        System.out.print("Enter the number of rows\n\t> ");
        order[0] = scan.nextInt();

        System.out.print("Enter the number of columns\n\t> ");
        order[1] = scan.nextInt();

        // Do not close scan0 here to keep System.in open
        
        return order;
    }

    private static void clrScn(){
        System.out.println(clrScn);
    }

    private static boolean orderCheck(int[][] matrix1, int[][] matrix2){
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

    private static boolean orderCheckMul(int[][] matrix1, int[][] matrix2){
        if(matrix1[0].length == matrix2.length){
            return true;
        }
        else{
            return false;
        }
    }

    private static int[][] mul(int[][] matrix1, int[][] matrix2){
        int[][] mulMatrix = new int[matrix1.length][matrix2[0].length];

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
/*
    private static void enterToContinue(){
        System.out.println("Press Enter to continue...");
        scan.nextLine();
    }
 */
    private static void operationExecution(int[][] matrix1,int[][] matrix2){
        
        String menu = "\n\t\tMENU:\n\t1.Add\n\t2.Sub\n\t3.Mul\n\t4.Help\n\t5.Clear Screen\n\t6.Exit\n\t\t>";
        String invalidOrder = "\nThe operation on the matrices can't be performed becoz of them being not identical";
        String invalidOrderMul = "The operation on the matrices can't be performed becoz columns of first matrix don't equal to the row of matrix 2";
        String InvalidFollowUp = "\n\t\tEither try any other operation or exit and run the prorgam again to do the desired after making the required changes";
        String operationOP = "The resultant matrix is :- ";
        boolean loopRun = true;


        while(loopRun){
            System.out.print(menu);
            int  i = scan.nextInt();

            switch (i) {
                case 1:
                    if(!orderCheck(matrix1, matrix2)){
                        System.out.println(invalidOrder+InvalidFollowUp);
                    }            
                    else{
                        int[][] matrixResult = add(matrix1, matrix2);
                        System.out.println(operationOP);
                        matrixDisp(matrixResult);                        
                    }
                    //enterToContinue();
                    break;

                case 2:
                    if(!orderCheck(matrix1, matrix2)){
                        System.out.println(invalidOrder+InvalidFollowUp);
                    }            
                    else{
                        int[][] matrixResult = sub(matrix1, matrix2);
                        System.out.println(operationOP);
                        matrixDisp(matrixResult);                        
                    }
                    break;

                case 3:
                    if(!orderCheckMul(matrix1, matrix2)){
                        System.out.println(invalidOrderMul+InvalidFollowUp);
                    }
                    else{
                        int[][] matrixResult  = mul(matrix1, matrix2);
                        System.out.println(operationOP);
                        matrixDisp(matrixResult);
                    }
                    break;

                case 4:
                    System.out.print(menu);
                    break;
                
                case 5:
                    clrScn();
                    break;

                case 6:
                    loopRun = false;
                    clrScn();
                    System.out.println("Thank You for the program. \n\n\t\tWrite us feedback at matrixOperations@java.com \n\n\t\tPROGRAM ENDED.");
                    break;

                default:
                    System.out.println("Enter a valid option, next time");
                    break;
            }
        }
    }
}
