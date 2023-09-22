package exercise_3GivenByGurusir;

public class QuestionNo34 {

	public static void main(String[] args) {
//		a)"hello".equals("hello")
//	 b)"hello"=="hello" 


		String s1="hello";
		String s2=new String("hello").intern();
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

	}

}
