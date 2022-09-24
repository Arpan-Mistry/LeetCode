class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int[] arr = { -1, -1 };
        int i = 0;
        int j = 0;
        int pos = -1;
        if (nums.length == 0 || target < nums[s] || target > nums[e]) {
            return arr;
        } else {
            while (s <= e) {
                int mid = (s + e) / 2;
                if (target >= nums[mid]) {
                    if (target == nums[mid] && pos == -1) {
                        pos = mid;
                        System.out.println(pos);
                    }
                    s = mid + 1;
                } else if (target < nums[mid]) {
                    e = mid - 1;
                } else {
                    break;
                }
            }

            j = e;
            s = 0;
            e = pos - 1;

            while (s <= e) {
                int mid = (s + e) / 2;
                if (target > nums[mid]) {
                    s = mid + 1;
                } else if (target <= nums[mid]) {
                    e = mid - 1;
                } else {
                    break;
                }
            }
            i = s;
            if (pos != -1) {
                arr[0] = i;
                arr[1] = j;
            }
        }
        return arr;

    }
}