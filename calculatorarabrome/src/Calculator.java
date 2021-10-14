import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static int x, y;
    static char op;
    static int res;

    public static void main (String[] args) {
        String userInput = scanner.nextLine();
        char[] under_char = new char[10];
        for (int i = 0; i < userInput.length(); i++) {
            under_char[i] = userInput.charAt(i);
            if (under_char[i] == '+') {
                op = '+';
            }
            if (under_char[i] == '-') {
                op = '-';
            }
            if (under_char[i] == '*') {
                op = '*';
            }
            if (under_char[i] == '/') {
                op = '/';
            }
        }
        String under_charString = String.valueOf(under_char);
        String[] blacks = under_charString.split("[+-/*]");
        String stable00 = blacks[0];
        String stable01 = blacks[1];
        String string03 = stable01.trim();
        Arab b = new Arab();
        x = b.romanToNumber(stable00);
        y = b.romanToNumber(string03);
        if (x < 0 && y < 0) {
            res = 0;
        } else {
            Calculated a = new Calculated();
            res = a.calculated(x, y, op);
            Roman convertArabToRome = new Roman();
            String resultRoman = convertArabToRome.convertNumToRoman(res);
            System.out.println(resultRoman);
        }
        x = Integer.parseInt(stable00);
        y = Integer.parseInt(string03);
        Calculated c = new Calculated();
        res = c.calculated(x, y, op);
        System.out.println(res);
    }
}

