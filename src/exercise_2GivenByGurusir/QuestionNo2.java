package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.List;

public class QuestionNo2 {

	public static void main(String[] args) {
	//	Find out the missing number in the array of length n-1 and integers in the range of 1 to n.

		int [] arr= {2,3,6,8};
		missingNumbers1(arr,8);
	}

	public static void missingNumbers1(int [] arr, int range) {
		
		List<Integer> list =new ArrayList<>();
		
		
		for(int i : arr) {
				
				list.add(i);
		}
		
		for(int i=0;i<=range;i++) {
			if(!list.contains(i)) {
				
				System.out.println(i);
			}
		}
	}
}
