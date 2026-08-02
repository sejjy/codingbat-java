// Given an array of ints, return true if every 2 that appears in the array is
// next to another 2.
//
// twoTwo([4, 2, 2, 3]) → true
// twoTwo([2, 2, 4]) → true
// twoTwo([2, 2, 4, 2]) → false

public class _21_twoTwo {

	public boolean twoTwo(int[] nums) {
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			if (nums[i] == 2) {
				boolean hasPrev2 = i > 0 && nums[i - 1] == 2;
				boolean hasNext2 = i + 1 < length && nums[i + 1] == 2;

				if (!hasPrev2 && !hasNext2)
					return false;
			}
		}

		return true;
	}
}
