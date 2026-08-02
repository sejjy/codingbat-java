// Return the sum of the numbers in the array, except ignore sections of numbers
// starting with a 6 and extending to the next 7 (every 6 will be followed by at
// least one 7). Return 0 for no numbers.
//
// sum67([1, 2, 2]) → 5
// sum67([1, 2, 2, 6, 99, 99, 7]) → 5
// sum67([1, 1, 6, 7, 2]) → 4

public class _05_sum67 {

	public int sum67(int[] nums) {
		int sum = 0;
		boolean is67 = false;

		for (int num : nums) {
			if (!is67 && num == 6) {
				is67 = true;
				continue;
			}
			if (is67) {
				if (num == 7)
					is67 = false;
				continue;
			}

			sum += num;
		}

		return sum;
	}
}
