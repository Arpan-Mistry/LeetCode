/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findTarget(int target,MountainArray arr,int s,int e,boolean asc){
        while(s<=e){
            int mid=(s+e)/2;
            if(arr.get(mid)<target){
                if(asc) s=mid+1;
                else e=mid-1;
            }
            else if(arr.get(mid)>target){
                if(asc) e=mid-1;
                else s=mid+1;
            }
            else return mid;
        }
        return -1;
    }
    
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int s=0;
        int e = mountainArr.length()-1;
        int peak=-1;
        while(s<=e){
            int mid=(s+e)/2;
            int mid_val = mountainArr.get(mid);
            int mid_r_val = mountainArr.get(mid+1);
            if(mid==0 && (mid_r_val>mid_val)){
               peak=mid+1;
                break;
            }
            int mid_l_val = mountainArr.get(mid-1);
            if(mid_r_val<mid_val && mid_l_val<mid_val){
            peak=mid;
            break;   
            }
            else if((mid_l_val < mid_val) && (mid_r_val > mid_val)) s=mid+1;
            else e=mid-1;
        }
        int left = findTarget(target,mountainArr,0,peak,true);
        int right = findTarget(target,mountainArr,peak+1,mountainArr.length()-1,false);
        if(left==-1||right==-1){
            return (left<right)?right:left;
        }
        else if(left<right) return left;
        else if(left>right) return right;
        return -1;
    }
}