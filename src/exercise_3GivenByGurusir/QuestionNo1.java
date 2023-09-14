package exercise_3GivenByGurusir;

public class QuestionNo1 {

	public static void main(String[] args) {
		//		1.	Method should return true if matching close are available if it should return false
		//				Ex: Input is : {abc}//true   
		//				{abc)//false
		//				(ABC}//false
		//				()//true
		String input= "(abc)";
		String bracket="()";
		System.out.println(matchingClose2(input,bracket));

	}

	public static boolean matchingClose1(String str, String bracket) {

		char first=str.charAt(0);
		char last=str.charAt(str.length()-1); 

		return (first==bracket.charAt(0) && last==bracket.charAt(1));



	}

	public static boolean matchingClose2(String str,String bracket) {


		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
				continue;
			}else if(str.charAt(i)==bracket.charAt(0)){
				count++;
			}else if(str.charAt(i)==bracket.charAt(1)) {
				count--;
			}
		}

		return count==0;



	}
}
