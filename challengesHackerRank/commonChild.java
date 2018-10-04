package challengesHackerRank;

import java.io.*;
import java.util.*;

public class commonChild {

	 public int commonChild(String s1, String s2) {
		 	unsortedUniqueList firstStrList = new unsortedUniqueList() ;
		    generateCombinations("",s1,firstStrList);
		    unsortedUniqueList secondStrList = new unsortedUniqueList() ;
		    generateCombinations("",s2,secondStrList);
		    firstStrList.retainAll(secondStrList);
		    int maxLeng = 1;
		    for(String e: firstStrList) {
		    	if (e.length() > maxLeng) maxLeng =e.length();
		    };
		    if (maxLeng>1) return maxLeng;
		    else 	return 0;
	    }
	 
	 static void generateCombinations(String prefix, String s,unsortedUniqueList UUL) {  	
		  for (int i = 0; i < s.length(); i++) generateCombinations(prefix + s.charAt(i), s.substring(i + 1),UUL);
	        UUL.addInto(prefix);
	 }  
	
	public static void main(String[] args) throws IOException {
		commonChild cc= new commonChild();
		File inp = new File("C:\\Users\\sreer\\Desktop\\problemInput\\input09.txt");
		@SuppressWarnings("resource")
		BufferedReader bis = new BufferedReader(new FileReader(inp));		
		String s1 =bis.readLine();
		String s2 =bis.readLine();
		int result = cc.commonChild(s1, s2);
		System.out.println(result);
	}
	
	class unsortedUniqueList extends ArrayList<String>{
		private static final long serialVersionUID = 1L;
		public unsortedUniqueList() {}
		 public void addInto(String inpArr){
			 if(!this.contains(inpArr)) this.add(inpArr);		 
		 }
	 }

}
