import java.util.Scanner;

class MatrixMaker{
    public static void main(String args[]){
        /*
        This program asks for number of rows and columns, then it creates a matrix with given dimensions
         */
        /*
         Advanced:- ask the user the number of matrices to be created. Then create that many matrices
        */
    
        Scanner scan  = new Scanner(System.in);
        
        System.out.print("Enter the number of matrices you want to create... \n\t>");
        int numOfMatrices = scan.nextInt();
        //int i  = 0;
        


        int matrices[][][] = new int[numOfMatrices][][];
/*
        while(i<numOfMatrices){
            System.out.println("Enter the number of rows... \n\t> ");
            int rows = scan.nextInt();

            System.out.println("Enter the number of columns... \n\t> ");
            int columns = scan.nextInt();


            for(int j=0; j<)
        }
*/
        for(int i = 0; i<numOfMatrices;i++){
            int  []dimensions  = getDimensions(i);
            int rows  = dimensions[0];
            int columns = dimensions[1];
            matrices[i] = new int[rows][columns];

            
            for(int j = 0; j< rows;j++){

                for(int k = 0;k<columns;k++){
                    System.out.print("Enter the element for matrix "+ (i+1)+ " row " + (j+1) + " column " + (k+1)+ "\n\t>" );
                    
                    Scanner scan1 = new Scanner(System.in); 
                    int element= scan1.nextInt();

                    System.out.print(element);
                    matrices[i][j][k] = element;
                    
                    
                }
            }
            //clears screen and focuses the cursor to top left corner.
            System.out.print("\033[H\033[2J");
        
        }
    }

    private static int[] getDimensions(int matrixNumber){
        int matrixNumber_p = matrixNumber+1;
        int [] dimensions= new int[2]; //[row, column]
        Scanner scan0 = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix " + (matrixNumber_p) + "\n\t >");
        
        dimensions[0] = scan0.nextInt();

        System.out.print("Enter the number of columns for matrix " + (matrixNumber_p) + "\n\t >");
        
        dimensions[1] = scan0.nextInt();
        
        return dimensions;
    }



}