// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2,
// 5, 3, 6}. You may modify and return the given array, or return a new array.
//
// shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
// shiftLeft([1, 2]) → [2, 1]
// shiftLeft([1]) → [1]

public class _25_shiftLeft {

	public int[] shiftLeft(int[] nums) {
		int len = nums.length;

		if (len <= 1)
			return nums;

		int[] result = new int[len];

		for (int i = 0; i < len - 1; i++)
			result[i] = nums[i + 1];
		result[len - 1] = nums[0];

		return result;
	}
}
