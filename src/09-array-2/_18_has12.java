// Given an array of ints, return true if there is a 1 in the array with a 2
// somewhere later in the array.
//
// has12([1, 3, 2]) → true
// has12([3, 1, 2]) → true
// has12([3, 1, 4, 5, 2]) → true

public class _18_has12 {

	public boolean has12(int[] nums) {
		boolean has1 = false;

		for (int num : nums) {
			if (!has1 && num == 1)
				has1 = true;
			if (has1 && num == 2)
				return true;
		}

		return false;
	}
}
