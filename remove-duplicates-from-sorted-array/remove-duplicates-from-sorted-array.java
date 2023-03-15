class Solution {
    public int removeDuplicates(int[] nums) {
         int count=0;
        int pointer=0;
      for(int i =0;i<nums.length-1;i++){
          if(nums[i]==nums[i+1]){
              count++;
          }else{
              nums[++pointer]=nums[i+1];
          }
      }
        

      return nums.length-count;
        
    }
}