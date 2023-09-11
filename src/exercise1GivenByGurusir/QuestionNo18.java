package exercise1GivenByGurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class QuestionNo18 {

	public static void main(String[] args) {
		//	1.	Given an array (1,3,4,5,2) and a number k, find all elements that appear k times

		int arr[] = {1,3,4,5,2,3,4,4};

		int k=1;
		method3(arr,k);

	}

	public static List<Integer> elementsappearnotimes1(int [] arr, int k) {

		Map<Integer,Integer> map= new HashMap<>();
		List<Integer> output=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {

			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

		}
		for(Entry<Integer,Integer> entry: map.entrySet()) {

			if(entry.getValue()==k) {
				output.add(entry.getKey());
			}
		}
		return output;

	}

	public static List<Integer> elementsappearnotimes2(int [] arr, int k) {

		List<Integer> list=new ArrayList<>();

		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(!list.contains(arr[i])) {
				for(int j=0;j<arr.length;j++) {

					if(arr[i]==arr[j]) {
						count++;
					}
				}
				
				if(count==k) {

					list.add(arr[i]);
				}
			}
			
		}
		return list;

	}
	
	public static void method3(int [] arr, int k){

		for(int i=0;i<=arr.length-1;i++)
		{
			int c=0;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
					c++;
			}
			if (c==k)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
