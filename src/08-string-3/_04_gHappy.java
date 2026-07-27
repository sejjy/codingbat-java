// We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
// immediately to its left or right. Return true if all the g's in the given
// string are happy.
//
// gHappy("xxggxx") → true
// gHappy("xxgxx") → false
// gHappy("xxggyygxx") → false

public class _04_gHappy {

	public boolean gHappy(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.startsWith("g", i))
				if (!str.startsWith("g", i - 1) && !str.startsWith("g", i + 1))
					return false;
		}

		return true;
	}
}
