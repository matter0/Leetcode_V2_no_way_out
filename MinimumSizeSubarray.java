 public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1){
            return nums[0] >= target ? 1 : 0;
        }
        int i=0;
        int j=1;
        int currMin=1000000;
        int currSum=nums[i]+nums[j];
        for(int k=0;k<nums.length;k++){
            if(nums[k] >= target){
                return 1;
            }
        }
        while(i < j && j < nums.length){
            if(currSum >=target){
                currMin=Math.min(currMin,j-i+1);
                currSum-=nums[i];
                i++;
            }
            else  {
                if(j == nums.length-1){
                    break;
                }
                j++;
                currSum+=nums[j];
            }
        }
        return currMin == 1000000 ? 0 : currMin;
    }
