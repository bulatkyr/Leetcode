class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        
        
        int idx = -1;
        while(low < high) {
            int mid = (low + high)/2;
            
            if(target < nums[mid]) {
                high = mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                idx = mid;
                break;
            }
        }
        if(idx != -1) {
            int firstIdx = idx;
            while (firstIdx > 0) {
                if(nums[firstIdx - 1] == target) {
                    firstIdx--;
                } else {
                    break;
                }
            }
            int secondIdx = idx;
            while (secondIdx < nums.length - 1) {
                if(nums[secondIdx + 1] == target) {
                    secondIdx++;
                } else {
                    break;
                }
            }
            
            return new int[]{ firstIdx, secondIdx };
        } else {
            return new int[] {-1, -1};
        }
        
    }
}