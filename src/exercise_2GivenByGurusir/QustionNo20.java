package exercise_2GivenByGurusir;

public class QustionNo20 {

	public static void main(String[] args) {


		//		20.	Write a program to add the integers in a string
		//		String s = "abc123def45gh6i7"
		//		Output: 123+45+6+7 = 181
		//		Write Unit tests to test the given program 
		//		What is the Complexity of the program written and how it can be improved?
		String s = "abc123def45gh6i7";
		System.out.println(addIntegersInString1(s));
	}

	public static int addIntegersInString1(String str) {

		char[] ch=str.toCharArray();

		int sum=0;
		String temp="";
		for(int i=0;i<ch.length;i++) {

			if(Character.isDigit(ch[i])) {
				temp=temp+ch[i];
			}else if(!temp.equals("")) {
				sum=sum+Integer.parseInt(temp);
				temp="";
			}
		}
		if(!temp.equals("")) {
			return sum+Integer.parseInt(temp);
		}else {
			return sum;
		}


	}

}
