import java.util.Scanner;

class ageLimitException extends Exception { // custom exception
    ageLimitException(String s) {
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

class exp {
    public static void age(int a) throws ageLimitException {
        if (a < 1 || a > 120) {
            throw new ageLimitException("[Invalid age....]");
        } else {
            System.out.println("[Displaying correct age]");
        }

    }
}

public class exceptions_custom_exception_throws {

    public static void main(String[] args) {
        int a;
        boolean flag = true;
        exp ob = new exp();
        Scanner sc = new Scanner(System.in);
        while (flag) {
            try {
                System.out.print("Please enter your age: ");
                a = sc.nextInt(); // exit program after enterring correct age else the program goes into an
                                  // infinite loop
                ob.age(a);
                flag = false;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}