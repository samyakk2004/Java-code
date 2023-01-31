import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int ch, a, b, p, l, i, j, r, sum = 0, k = 1;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n1. Sum\n2. Product\n3. Array");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("Enter 2 numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                sum = a + b;
                System.out.println(sum);
                break;
            }

            case 2: {
                System.out.println("Enter 2 numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                p = a * b;
                System.out.println(p);
                break;
            }

            case 3: {
                arr = new int[50];
                l = arr.length;
                System.out.println("Enter the elements in an array");
                r = sc.nextInt();
                for (i = 0; i < r; i++) {
                    System.out.print("Element " + (k++) + ":");
                    arr[i] = sc.nextInt();
                }
                for (i = 0; i < r; i++) {
                    sum = sum + arr[i];
                }
                System.out.println("Length: %d" + l);
                System.out.println("Sum : %d" + sum);
                break;
            }

            default: {
                System.out.println("Invalid");
                break;
            }

        }
    }
}
