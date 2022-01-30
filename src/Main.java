/******************************************************************************


                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	  System.out.println(sum(6))  ;
	  System.out.println(sum(5));
	  System.out.println(sum(28));
		System.out.println(sum(100));
	}
	
	
	public static boolean sum(int n){
	    int result=0;
	    
	    ArrayList<Integer>num = new ArrayList<Integer>();
	    
	   for(int i=1; i<n;i++){
	       if(n%i==0){
	           num.add(i);
	       }
	   }
	   
	   for(int p=0; p<num.size() ;p++){
	       result+=num.get(p);
	       }
	        System.out.println(result); 
	        
	   
	  return (result==n);
	}
}
