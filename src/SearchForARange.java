/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].

 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * 
 * @author 文超
 * @date 2015-11-11
 * TODO https://leetcode.com/problems/search-for-a-range/
 *
 */
public class SearchForARange {

	//try git new branch and merge branch
	//今天心情很不好。不写了。
	public int[] searchRange(int[] nums,int target){
		int[] ret = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid;
        }
        int low;
        if (nums[start] != target)
            return ret;
        else
            low = start;
        start = 0;
        end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target + 1)
                start = mid + 1;
            else
                end = mid;
        }
        int high = nums[start] == target ? start : start - 1;
        ret[0] = low;
        ret[1] = high;
        return ret;
	}
}
