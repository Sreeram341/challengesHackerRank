package challengesHackerRank;

public class equalStacks {
	static int equalStacks(Integer[] h1, Integer[] h2, Integer[] h3){		
		Stack<Integer> h1stk =new Stack<Integer>();Stack<Integer> h2stk =new Stack<Integer>();Stack<Integer> h3stk =new Stack<Integer>();
		Collections.reverse(Arrays.asList(h1));Collections.reverse(Arrays.asList(h2));Collections.reverse(Arrays.asList(h3));
		h1stk.addAll(Arrays.asList(h1));h2stk.addAll(Arrays.asList(h2));h3stk.addAll(Arrays.asList(h3));
		System.out.println(h1stk);System.out.println(h2stk);System.out.println(h3stk);
		return 0;
    }
	public static void main(String[] args) throws IOException {
		File inpFile = new File("C:\\Users\\spulavar\\Desktop\\equal-stacks-testcases\\input\\input00.txt");
		BufferedReader bfr= new BufferedReader(new FileReader(inpFile));
		List<Integer[]> allIntArr =new ArrayList<Integer[]>(3);
		int[] numOfItems=new int[3];
		Integer[] h1 =null,h2 =null,h3 =null;
		String[] sizeOfEachStk=new String[3];
		sizeOfEachStk = bfr.readLine().split(" ");
		for(int i=0;i<3;i++) {
			numOfItems[i]=Integer.parseInt(sizeOfEachStk[i]);
			h1=new Integer[numOfItems[i]];
			String [] mainData = bfr.readLine().split(" ");
			for(int j=0;j<numOfItems[i];j++) h1[j]=Integer.parseInt(mainData[j]);
			allIntArr.add(h1);
		}
		h1=allIntArr.get(0);h2=allIntArr.get(1);h3=allIntArr.get(2);
		equalStacks(h1,h2,h3);
		bfr.close();
	}
}
