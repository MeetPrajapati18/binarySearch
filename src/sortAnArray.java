import java.util.Arrays;

public class sortAnArray {
    public static void main(String[] args) {
        int [] arr = {5,9,2,2,3,3,4,4,4,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sortArray(int [] nums){
        Arrays.sort(nums);
        return nums;
    }

    /*
     * class Solution {
     *     public int[] sortArray(int[] nums) {
     *         if (nums == null || nums.length <= 1) {
     *             return nums;
     *         }
     *         mergeSort(nums, 0, nums.length - 1);
     *         return nums;
     *     }
     *
     *     private void mergeSort(int[] nums, int left, int right) {
     *         if (left < right) {
     *             int mid = left + (right - left) / 2;
     *             mergeSort(nums, left, mid);
     *             mergeSort(nums, mid + 1, right);
     *             merge(nums, left, mid, right);
     *         }
     *     }
     *
     *     private void merge(int[] nums, int left, int mid, int right) {
     *         int n1 = mid - left + 1;
     *         int n2 = right - mid;
     *
     *         int[] leftArray = new int[n1];
     *         int[] rightArray = new int[n2];
     *
     *         for (int i = 0; i < n1; i++) {
     *             leftArray[i] = nums[left + i];
     *         }
     *         for (int j = 0; j < n2; j++) {
     *             rightArray[j] = nums[mid + 1 + j];
     *         }
     *
     *         int i = 0, j = 0, k = left;
     *         while (i < n1 && j < n2) {
     *             if (leftArray[i] <= rightArray[j]) {
     *                 nums[k] = leftArray[i];
     *                 i++;
     *             } else {
     *                 nums[k] = rightArray[j];
     *                 j++;
     *             }
     *             k++;
     *         }
     *
     *         while (i < n1) {
     *             nums[k] = leftArray[i];
     *             i++;
     *             k++;
     *         }
     *
     *         while (j < n2) {
     *             nums[k] = rightArray[j];
     *             j++;
     *             k++;
     *         }
     *     }
     * }
     */

}
