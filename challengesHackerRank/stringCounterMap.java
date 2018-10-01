package challengesHackerRank;

import java.util.*;

public class stringCounterMap extends HashMap<String,Integer> {
	private static final long serialVersionUID = 1L;

	public stringCounterMap() {
		
	}
	public void addOrReplace(String elem) {
		if (!this.containsKey(elem)) {
			this.put(elem, 1);
		}
		else {
			int currVal = (int) this.get(elem);
			this.replace(elem, currVal, currVal+1);
		}
	}
	
}
