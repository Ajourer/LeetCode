// Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]

class Solution {
	public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int length = nums.length;
        if (length == 0)
        	return result;
        int rangeStart = nums[0];
        for (int i = 0; i < length; i++) {
        	if (i == length - 1 || nums[i] + 1 != nums[i + 1]) {
        		if (nums[i] != rangeStart)
        			result.add(rangeStart + "->" + nums[i]);
        		else
        			result.add(rangeStart + "");
        		if (i != length - 1)
        			rangeStart = nums[i + 1];
        	}
        }
        return result;
    }
}