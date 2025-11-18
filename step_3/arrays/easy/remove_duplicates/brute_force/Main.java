import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1; // pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // number of unique elements
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
