package challengesHackerRank;

import java.util.*;

public class specialPalindromeAgain {

	static List<StringBuilder> combinationList = new ArrayList<StringBuilder>();
	static List<String[]> oldcombinationList = new ArrayList<String[]>();
	
	static long substrCount(int n, String s) {
		long retrncntr=0;
		generateCombinations("-",s);
		
		for (String[] allEntries:oldcombinationList) {
			System.out.println(Arrays.toString(allEntries));
			int leng = allEntries.length;
			int mid =-1;
			if(leng%2==0) {mid = leng/2;leng--;}
			else {mid=(leng/2)+1;leng--;}
			outerloop:
			for(int i=0;i<=leng;i++){
				//Set checkUniq = new HashSet (Arrays.asList(allEntries));
				//System.out.print(Arrays.toString(allEntries));System.out.print("--"+checkUniq);
				if(i==mid)break outerloop;
				//System.out.format("%s,%s,%s\n",allEntries[i],"--",allEntries[leng-i]);
				else if(allEntries[i]==allEntries[leng-i]) {
					cntr++;
				}else {
					break outerloop;
				}
			}
		}
		return retrncntr;
    }
		 
	 static void generateCombinations(String prefix, String s) {
		 for (int i = 0; i < s.length(); i++) generateCombinations(prefix + s.charAt(i), s.substring(i + 1));		
		 oldcombinationList.add(prefix.replace("-", "").split(""));
	 } 
	
	public static void main(String[] args) {
		
		String s ="abcbaba";
		int n = 7;
		long result = substrCount(n, s);
		System.out.println(result);
	}
}
