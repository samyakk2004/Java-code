import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int value = arr[index] - 1;
            if (index == value) {
                index++;
            } else {
                int temp = arr[value];
                arr[value] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
