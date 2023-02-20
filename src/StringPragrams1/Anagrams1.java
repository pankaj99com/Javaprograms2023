package StringPragrams1;

import java.util.HashMap;
import java.util.Map;

public class Anagrams1 {

	public static boolean checkAnagrams(String s1, String s2) {

		// condition1

		if (s1.length() != s2.length())
			return false;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (int i = 0; i < s2.length(); i++) {

			char ch1 = s2.charAt(i);

			if (!map.containsKey(ch1))
				if (map.get(ch1) == 1)

					map.remove(ch1);

				else
					map.put(ch1, map.get(ch1) - 1);

			return false;
		}

		if (map.size() > 0) {
			return false;

		}

		System.out.println("anagrams");
		return true;

	}

	public static void main(String[] args) {
		checkAnagrams("silent", "listen");
	}

}
