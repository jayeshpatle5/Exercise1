package exercise_2GivenByGurusir;

import java.util.Arrays;

public class QustionNo4 {

	public static void main(String[] args) {
		//	    4. WAP to Print the reverse of a string
		//        a. Input = “Chennai is a green city”

		String input="Chennai is a green city";

		System.out.println(reverseStringUsingStringBuffer4(input));
	}

	public static String reverseStringUsingCharAt1(String str) {

		String output="";
		for(int i=0;i<str.length();i++) {

			output=str.charAt(i) + output;
		}
		return output;
	}

	public static String reverseStringUsingreverseForLoop2(String str) {

		String output="";
		for(int i=str.length()-1;i>=0;i--) {

			output= output + str.charAt(i);
		}
		return output;
	}
	public static String reverseStringUsingStringBuilder3(String str) {

		StringBuilder sb=new StringBuilder(str);

		return sb.reverse().toString();
	}

	public static String reverseStringUsingStringBuffer4(String str) {

		StringBuffer sb=new StringBuffer(str);

		return sb.reverse().toString();
	}

	public static String reverseStringUsingforLoop5(String str) {

		char[] charray=str.toCharArray();
		String str1="";
		String str2="";
		int last=str.length()-1;
		for(int i=0;i<charray.length/2;i++) {
			
			char ch1=charray[i];
			char ch2=charray[last];
			charray[i]=ch2;
			charray[last]=ch1;
			
			str1=str1+charray[i];
			str2=charray[last]+str2;
			last--;
			
		}
		return str1+str2;
	}
}
