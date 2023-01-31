// leetcode_arrays_268_[Missing number]

public class leetcode_arrays_268_Missing_number {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 5, 3, 4 };
        System.out.println(missingNumber(arr));
    }

    // method 1 (using cyclic sort)
    public static int missingNumber(int[] nums) {
        int i = 0, f = -1, c = 0;
        while (i < nums.length - 1) {
            f = nums[i];
            if (nums[i] > nums.length - 1) {
                i++;
            } else if (i == nums[i]) {
                i++;
            } else {
                int temp = nums[f];
                nums[f] = nums[i];
                nums[i] = temp;
            }
        }
        i = 0;
        while (i < nums.length) {
            if (i != nums[i]) {
                f = i;
            } else {
                c++;
            }
            i++;

            if (c == nums.length) {
                f = c;
            }
        }
        return f;
    }

    // method 2 (using basic maths)
    public static int missingNumber2(int[] nums) {

        int n = nums.length, totalsum = n * (n + 1) / 2; // sum of first n natural numbers
        for (int i : nums)
            totalsum -= i;
        return totalsum;
    }
}