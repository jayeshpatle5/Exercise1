package exercise_2GivenByGurusir;

//28.	String a="Java is a programming language";
//Output:-   Java%20is%20a%20programming%20language
//
//String[] string={"java is a programming language","It is raining","is raining it","language is a programming java",..........................};
//---> ( Using collection Hashset and without collection framework) 
//Output: -   java is a programming language , it is raining  ,    .......    output:-   Java%20is%20a%20programming%20language
//-----------------------------------------------------------------------------------------------------------
//String[] string={"java is a programming language","It is raining","is raining it","language is a programming java",..........................};
//(Using collection Hashset and without collection framework) 
//Output: -   java is a programming language , it is raining  ,    ...

public class QustionNo28 {

	public static void main(String[] args) {
		String a="Java is a programming language";
		//	Output:-   Java%20is%20a%20programming%20language
		System.out.println(replaceString1(a));

	}

	public static String replaceString1(String str) {

		String newstr="";
		for(int i=0;i<str.length();i++) {

			if(str.charAt(i)==' ') {
				newstr=	str.replace(str.charAt(i)+"","%20");
			}
		}
		str=newstr;
		return str;

	}

	public static String replaceArraywithString1(String[] arr) {
		return null;

	}
}
