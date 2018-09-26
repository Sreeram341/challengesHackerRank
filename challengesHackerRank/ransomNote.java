package challengesHackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ransomNote {
	
	static void checkMagazine(String[] magazine, String[] note) {
		
		Hashtable<String, Integer> msg = new Hashtable<String,Integer>();
		Hashtable<String, Integer> checker = new Hashtable<String,Integer>();
		
		Arrays.stream(magazine).forEach(e->{
			msg.put(e, 1);
		});
	
		Arrays.stream(note).forEach(not->{			
			if(msg.containsKey(not) ) {
				if(checker.containsKey(not)) {
						int cVal =checker.get(not);
						checker.replace(not, cVal, cVal+1);
					}
				else {checker.put(not, 1);}
			}
		});
		
		if(note.length == checker.size()) {
			System.out.println("Yes");
		}
		else {
			System.out.println(checker);
			System.out.format("%d,%d\n",note.length,checker.size());
			System.out.println("No");
		}
    }

	public static void main(String[] args) throws FileNotFoundException {
		
		File inpFile = new File("C:\\Users\\sreer\\Desktop\\problemInput\\input19.txt");
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
