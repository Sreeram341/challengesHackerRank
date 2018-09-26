package challengesHackerRank;

import java.util.Arrays;
import java.util.Hashtable;

public class twoStrings {

	static String twoStrings(String s1, String s2) {
		
		String [] spltStrArr;
		Hashtable<String, Integer> mappedStr = null;
		
		
		if(s1.length()<s2.length()) {
			spltStrArr = new String[s1.split("").length] ;	
			spltStrArr = s1.split("");  
			Arrays.stream(s2.split("")).forEach(val->{
				mappedStr.put(val, 1);
			});
			
		}
		else {
			spltStrArr = new String[s2.split("").length] ;	
			spltStrArr = s2.split("");
			Arrays.stream(s1.split("")).forEach(val->{
				mappedStr.put(val, 1);
			});
		}
		
		Arrays.stream(spltStrArr).forEach(spltdVal->{
			
		});
		
		
		return s2;
    }

	
	public static void main(String[] args) {
		
		
	}

}
