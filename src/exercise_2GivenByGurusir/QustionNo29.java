package exercise_2GivenByGurusir;

public class QustionNo29 {

	public static void main(String[] args) {
//		29.	char ch[]={abc bca adef};
//
//		 Output [a][b][c][%20][b][c][a][%20][a][d][e][f]

		String str="abc bca adef";
		
		char ch[]=str.toCharArray();
		String [] output=changeArrays(ch);
		
		for(int i=0;i<output.length;i++) {
			
			System.out.print(output[i]);
		}

	}

	public static String[] changeArrays(char[] arr) {
		
		String[] strarr=new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			String temp="";
			if(arr[i]!=' ') {
				temp="["+arr[i]+"]";
			}else {
				temp="%20";
			}
			strarr[i]=temp;
		}
		return strarr;
	}
}
