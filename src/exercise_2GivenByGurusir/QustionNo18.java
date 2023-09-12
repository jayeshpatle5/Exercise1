package exercise_2GivenByGurusir;

import java.util.Arrays;

public class QustionNo18 {

	public static void main(String[] args) {
//		18.	Make given array as unique  and display above (2.5<N) only.
//		=====Example=======
//		Given array is {1,2,3,8,5,4,2,5,9,7}
//		Op Would be >> {3,8,5,4,9,7}.

		int[] arr= {1,2,3,8,5,4,2,5,9,7,};

		float no=5.0f;
		System.out.println(Arrays.toString(uniqueElementsInarr(arr, no)));
	}
	
	public static int[] uniqueElementsInarr(int[] arr, float range) {
		
		int[] output= new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					count++;
				}
			}
			if(count==1 && arr[i]>range) {
				
				output[index++]=arr[i];
			}
		}
		return Arrays.copyOfRange(output, 0, index);
		
	} 

}
