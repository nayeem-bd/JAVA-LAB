package labprac;

import java.util.Scanner;
// count number of vowel ,consonant,special and numeric
class CharCheck {

    public String classifyChar(char a) {
        if (a == ' ') {
            return "space";
        }
        if (a >= 'a' && a <= 'z') {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                return "vowel";
            } else {
                return "consonant";
            }
        } else if (a >= '0' && a <= '9') {
            return "numeric";
        }
        return "special";
    }
}

public class Question6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Stirng :");
        String sk = input.nextLine();
        String sp = sk.toLowerCase();
        int v = 0, c = 0, n = 0, s = 0;
        CharCheck charCheck = new CharCheck();
        for (int i = 0; i < sp.length(); i++) {
            String pp = charCheck.classifyChar(sp.charAt(i));
            switch (pp) {
                case "vowel":
                    v++;
                    break;
                case "consonant":
                    c++;
                    break;
                case "numeric":
                    n++;
                    break;
                case "special":
                    s++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Number of Vowel : " + v);
        System.out.println("Number of Consonant : " + c);
        System.out.println("Number of Numeric : " + n);
        System.out.println("Number of Special : " + s);
    }
}
