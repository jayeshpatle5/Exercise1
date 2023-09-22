package exercise_3GivenByGurusir;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionNo52 {

	public static void main(String[] args) {
		//		52.	Input is String s1=aa123bb34cc5de67
		//				My output should be
		//				123+34+5+67
		String s1="aa123bb34cc5de67";
		System.out.println(extractAndSumNumbers(s1));

	}

	public static String extractAndSumNumbers(String input) {
		// Define a regular expression pattern to match numbers
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(input);

		int sum = 0;

		// Find and sum all numbers in the input string
		while (matcher.find()) {
			int number = Integer.parseInt(matcher.group());
			sum += number;
		}

		// Convert the sum to a string
		return String.valueOf(sum);
	}




}
