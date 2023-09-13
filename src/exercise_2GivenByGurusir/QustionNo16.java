package exercise_2GivenByGurusir;

public class QustionNo16 {

	public static void main(String[] args) {

		//		16.	Find the first non-repeating character in a string by 
		//		iterating only once through the string with best space and time complexity
		String str="aabcc";
		System.out.println(firstnonRepeatingChar2(str));

	}

	public static char firstnonRepeatingChar1(String str) {

		for(int i=0;i<str.length();i++) {

			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {

				return str.charAt(i);
			}
		}
		return '0';

	}
	
	public static char firstnonRepeatingChar2(String str) {

		String dup="";
		for(int i=0;i<str.length();i++) {

		       String temp=str.substring(i+1);
		      
		       if(!dup.contains(str.charAt(i)+"") && !temp.contains(str.charAt(i)+"")) {
		    	   
		    	   return str.charAt(i);
		       }else {
		    	   
		    	dup=str.charAt(i)+dup;
		       }
		}
		return '0';

	}
}
