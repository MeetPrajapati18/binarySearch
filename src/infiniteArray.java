public class infiniteArray {
    public static void main(String[] args) {
        int [] arr = {3,5,7,9,10,90,
                100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int [] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeOfBox * 2
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }


    static int binarySearch(int[]nums, int target, int start, int end){

        while (start <= end){
            //int mid = (start + end) / 2; // might be possible that stat + end exceed the range
            int mid = start + (end - start) / 2;

            if (target <  nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else if (target == nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}
