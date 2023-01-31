/*
 * 
 * *
 * * *
 * * * *
 */

import java.util.Scanner;

class Recursion_Pattern {

    static int i;

    static void pat(int n) {
        if (n > 0) {
            pat(n - 1);
            for (i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for pattern: ");
        r = sc.nextInt();
        pat(r);
    }
}
