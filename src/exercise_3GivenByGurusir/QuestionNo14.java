package exercise_3GivenByGurusir;

public class QuestionNo14 {

	//14.	Single Ton Design pattern
	public static void main(String[] args) {

		Singleton sing=Singleton.getInstance();
		
		System.out.println(sing);
	Singleton sing2=Singleton.getInstance();
	System.out.println(sing2);
	}

}

//Classical Java implementation of singleton
//design pattern
class Singleton
{
	private static Singleton obj;

	// private constructor to force use of
	// getInstance() to create Singleton object
	private Singleton() {}

	public static Singleton getInstance()
	{
		if (obj==null)
			obj = new Singleton();
		return obj;
	}
}
