import java.util.Scanner;

class Recursion_Fibonacci {

    static int a, b = 0, c = 1;

    static void fibo(int r) {
        if (r > 0) {
            a = b + c;
            b = c;
            c = a;
            System.out.print(" " + a);
            fibo(r - 1);
        }
    }

    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        r = sc.nextInt();
        System.out.print("0 1");
        /*
         * for (i = 2; i <= r; i++) {
         * s = (i - 1) + (i - 2);
         * System.out.print(", " + s);
         * }
         */

        fibo(r - 2);
    }
}
