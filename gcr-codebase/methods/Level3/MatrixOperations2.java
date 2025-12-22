import java.util.*;
public class MatrixOperations2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] A=createRandomMatrix(3,3);
        int[][] B=createRandomMatrix(3,3);
		
		// Applying the required logic and printing the results
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);
        System.out.println("A + B:");
        displayMatrix(addMatrices(A,B));
        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A,B));
        System.out.println("A * B:");
        displayMatrix(multiplyMatrices(A,B));
        System.out.println("Determinant of A (3x3): "+determinant3x3(A));
        sc.close();
    }

    // Creates a random matrix of given size
    static int[][] createRandomMatrix(int rows,int cols){
        int[][] mat=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=(int)(Math.random()*10);
            }
        }
        return mat;
    }

    // Adds two matrices
    static int[][] addMatrices(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }

    // Subtracts two matrices
    static int[][] subtractMatrices(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                res[i][j]=a[i][j]-b[i][j];
            }
        }
        return res;
    }

    // Multiplies two matrices
    static int[][] multiplyMatrices(int[][] a,int[][] b){
        int[][] res=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<b.length;k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return res;
    }

    // Determinant of 2x2 matrix
    static int determinant2x2(int[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    // Determinant of 3x3 matrix
    static int determinant3x3(int[][] m){
        int a=m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1]);
        int b=m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0]);
        int c=m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        return a-b+c;
    }

    // Inverse of 2x2 matrix
    static double[][] inverse2x2(int[][] m){
        int det=determinant2x2(m);
        if(det==0)return null;
        double[][] inv=new double[2][2];
        inv[0][0]=m[1][1]/(double)det;
        inv[0][1]=-m[0][1]/(double)det;
        inv[1][0]=-m[1][0]/(double)det;
        inv[1][1]=m[0][0]/(double)det;
        return inv;
    }

    // Displays matrix
    static void displayMatrix(int[][] m){
        for(int[] row:m){
            for(int val:row){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
