//    Convert Integer to Roman
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanL = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String showRoman = new String();
        for(int i=0;i<values.length;i++){
            while(num >= values[i]){
                num-=values[i];
                showRoman+=romanL[i];
            }
        }
        System.out.println(showRoman);
    }
}
