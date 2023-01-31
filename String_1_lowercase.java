import java.util.Scanner;

public class String_1_lowercase {
    static String low(String s) {
        int i;
        String s1 = "";
        char ch;
        s1 = s1 + s.charAt(0);
        for (i = 1; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((int) ch + 32);
            }
            s1 = s1 + ch;
        }
        return s1;
    }

    static String space(String s) {
        s = low(s);
        int i;
        String s1 = "";
        char ch;
        for (i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == ' ') {
                ch = '_';
            }
            s1 = s1 + ch;
        }
        return s1;
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        s = sc.nextLine();
        System.out.println("In Lowercase: " + low(s));
        System.out.println("Space replaced with underscores: " + space(s));
    }
}
