package challengesHackerRank;
import java.io.*;
import java.util.*;
public class minMaxRiddle {

	static long[] riddle(long[] arr,String[] val) {
		int fullLen=arr.length;
        long[] retArr= new long[fullLen] ;			
        for(int i=0;i<fullLen;i++) {retArr[i]=joinCombs(i,val);}    
        System.out.println(Arrays.toString(retArr));
		return retArr;
    }
	static Long joinCombs(int len,String[] arr) {	
		List<Long> curComb = new ArrayList<Long>();
		for(int i=0;i<arr.length;i++) {
			curComb.add(appendElems(i,i+len,arr));
		}
		Collections.sort(curComb, Collections.reverseOrder());
		return curComb.get(0);
	}
	static Long appendElems(int strt,int end, String[]arr) {
		List<Long> sb=new ArrayList<Long>();
		for(int i=strt;i<=end;i++) {
			if(end<arr.length)sb.add(Long.valueOf(arr[i]));
		}
		Collections.sort(sb);
		if(end<arr.length)return sb.get(0); else return (long) 0;
	}
	 @SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
 String filesPath = "C:\\Users\\sreer\\Desktop\\problemInput\\min-max-riddle-testcases\\input\\input07.txt";
 File srcFile=new File(filesPath);
 BufferedReader bfr= new BufferedReader(new FileReader(srcFile));
 		int n=Integer.parseInt(bfr.readLine());
 		long[] arr = new long[n];
 		String[] val = bfr.readLine().split(" ");//arr[i]=Long.parseLong( 
 		for(int i=0;i<n;i++) {arr[i]=Long.valueOf( val[i]);}
 		riddle(arr,val);
	}
}
