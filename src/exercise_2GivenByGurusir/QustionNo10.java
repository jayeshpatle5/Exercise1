package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QustionNo10 {

	public static void main(String[] args) {

		//		10.	Write a program to count:
		//			a.	No. of characters in a string
		//			b.	No. of repeated words in a sentence

		String str="web internet web chrome internet safari";
		System.out.println(noofRepeatedwordsinSentence(str));
	}

	public static int noofCharsInString(String str) {


		return str.length();

	}

	public static int noofRepeatedwordsinSentence(String str) {

		String[] arr=str.split(" ");
		int count =0;
		List<String> duplist=new ArrayList<>();
		
		for(int i=0;i<arr.length-1;i++) {

			String temp=arr[i];
			List<String> list=Arrays.asList(Arrays.copyOfRange(arr, i+1, arr.length));

			if(!duplist.contains(temp) && list.contains(temp)){
				duplist.add(temp);
				count++;

			}

		}
		
		return count;

	}

}
