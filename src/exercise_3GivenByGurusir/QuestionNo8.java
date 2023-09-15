package exercise_3GivenByGurusir;

public class QuestionNo8 {

	public static void main(String[] args) {
		
		System.out.println(" java"+3+4);

	}
	
	
	
// 8.	What is Polymorphism with example?
	
//	Ans: Polymorphism is an important concept of object-oriented programming. It simply means more than one form.
//
//That is, the same entity (method or operator or object) can perform different operations in different scenarios.

	//compile time polymorphism (method overloading)
	//run time polymorphism (method overriding)
	//operator overloading

//method overloading
public int add(int a, int b) {
		
		
		return a+b;
	}
	
	public int add(int a) {
		
		return a+a;
	}
	
}

//Method overriding
class Language {
	
	  public void displayInfo() {
	    System.out.println("Common English Language");
	  }
	}


	class Java extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }
	

	
	    
	}
