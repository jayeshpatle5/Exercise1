package exercise_3GivenByGurusir;

public class QuestionNo47 {

	public static void main(String[] args) {
//		47.	 Input : aaabbcccc Take this as a String and calculate the no of characters in the string
//		Output : a3b2c3
		String str="jayesh";
		str.replace(str, str);
		System.out.println(stringPattern1("abbcccac"));

	}
	
	public static String stringPattern1(String str) {
		
		String output="";
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.charAt(i)!=str.charAt(i+1)) {
				output=output+str.charAt(i)+count;
				count=1;
				continue;
			}
			if(i==str.length()-2) {
				return output+str.charAt(i)+(++count);
			}
			
			count++;;
		}
		return output;
	}

}
