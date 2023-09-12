package exercise_2GivenByGurusir;

public class QustionNo26 {

	public static void main(String[] args) {
		//		26.	String s1 = "abababcde"
		//				if the above string contains duplicates characters return true else return false
		//				Write 3 approaches and each time reduce the number of iterations

		String s1 = "cde";
		System.out.println(containsduplicates1(s1));
	}

	public static boolean containsduplicates1(String str) {

		for(int i=0;i<str.length();i++) {
			int a= str.indexOf(str.charAt(i));
			int b=str.lastIndexOf(str.charAt(i));
			if(a!=b) {

				return true;
			}
		}
		return false;
	}

}
