class Solution {
    // public int missingNumber(int[] nums) {
    //     HashSet<Integer> set=new HashSet<>();
    //     int len_nums=nums.length;
    //     for(int x:nums){
    //         set.add(x);
    //     }
    //     for(int i=0;i<len_nums;i++){
    //         if(!set.contains(i)){
    //             return i;
    //         }
    //     }
    //     return len_nums;
    // }
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]<nums.length){
                    int temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) return i;
        }
        return nums[nums.length-1]+1;
    }
}