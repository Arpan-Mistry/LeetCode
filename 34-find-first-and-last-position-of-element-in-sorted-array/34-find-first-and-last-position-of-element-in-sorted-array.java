class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = { -1, -1 };
        if (nums.length == 0) {
            return arr;
        }
        int s = 0;
        int e = nums.length - 1;
        int i;
        int j;
        int pos = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (target >= nums[mid]) {
                if (pos == -1 && target == nums[mid]) {
                    pos = mid;
                    System.out.println(pos);
                }
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
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
            }
        }
        i = s;
        if (pos != -1) {
            arr[0] = i;
            arr[1] = j;
        }
        return arr;

    }
}