package exercise_2GivenByGurusir;

public class QustionNo9 {

	public static void main(String[] args) {
		//	9.	Write a program to find the duplicate characters in a string?

		String str="aabcdeddfg";
		System.out.println(duplicatecharsInString(str));
	}

	public static String duplicatecharsInString(String str) {

		String dup="";
		for(int i=0;i<str.length()-1;i++) {

			String temp=str.substring(i+1);

			if(temp.contains(str.charAt(i)+"") && (dup.indexOf(str.charAt(i))==-1)){

				dup=dup+str.charAt(i);
			}

		}
		return dup;

	} 

}
