package challengesHackerRank;
import java.util.*;
public class supportStk extends ArrayList<String> {
	private static final long serialVersionUID = 1L;
	String top;
	int currPos=this.size();  
	public void push(String elem) {
		if (this.isEmpty()) {
			this.add(elem);
			top = this.get(currPos);
			currPos = this.size();
		}else {
			this.add(elem);
			top = this.get(currPos);
			currPos = this.size();
		}
	}
	public void pop() {
		
		if(currPos-1>0) {
			//System.out.println("called");
			currPos = this.size()-1;
			this.remove(currPos);
			currPos = this.size();
			top = this.get(currPos-1);
		}
		else  {
			try {
				//System.out.println("called");
			this.remove(currPos-1);
			top=null;
			currPos=0;
			}
			catch (IndexOutOfBoundsException e) {
				System.out.println("");
			}
		}
	}
}
