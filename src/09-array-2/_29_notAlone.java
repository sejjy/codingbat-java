// We'll say that an element in an array is "alone" if there are values before
// and after it, and those values are different from it. Return a version of the
// given array where every instance of the given value which is alone is
// replaced by whichever value to its left or right is larger.
//
// notAlone([1, 2, 3], 2) → [1, 3, 3]
// notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
// notAlone([3, 4], 3) → [3, 4]

public class _29_notAlone {

	public int[] notAlone(int[] nums, int val) {
		int len = nums.length;
		int[] res = new int[len];

		for (int i = 0; i < len; i++) {
			if (nums[i] == val && i > 0 && i + 1 < len) {
				int prev = nums[i - 1];
				int next = nums[i + 1];

				if ((prev != val) && (next != val)) {
					res[i] = Math.max(prev, next);
					continue;
				}
			}

			res[i] = nums[i];
		}

		return res;
	}
}
