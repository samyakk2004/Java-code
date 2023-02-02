//Lambda expression (Can be cast/used only to functional interfaces)

import java.util.Scanner;

@FunctionalInterface
interface test {
    int meth1(int a, int b);
}

public class lamda_expression {
    public static void main(String[] args) {
        test ob = (int a, int b) -> {
            // overriding meth1() from test interface
            int s;
            s = a + b;
            return s;
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        System.out.print("=> ");
        int a = sc.nextInt();
        System.out.print("=> ");
        int b = sc.nextInt();
        System.out.println(ob.meth1(a, b));
    }
}