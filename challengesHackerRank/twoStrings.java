package challengesHackerRank;

import java.util.Arrays;
import java.util.Hashtable;

public class twoStrings {

	@SuppressWarnings({ "unlikely-arg-type", "null" })
	static String twoStrings(String s1, String s2) {

		String[] spltStrArr;
		Hashtable<String, Integer> mappedStr = new Hashtable<String, Integer>();

		if (s1.length() < s2.length()) {
			spltStrArr = new String[s1.split("").length];
			spltStrArr = s1.split("");
			Arrays.stream(s2.split("")).forEach(val -> {
				mappedStr.put(val, 1);
			});

		} else {
			spltStrArr = new String[s2.split("").length];
			spltStrArr = s2.split("");
			Arrays.stream(s1.split("")).forEach(val -> {
				mappedStr.put(val, 1);
			});
		}
		Boolean finalRes = false;		
		outerloop:
		for(String spltdVal : spltStrArr) {
				if(mappedStr.keySet().contains(spltdVal)) {
					finalRes =true;
					break outerloop;
				}
			}
		
		if (finalRes == false)return "NO";
		else return "YES";
	}

	public static void main(String[] args) {
		String s1 = "hi";
        String s2 = "world";
		System.out.println(twoStrings(s1, s2));
	}

}
