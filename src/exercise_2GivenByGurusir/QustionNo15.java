package exercise_2GivenByGurusir;

public class QustionNo15 {

	public static void main(String[] args) {
		//		15.	Find the palindrome terms and if it’s a palindrome get the count of first character in the string
		//		and if its not a palindrome find the highest count of a character in the string

		String terms="malayalam madam java python hindi";

		charcountInString(terms);

	}

	public static void charcountInString(String terms) {
		String [] arr=terms.split(" ");

		for(int i=0;i<arr.length;i++) {

			if(ispalinDrome(arr[i])) {
				System.out.println(arr[i]+" is palindrome string and "+countoffirstchar(arr[i]));
			}else {
				System.out.println(arr[i]+" is not palindrome string and " +highestcountcharInString(arr[i]));
			}
		}
	}

	public static boolean ispalinDrome(String str) {
	
			return new StringBuffer(str).reverse().toString().equals(str);
		
	}

	public static String countoffirstchar(String str) {

		int count=1;

		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(0)) {

				count++;
			}
		}
		//	return "count of first character "+str.charAt(0)+" in string is "+ count;
		return str.charAt(0)+"="+count;
	}

	public static String countoffirstchar1(String str) {

		char c=str.charAt(0);
		int count=0;

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		//	return "count of first character "+str.charAt(0)+" in string is "+ count;
		return c+"="+count;
	}
	public static String highestcountcharInString(String str) {

		int highestcount=0;
		char ch=' ';
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {

				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count>highestcount) {
				highestcount=count;
				ch=str.charAt(i);
			}
		}
		//return "Highestcount of Character In a String is "+ highestcount+ " for character "+ ch;
		return ch+"= "+highestcount;
	}

	
	//	public static void checkCharacterCountInPalindrome1(String s)
	//	{
	//		String[] splittedWords=s.split(" ");
	//		System.out.println(splittedWords.toString());
	//		for(String eachWord:splittedWords)
	//		{
	//			if(isPalindrome1(eachWord))
	//			{
	//				System.out.println(eachWord+" is a palindrome");
	//				int count=1;
	//				for (int i = 1; i <eachWord.length(); i++) {
	//					{
	//						
	//						if(eachWord.charAt(i)==eachWord.charAt(0))
	//						{
	//							count++;
	//							
	//						}					
	//					}
	//					System.out.println("First repeating char count in "+eachWord +" is "+ eachWord.charAt(i) +"for "+count+ "times");
	//				}
	//			}
	//			else
	//			{
	//
	//			}
	//		}
	//		
	//
	//	}

	public static boolean isPalindrome1(String s)
	{
		int t1=0;
		int t2=s.length()-1;

		while(t2>t1)
		{
			if(s.charAt(t1)!=s.charAt(t2))
			{
				return false;
			}
			t1++;
			t2--;		
		}		
		return true;		
	}
}
