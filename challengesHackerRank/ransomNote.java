package challengesHackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ransomNote {
	
	static void checkMagazine(String[] magazine, String[] note) {
		
		Hashtable<String, Integer> msg = new Hashtable<String,Integer>();
		Hashtable<String, Integer> checker = new Hashtable<String,Integer>();
		
		msg = convertArrToTabl(magazine);
		checker = convertArrToTabl(note);
		
		Boolean setVal = true;
		Enumeration<String> allVal = checker.keys();

		while(allVal.hasMoreElements() && setVal) {
			String checkVal=allVal.nextElement();	
			if(msg.containsKey(checkVal)) {
				if(checker.get(checkVal) <= msg.get(checkVal)) {}
				else {System.out.println("No"); setVal=false;}}
				else {System.out.println("No"); setVal=false;}
		}
		if (setVal==true)System.out.println("Yes");
    }
	
	static Hashtable<String, Integer> convertArrToTabl(String [] inpArr){
		Hashtable<String, Integer> rtrnTable = new Hashtable<String,Integer>();
			
			Arrays.stream(inpArr).forEach(val->{
				if(rtrnTable.containsKey(val) ) {
							int cVal =rtrnTable.get(val);
							rtrnTable.replace(val, cVal, cVal+1);}
					else {rtrnTable.put(val, 1);}
			});
		return rtrnTable;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		File inpFile = new File("C:\\Users\\spulavar\\Desktop\\input11.txt");
		Scanner scn = new Scanner(inpFile);
		
		int m = Integer.parseInt(scn.nextLine());
		int n = Integer.parseInt(scn.nextLine());

        String[] magazine = new String[m];        
        String[] magazineItems = scn.nextLine().split(" ");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];
        String[] noteItems = scn.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }
        checkMagazine(magazine, note);
        
        scn.close();
	}
	
}
