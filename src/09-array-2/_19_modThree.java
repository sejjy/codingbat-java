// Given an array of ints, return true if the array contains either 3 even or 3
// odd values all next to each other.
//
// modThree([2, 1, 3, 5]) → true
// modThree([2, 1, 2, 5]) → false
// modThree([2, 4, 2, 5]) → true

public class _19_modThree {

	public boolean modThree(int[] nums) {
		int evenStreak = 0;
		int oddStreak = 0;

		for (int num : nums) {
			if (num % 2 == 0) {
				evenStreak++;
				oddStreak = 0;
			} else {
				oddStreak++;
				evenStreak = 0;
			}
			if (evenStreak == 3 || oddStreak == 3)
				return true;
		}

		return false;
	}
}
