import java.util.*;
public class MatrixOperations1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
		
		// Applying the required logic and printing results
        int[][] matrixA=createRandomMatrix(rows,cols);
        int[][] matrixB=createRandomMatrix(rows,cols);
        System.out.println("\nMatrix A:");
        printMatrix(matrixA);
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
        System.out.println("\nAddition:");
        printMatrix(addMatrices(matrixA,matrixB));
        System.out.println("\nSubtraction:");
        printMatrix(subtractMatrices(matrixA,matrixB));
        System.out.println("\nMultiplication:");
        int[][] matrixC=createRandomMatrix(cols,rows);
        printMatrix(multiplyMatrices(matrixA,matrixC));
        sc.close();
    }

    // Method to create random matrix
    static int[][] createRandomMatrix(int rows,int cols){
        int[][] matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=(int)(Math.random()*10);
            }
        }
        return matrix;
    }

    // Method to add two matrices
    static int[][] addMatrices(int[][] a,int[][] b){
        int[][] result=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    static int[][] subtractMatrices(int[][] a,int[][] b){
        int[][] result=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                result[i][j]=a[i][j]-b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    static int[][] multiplyMatrices(int[][] a,int[][] b){
        int[][] result=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }

    // Method to print matrix
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
