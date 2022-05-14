/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprac;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question4 {
    public static boolean isIdentify(int n,int matrix[][]){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j && matrix[i][j]!=1) return false;
                else if(i!=j && matrix[i][j]!=0)return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of matrix : ");
        int n,i,j;
        n = input.nextInt();
        System.out.println("Enter matrix : ");
        int matrix[][] = new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        if(isIdentify(n, matrix)){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not Identity Matrix");
        }
    }
}
