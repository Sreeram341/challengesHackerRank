package challengesHackerRank;

import java.io.*;

public class balancedBrackets {
	static supportStk stk = new supportStk();
	
	static String isBalanced(String s) {
		String returnStr="YES";
		
		String [] inpStkElems = s.split("");
		int stkElemLeng = inpStkElems.length;
		for(int i=0;i<stkElemLeng;i++) {
			//System.out.println(inpStkElems[i]);
			
			if(inpStkElems[i].equals("[")|| inpStkElems[i].equals("{")||inpStkElems[i].equals("(")) 
				{	
					stk.push(inpStkElems[i]);	
				}
		
			else if(inpStkElems[i].equals("]") && (stk.top!=null)) {
				if(stk.top.equals("[")  ) {stk.pop();}
				else {return "NO";}
			}
			else if(inpStkElems[i].equals("}") && (stk.top!=null)) {
				if(stk.top.equals("{")) {stk.pop();}
				else {return "NO";}
			}
			else if(inpStkElems[i].equals(")") && (stk.top!=null)) {
				if(stk.top.equals("(")) {stk.pop();}
				else {//System.out.println(stk.top);
					return "NO";}
			}
			//System.out.println(stk);
		}
		return returnStr;
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		File inpFile = new File("C:\\Users\\sreer\\Desktop\\problemInput\\input04.txt");
		BufferedReader bfr = new BufferedReader(new FileReader(inpFile));
		
		int loopSize =Integer.parseInt(bfr.readLine());
		for (int i=0;i<loopSize;i++) {
			String s = bfr.readLine();
	        String result = isBalanced(s);
	        System.out.println(result);
		}
		bfr.close();
	}
}
