import java.util.ArrayList;

// leetcode_arrays_448_[Find All Numbers Disappeared in an Array]

public class TestBin2 {
    public static void main(String... args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int c, i = 0, j = 0, s;
        // putting 1 of the duplicates in correct place
        for (i = 0; i < nums.length; i++) {
            s = nums[i];
            c = 0;
            for (j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
            if (c > 1) {
                int temp = nums[i];
                nums[i] = nums[s - 1];
                nums[s - 1] = temp;
            }
        }

        i = 0;
        j = 0;
        // main loop for sorting
        while (i < nums.length - 1) {
            s = nums[i];
            if (nums[i] == nums[s - 1]) { // check for duplicate
                i++;
            } else if (nums[i] != nums[s - 1]) {
                int temp = nums[i];
                nums[i] = nums[s - 1];
                nums[s - 1] = temp;
            }
        }

        // returning the non present elements
        for (i = 0; i < nums.length; i++) {
            s = nums[i];
            if (nums[i] != nums[s - 1]) {
                return i + 1;
            }
        }

        return -1;
    }
}