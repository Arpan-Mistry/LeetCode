class Solution {
    public int[] findErrorNums(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     while(nums[i]!=i+1){
        //         if(nums[nums[i]-1]==nums[i]) break;
        //         int temp=nums[nums[i]-1];
        //         nums[nums[i]-1]=nums[i];
        //         nums[i]=temp;
        //     }
        // }
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                if(nums[nums[i]-1]!=nums[i]){
                     int temp=nums[nums[i]-1];
                     nums[nums[i]-1]=nums[i];
                     nums[i]=temp; 
                }
                else i++;   
            }
            else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) return new int[] {nums[i],i+1};
        }
        return new int[] {-1,-1};
    }
}