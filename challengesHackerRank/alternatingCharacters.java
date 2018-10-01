import java.util.Arrays;

public class alternatingCharacters {

	static int alternatingCharacters(String s) {
		
		String [] splitString = s.split("");
		stringCounterMap scm = new stringCounterMap();
		
		Arrays.stream(splitString).forEach(e->{
			scm.addOrReplace(e);
		});
		
		int finMin=0; // Wrong
		
		for(int min:scm.values()) {
			if (min<finMin) {
				finMin =min;
			}
		}
		
		System.out.println(finMin);
		
		return 0;
    }
	
	public static void main(String[] args) {
		
		String s= "ABABABBC";
		
		int result = alternatingCharacters(s);
		
	}

}
