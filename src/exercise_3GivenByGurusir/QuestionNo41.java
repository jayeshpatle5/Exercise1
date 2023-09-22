package exercise_3GivenByGurusir;

import java.util.Arrays;

public class QuestionNo41 {

	public static void main(String[] args) {

		String s1="it is sunny day";
		String s2="sunny day is it";
		//				s1==s2 should return true

		System.out.println(isAnagramSentence(s1, s2));

	}

	public static boolean isAnagramSentence(String s1, String s2) {

//		String[] str1=s1.split(" ");
//		String[] str2=s2.split(" ");
		
		char[] str1=s1.toCharArray();
		char[] str2=s2.toCharArray();
		if(str1.length!=str2.length) {

			return false;
		}

		Arrays.sort(str1);
		Arrays.sort(str2);

		return 	Arrays.equals(str1, str2);
	}

	public static boolean isAnagramSentence2(String s1, String s2) {

		String[] str1=s1.split(" ");
		String[] str2=s2.split(" ");
		if(str1.length!=str2.length) {

			return false;
		}

		Arrays.sort(str1);
		Arrays.sort(str2);

		return 	Arrays.equals(str1, str2);
	}

}
