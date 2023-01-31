public class binary_search {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 2, 7, 11, 20, 29, 35, 50, 62 };
        int target = 29;
        int ans = index(arr, target);
        System.out.println(ans);
    }

    static int index(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (t < arr[mid]) {
                // start = 0;
                end = mid - 1;
            } else if (t > arr[mid]) {
                start = mid + 1;
                // end = arr.length - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}