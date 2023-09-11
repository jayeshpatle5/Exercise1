package exercise_2GivenByGurusir;

public class QustionNo11 {

	public static void main(String[] args) {
//		11.	Write a program to add the integers in a string
//		a.	String s = "abc123def45gh6i7"
//		b.	Output: 123+45+6+7 = 181

		String s="abc123def45gh6i7";
		System.out.println(addIntegerInString(s));
	}
	
	public static int addIntegerInString(String s)
	{
		int sum=0;
		for (int i = 0; i <s.length();i++) {	

			String temp="";
			int index=i;
			while(index < s.length() && Character.isDigit(s.charAt(index)) )
			{				
				temp+=s.charAt(index);				
				index++;			
			}
			i=index;

			if(!temp.equals(""))
			{
				System.out.println(temp);
				sum+=Integer.parseInt(temp);
			}			
		}		
		return sum;
	}
	
}
