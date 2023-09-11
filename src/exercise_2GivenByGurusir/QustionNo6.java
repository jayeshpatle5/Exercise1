package exercise_2GivenByGurusir;

import java.util.Arrays;

public class QustionNo6 {

	public static void main(String[] args) {

	// 6. loop through the array and print all the elements in the reverse order

		//String [] arr= {"Jayesh","YashMant","Srikar","Venkatesh","vasanth"};
		
		Integer[] arr= {1,2,3,5};
		System.out.println(Arrays.toString(arr));
	Integer [] revarr=	printArrayElementsInreverse1(arr);
	System.out.println(Arrays.toString(revarr));
	}
	
	public static <T> T[] printArrayElementsInreverse1(T[] arr) {
		
		int last=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			
			T temp=arr[i];
			arr[i]=arr[last];
			arr[last]=temp;
			last--;
		}
		return arr;
		
	}

}
