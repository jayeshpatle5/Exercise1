package exercise_2GivenByGurusir;

public class QustionNo25 {

	public static void main(String[] args) {
		//		25.	Reverse a string  eg: "Surya"  o/p - ayrus
		//		Again if you will reverse back to Surya ---- How many iterations it will take

		String str="Surya";
		System.out.println(noOfiterations(str));

	}

	public static int noOfiterations(String str) {

		String rev="";
		int i=0;
		int count=0;
		for( i=str.length()-1;i>=0;i--) {

			rev=rev+str.charAt(i);
			count++;
		}

		for(i=str.length()-1;i>=0;i--) {

			rev=rev+str.charAt(i);
			count++;
		}
		return count;
	}

}
