
import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        int a, b, Sum;
        System.out.print("\n----Hello World----");
        System.out.println("\nMy name is Juno");
        System.out.print("\nEnter two number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        Sum = a + b;
        System.out.println("Number 1: " + a + "\nNumber 2: " + b);
        System.out.println("The Sum: " + Sum);
    }
}
