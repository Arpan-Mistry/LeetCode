class Solution {
    public int BinarySearch(int[] nums,int s,int e,int target){
        while(s<=e){
            int mid=(s+e)/2;
            if(target>nums[mid]) s=mid+1;
            else if (target<nums[mid]) e=mid-1;
            else return mid;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int e = nums.length-1;
        if(e==0){
            if(nums[0]==target) return 0;
            return -1;
        }
        int s = 0;
        int rmax= nums[e];
        int rot = -1;
        int mid = -1;
        while(s<=e){
            mid=(s+e)/2;
            if( (mid==0 && nums[mid+1]>nums[mid]) || mid==e) break;
            else if(nums[mid]>rmax) s=mid+1;
            else if((nums[mid]<nums[mid-1]) && (nums[mid]<nums[mid+1])) break;
            else e=mid-1;
        }
        s = mid;
        int right = BinarySearch(nums,s,nums.length-1,target);
        int left = BinarySearch(nums,0,s-1,target);
        return left<=right ? right:left;
    }
}