import java.util.Scanner;

class Array2D {
    public static void main(String[] args)

    {
        int i, j;
        int[][] arr;
        arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < arr.length; i++) {
            // arr[i] = sc.nextInt();
            for (j = 0; j < arr[i].length; j++) {
                // arr[j] = sc.nextInt();
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}