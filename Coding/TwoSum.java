class TwoSum{
    public int[] twoSum(int[] nums, int target){

        int left = i + 1;
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == target){
                return new int[]{i, left, right};
            
            }else if(sum  < target){
                left++;
            }
            else{
                right--;
            }
        } 
        return new int[]{-1, -1, -1};
    }
if(gyg)