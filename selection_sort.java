import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 20, 11, -5, 0, 4, 5, 78, 7, 8, 9, 10 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    // function for insertion sort
    static void insertion(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int start = 0;
            int max = maxindex(arr, start, last); // recieving the max element
            swap(arr, max, last); // swapped elements in array
        }
    }

    // function for max index
    static int maxindex(int[] arr, int start, int last) {
        int max = 0;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // function for swapping
    static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
