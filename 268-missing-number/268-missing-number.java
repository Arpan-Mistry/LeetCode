class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int len_nums=nums.length;
        for(int x:nums){
            set.add(x);
        }
        for(int i=0;i<len_nums;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return len_nums;
    }
}
    