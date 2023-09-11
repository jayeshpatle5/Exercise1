package exercise_2GivenByGurusir;

public class QustionNo3 {

	public static void main(String[] args) {
//	    3. Given a sorted integer array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//	            a. [1,3,5,6,7] k=4 -> return the index for 4
//	            b. [2,4,5,7,8] k=5 ->5's index

		int[] arr= {1,3,5,6,7};
	System.out.println(getIndexOfTargetvalue1(arr,10));
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
