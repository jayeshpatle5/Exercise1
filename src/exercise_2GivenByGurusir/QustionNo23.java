package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QustionNo23 {

	public static void main(String[] args) {
		
//		23.	Given a range of numbers e.g. (1,4,5,8,6,2,7,3,9). 
//		write a program to find pairs of numbers whose sum is 8. 
//		Also what approach can be applied if the same range is scaled to 
//		over 10 million numbers (The trick here is to distribute the range 		
//		into smaller range and send it for parallel execution and merge the outputs)

		int[] arr= {1,4,5,8,6,2,7,3,9};
		
		int sum=8;
		List<int[]> list =sumofpairsofnumbers(arr, sum);
		for(int[] output : list) {
			
			System.out.println(Arrays.toString(output));
		}
	}

	public static List<int[]> sumofpairsofnumbers(int[] arr, int sum) {
		
		List<int[]> list=new ArrayList<>();
		
		
		for(int i=0;i<arr.length;i++) {
			
			int[] temp= new int[2];
			for(int j=i+1;j<arr.length;j++) {
				
				int tempsum=arr[i]+arr[j];
				if(tempsum==sum) {
					temp[0]=arr[i];
					temp[1]=arr[j];
					list.add(temp);
				}
				
			}
		}
		return list;
		
	}
}
