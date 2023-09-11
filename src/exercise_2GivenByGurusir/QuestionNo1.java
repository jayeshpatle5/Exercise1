package exercise_2GivenByGurusir;

public class QuestionNo1 {

	public static void main(String[] args) {
//	    1. Let's say we have an array 
//        a. [2,5,6,7,8] target=6 -> return index of the element 6
//        b. [3,5,6,9] target=4 -> return index of element 4
		int[] arr= {2,5,6,7,8};
		System.out.println(getIndexOfTargetvalue1(arr, 5));

	}

	public static int getIndexOfTargetvalue1(int[] arr, int target) {


		for(int i=0;i<arr.length;i++) {

			if(arr[i]==target || arr[i]>target) {

				return i;
			}

		}

		return arr.length;
	}
}
