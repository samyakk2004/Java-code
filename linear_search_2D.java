
import java.util.Scanner;

public class linear_search_2D {

    public static void main(String[] args) {
        int r, c, i, j, t;
        int[][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.printf("Row %d column %d: ", i, j);
                arr[i][j] = sc.nextInt();
                System.out.println();
            }
        }

        System.out.println("Enter element to be searched: ");
        t = sc.nextInt();

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == t) {
                    System.out.printf("[%d, %d]", i, j);
                    break;
                }
            }
        }
    }

}
