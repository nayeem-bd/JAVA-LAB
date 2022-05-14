package labprac;
// Pronic Number
class Pronic {
    public static boolean isPronicNumber(int n){
        int sq = (int) Math.sqrt(n);
        return sq*(sq+1) == n;
    }
}

public class Question3{
    public static void main(String[] args) {
        int i,j;
        System.out.println("All Pronic Number (1-100)");
        Pronic pronic = new Pronic();
        for(i=1;i<=100;i++){
            if(Pronic.isPronicNumber(i))
                System.out.println(i);
        }
        
    }
}
