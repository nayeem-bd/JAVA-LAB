/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprac;
// lower triangular and upper triangular
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question5 {
    public static int[][] UpperTrin(int ara[][],int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i>j)ara[i][j]=0;
            }
        }
        return ara;
    }
    public static int[][] LowerTrin(int ara[][],int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i<j)ara[i][j]=0;
            }
        }
        return ara;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter size of the Matrix : ");
        n = input.nextInt();
        System.out.println("Enter matrix : ");
        int upperTriM[][] = new int[n][n];
        int lowerTriM[][] = new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                lowerTriM[i][j] = upperTriM[i][j] = input.nextInt();
            }
        }
        System.out.println("Lower Triangular Matrix:");
        lowerTriM = LowerTrin(lowerTriM,n);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(lowerTriM[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Upper Triangular Matrix:");
        upperTriM = UpperTrin(upperTriM, n);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(upperTriM[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
