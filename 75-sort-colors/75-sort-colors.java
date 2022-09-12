class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;

        for (int num : nums) {
            if (num == 0) zero++;
            if (num == 1) one++;
        }
       for(int i =0;i<zero;i++){
           nums[i]=0;
       }
        for(int i =zero;i<(one+zero);i++){
            nums[i]=1;
        }
        for(int i =(one+zero);i< nums.length;i++){
            nums[i]=2;
        }
        
        
    }
}