package challengesHackerRank;

import java.util.*;

public class makingAnagrams {

	static int makeAnagram(String a, String b) {
		
		List<String> set1 = new ArrayList<String>();
		set1.addAll(Arrays.asList(a.split("")));
		ArrayList<String>set2 = new ArrayList<String>();
		set2.addAll(Arrays.asList(b.split("")));
		set1.retainAll(set2);
		set2.retainAll(set1);		
		stringCounterMap set1Map=new stringCounterMap();
		stringCounterMap set2Map=new stringCounterMap();		
		set1.stream().forEach(e->{
			set1Map.addOrReplace(e);
		});		
		set2.stream().forEach(e->{
			set2Map.addOrReplace(e);
		});	
		int cntr=0;
		Set<String>interKeys= set1Map.keySet();
		for(String key : interKeys) {
			if( set1Map.get(key) < set2Map.get(key) ){
				cntr += set2Map.get(key)-set1Map.get(key);
			}
			else if( set1Map.get(key) > set2Map.get(key) ){
				cntr += set1Map.get(key)-set2Map.get(key);
			}
		}
		 if(set1.size()==0&&set2.size()==0) {
	            return    a.length()+b.length();
	        }
		return	((a.length()-set1.size())+(b.length()-set2.size())+cntr);		
    }
	
	public static void main(String[] args) {
		
		String a="showman"; 
		String b="woman";
		int res = makeAnagram(a, b);
		
		System.out.println(res);
	}

}
