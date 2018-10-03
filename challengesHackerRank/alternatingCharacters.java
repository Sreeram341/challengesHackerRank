package challengesHackerRank;

import java.util.*;

public class alternatingCharacters {

	static int alternatingCharacters(String s) {
		
		String [] splitString = s.split("");		
		Set<String> adjElem = new HashSet<String>(2);
		int cntr=0;
		for (int i=0;i<splitString.length;i++) {
			if(!adjElem.contains(splitString[i]) && adjElem.size()<2) {
				adjElem.add(splitString[i]);
			}
			else if(adjElem.size()==2) {adjElem.clear();adjElem.add(splitString[i]);}
			//System.out.println("After clear and add "+adjElem);
			else  {
				cntr+=1;
			}
		} 
		if (adjElem.size()==1)cntr+=1;
		return cntr;
    }
	
	public static void main(String[] args) {
		
		String s= "AAABBBAABB";
		//String s ="AABBCT";
		//String s ="BABA";
		//String s= "AAAAA";
		int result = alternatingCharacters(s);
		
		System.out.println(result);
		
	}

}
