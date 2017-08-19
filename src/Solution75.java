/**
 * Created by _xiaoxiao7 on 2017/8/19.
 */
class Solution75 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        for (int i = low; i <= high;i++) {
            while (nums[i] == 2 && i < high) swap(nums, i, high--);
            while (nums[i] == 0 && i >low) swap(nums, i, low++);
        }
        return;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        return;
    }
}