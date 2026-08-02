// Given an array of ints, return true if the array contains a 2 next to a 2 or
// a 4 next to a 4, but not both.
//
// either24([1, 2, 2]) → true
// either24([4, 4, 1]) → true
// either24([4, 4, 1, 2, 2]) → false

public class _15_either24 {

	public boolean either24(int[] nums) {
		boolean has22 = false;
		boolean has44 = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (!has22 && nums[i] == 2 && nums[i + 1] == 2)
				has22 = true;
			if (!has44 && nums[i] == 4 && nums[i + 1] == 4)
				has44 = true;
			if (has22 && has44)
				return false;
		}

		return (has22 || has44);
	}
}
