package challengesHackerRank;

import java.util.*;

public class specialPalindromeAgain {
	static List<String> combinationList = new ArrayList<String>();
	
	static long substrCount(int n, String s) {
		long retrncntr=0;
		
		generateCombinations("",s);
		
		System.out.println(combinationList);

		return retrncntr;
    }
	
	 static void generateCombinations(String prefix, String s) {  	
		 
		 for (int i = 0; i < s.length(); i++) generateCombinations(prefix + s.charAt(i), s.substring(i + 1));
		 combinationList.add(prefix);
	 } 
	
	public static void main(String[] args) {
		
		String s ="abcbaba";
		int n = 7;
		long result = substrCount(n, s);
		System.out.println(result);
	}
}
