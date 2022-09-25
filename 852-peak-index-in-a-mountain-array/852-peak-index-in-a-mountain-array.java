class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if((mid==0 && arr[mid]<arr[mid+1])||(mid == arr.length-1 && arr[mid-1]>arr[mid])){                  return mid+1;
            }
            else if(arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid]){
                s=mid+1;
            }
            else if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid]){
                e=mid-1;
            }
            else{
               return mid; 
            }
        }
        return -1;
    }
}