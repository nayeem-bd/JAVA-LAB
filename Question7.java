
package labprac;

class Palindrome {
    boolean isPalindrome(int n){
        int tmp = n,n_val=0;
        while(tmp>0){
            n_val = n_val*10 + tmp%10;
            tmp /= 10;
        }
        return n_val == n;
    }
}


public class Question7 {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        for(int i=1;i<=9999999;i++){
            if (palindrome.isPalindrome(i)) {
                System.out.println(i);
            }
        }
           
    }
}