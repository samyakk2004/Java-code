import java.util.Scanner;
//import java.util.*;

class Array_Reverse {

    void reverse1(int[] arr, int r) {

        int[] a;
        a = new int[50];
        int i, j = 0;
        for (i = r - 1; i >= 0; i--) {
            a[j] = arr[i];
            j += 1;
        }
        for (j = 0; j < r; j++) {
            System.out.print(a[j] + " ");
        }
    }

    void reverse2(int arr[], int r) {
        int i, j = 1, t;
        for (i = 0; i <= r / 2; i++) {
            t = arr[i];
            arr[i] = arr[r - j];
            arr[r - j] = t;
            j += 1;
        }
        for (i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * static void reverse3(Integer arr[]) {
     * Collections.reverse(Arrays.asList(arr));
     * System.out.println("Reversed Array:" + Arrays.asList(arr));
     * }
     */

    public static void main(String[] args) {
        int r, i;
        int[] arr;
        arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of array: ");
        r = sc.nextInt();
        for (i = 0; i < r; i++) {
            arr[i] = sc.nextInt();
        }
        TestBin2 obj = new TestBin2();
        obj.reverse2(arr, r);
    }
}