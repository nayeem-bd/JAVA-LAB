//convert an integer to word
import java.util.Scanner;


public class Question2 {
    public static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven","eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    public static final String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    
    public static String convert(int n){
        if(n<20){
            return units[n];
        }
        if(n<100){
            return tens[n/10]+((n%10!=0)?" ":"")+units[n%10];
        }
        if(n<1000){
            return units[n/100] + " hundred" + ((n%100!=0)?" ":"") + convert(n%100);
        } 
        if(n<100000){
            return convert(n/1000) + " thousand"+((n%1000!=0)?" ":"") +convert(n%1000);
        }  
        return null;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String word = convert(num);
        System.out.println(word);
        

    }
}
