class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> lst= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i+1){
                if(nums[nums[i]-1] == nums[i]) break;
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1) lst.add(nums[i]);
        }
        return lst;
    }
}