public class TwoSum {


    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int []pos=new int[2];

            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j <nums.length ; j++) {

                    if(nums[i]+nums[j]==target) {
                        pos[0]=i;
                        pos[i]=j;
                    }

                }

            }
            return pos;


        }
    }





    class sol2{
        public int[] twosum(int[] nums, int target){
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j <nums.length ; j++) {
                    if (nums[j]==target-nums[i]){
                        return new int[]{i,j};
                    }

                }

            }
            return null;
        }
    }
}
