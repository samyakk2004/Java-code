import java.util.Scanner;

public class Recursion_Fibonacci_nthTerm {

    static int fibo(int r) {
        if (r == 1 || r == 2) {
            return r - 1;
        } else {
            return fibo(r - 1) + fibo(r - 2);
        }
    }

    public static void main(String[] args) {
        int r, i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        r = sc.nextInt();
        for (i = 1; i <= r; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println("\nEnter term:");
        n = sc.nextInt();
        System.out.println("Requested term: " + fibo(n));
    }
}
