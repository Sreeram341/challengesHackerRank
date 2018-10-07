package challengesHackerRank;

import java.util.*;

public class specialPalindromeAgain {
	static List<String[]> oldcombinationList = new ArrayList<String[]>();
	
	static long substrCount(int n, String s) {
		long retrncntr=0; 
		generateCombinations("-",s);
		
		for (String[] allEntries:oldcombinationList) {
			
			int leng = allEntries.length;
			int mid =-1;
			int cntr=0;
			if(leng%2==0) {mid = leng/2;leng--;}
			else {mid=(leng/2)+1;leng--;}
			
			if(leng>1) {
				outerloop:
				for(int i=0;i<=leng;i++){
					if(i==mid)break outerloop;
					else if(allEntries[i].equals(allEntries[leng-i])) {
						//System.out.format("%s%s%s\n",allEntries[i],"--",allEntries[leng-i]);
						cntr++;
					}else {
						break outerloop;
						}
					}
			}
			else if(leng==0) {retrncntr++;}
			if(mid==cntr) {
				System.out.println(Arrays.toString(allEntries)); 
			//	System.out.format("\n%d%s%d\n",mid,"-Inside-",cntr);
				retrncntr++;
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
