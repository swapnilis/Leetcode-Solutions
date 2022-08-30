class Solution {
    public boolean canJump(int[] nums) {
        boolean bool=true;
        int last = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
           if(nums[i]>= last-i){
               last = i;
               bool=true;
           }
           else{
                 bool=false;
           }
    }
        return bool;
        
    }
}