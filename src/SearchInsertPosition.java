public class SearchInsertPosition {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int start=0, mid;
            int end=nums.length-1;
           while (start<=end){
               mid=((start+end)/2)+ end;

               if(nums[mid]==target){
                   return mid;
               }
               if(nums[mid]> target){ start=mid-1;}


               else {end=mid=+1;}


           }
            return end;



        }
    }

    class Solution2 {
        public int searchInsert(int[] nums, int target) {
            int low = 0, high = nums.length - 1, mid;
            while (low <= high) {
                mid = ((high - low) / 2) + low;
                if (nums[mid] == target) { return mid; }
                if (nums[mid] > target) { high = mid - 1; }
                else { low = mid + 1; }
            }
            return low;
        }
    }
}
