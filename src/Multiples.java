import java.util.ArrayList;

public class Multiples {

	public static void main(String[] args) {
		System.out.println(take(10));;

	}
	
	
	public static int take(int n) {
		ArrayList<Integer>num = new ArrayList<>();
		for(int i = 0; i<n ; i++) {
			if(i%3==0 || i%5==0) {
				num.add(i);
				}
			}
		
		 Integer result =0;
		for(int p=0; p<num.size() ;p++){
		       result +=num.get(p);
		       }
		        
		
		return result;
		
		
		
	}

}
