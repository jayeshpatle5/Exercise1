package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QustionNo7and8 {

	public static void main(String[] args) {

		//		7.	Print the word count in a given sentence
		String s = "This is sample string to count the strings";
		//System.out.println("count of words in a given string is : "+printthewordcountInSetence1(s));
		
		String targetWord="count";
	//	System.out.println(getWordFromString(s,targetWord));
	//	System.out.println(getWordFromString2(s,targetWord));
		System.out.println(getWordFromString3(s,targetWord));

	}

	public static int printthewordcountInSetence1(String str) {


		String[] arr=str.split(" ");

		return arr.length;

	}

	public static String getWordFromString(String s,String targetWord) {

		String[] splitSentence=s.split(" ");
		for (int i = 0; i < splitSentence.length; i++) {
			if(splitSentence[i].equals(targetWord))
			{
				return targetWord;
			}		
		}
		return targetWord+ " is not found in a Sentence";
	}

	public static String getWordFromString2(String s,String targetWord) {

		List<String> list=new ArrayList<String>(Arrays.asList(s.split(" ")));

		if(list.contains(targetWord))
		{
			return targetWord +" is found";
		}

		return targetWord +" is not found in a Sentence";
	}

	public static String getWordFromString3(String s,String targetWord) {

		int index = s.indexOf(targetWord); 
		if(index >= 0){
			System.out.print(" Found targetWord: ");
			System.out.println(index);
		} 
		return targetWord+ " is not found in a Sentence";
	}
}
