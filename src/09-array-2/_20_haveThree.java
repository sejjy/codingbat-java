// Given an array of ints, return true if the value 3 appears in the array
// exactly 3 times, and no 3's are next to each other.
//
// haveThree([3, 1, 3, 1, 3]) → true
// haveThree([3, 1, 3, 3]) → false
// haveThree([3, 4, 3, 3, 4]) → false

public class _20_haveThree {

	public boolean haveThree(int[] nums) {
		int count3 = 0;
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			int next = i + 1;

			if (nums[i] == 3) {
				if (next < length && nums[next] == 3)
					return false;
				count3++;
			}
		}

		return count3 == 3;
	}
}
