package BinarySearch;

public class Solution {

    public static void main (String[] args) {
        int[] nums = {2, 5, 12, 13, 14, 22, 35, 36, 123, 432, 564, 1002};
        System.out.println(search(nums, 432));
        System.out.println(search(nums, 17));
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1; 
            } else {
                return mid;
            }
        }
        return -1;
    }
}
