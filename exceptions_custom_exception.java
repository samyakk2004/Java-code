import java.util.Scanner;

class ageLimitException extends Exception {
    ageLimitException(String s) {
        System.out.println();
        System.out.println(super.toString() + ": " + s);
    }

    @Override
    public String toString() {
        return "[Enter correct age]";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class exceptions_custom_exception {
    public static void main(String[] args) {
        int a;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.print("Please enter your age: ");
            a = sc.nextInt();
            if (!(a >= 1 && a <= 120)) {
                try {
                    throw new ageLimitException("[IRRELEVANT AGE....]");
                } catch (Exception e) {
                    System.out.println("----------------------------------------");
                    System.out.println(e.toString());
                    flag = true;
                }
            } else {
                System.out.println("Correct age");
                flag = false;
            }
        }

    }
}