package challengesHackerRank;
import java.util.*;

public class sherlockAndValidString {

	static String isValid(String s) {
		String retStr ="";
		stringCounterMap scm =new stringCounterMap();
		String [] splitIt = s.split("");
		
		Arrays.stream(splitIt).forEach(e->{
			scm.addOrReplace(e);
		});
		int min=-1;
		
		for(int val : scm.values()) {
			if(min==-1) {min = val;}
			else if(val<min) {min =val;}
		}
		
		List<Integer> cmnNumb = new ArrayList<Integer>(scm.values());  
		stringCounterMap scm2 =new stringCounterMap();
		
		cmnNumb.stream().forEach(e->{
			scm2.addOrReplace(e.toString());			
		});
		//System.out.println(scm);//System.out.println(scm2);
		if(scm2.size()==2) {
			if(scm2.containsKey("1")&&scm2.get("1")==1) { retStr="YES";}
			else if(scm2.containsKey("3")&&scm2.get("3")==1) { retStr="YES";}
			else{retStr="NO";}
		}
		else {
			int cntr =0;
		for(int val : scm.values()) {
			if(cntr>1) {  retStr="NO";}
			else { cntr+= (val-min);}
			}
		if(retStr.equals("")&&cntr<2) retStr="YES";
		else retStr="NO";
		}
		
		

		return retStr;
    }
	
	public static void main(String[] args) {
		
		String s ="abbccc";
		String ss ="aaaaabc";
		String a = "abcdefghhgfedecba";
		
		String ssr = "aabbcd";
		
		String result = isValid(s);
		//String result2 = isValid(a);
		//String result3 = isValid(ss);
		
		String result34 = isValid(ssr);
		
		
		System.out.println(result);
		//System.out.println(result2);
		//System.out.println(result3);
		
	}

}
