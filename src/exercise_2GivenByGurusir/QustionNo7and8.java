package exercise_2GivenByGurusir;

public class QustionNo7and8 {

	public static void main(String[] args) {

		//		7.	Print the word count in a given sentence
		String s = "This is sample string to count the strings";
		System.out.println("count of words in a given string is : "+printthewordcountInSetence1(s));


	}

	public static int printthewordcountInSetence1(String str) {


		String[] arr=str.split(" ");

		return arr.length;

	}

}
