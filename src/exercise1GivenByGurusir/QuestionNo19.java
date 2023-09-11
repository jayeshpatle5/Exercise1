package exercise1GivenByGurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class QuestionNo19 {

	public static void main(String[] args) {
		//19.	Given an array of (1,2,3,4,5,2) and find the no of occurrences in an unsorted array

		int arr[] = {1,2,3,4,5,2};

		countoccurancewithoutusingHashmap2(arr);

	}

	public static Map<Integer,Integer> elementsappearnotimes1(int [] arr) {

		Map<Integer,Integer> map= new HashMap<>();

		for(int i=0;i<arr.length;i++) {

			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

		}

		return map;

	}

	public static void countoccurancewithoutusingHashmap2(int a[]) {

		List<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++) {

			int count =1;
			if(!list.contains(a[i])) {
				for(int j=i+1;j<a.length;j++) {

					if(a[i]==a[j]) {

						count++;
					}
				}
				System.out.println("digit is "+a[i]+" : "+ "count is : "+count);
			}
			list.add(a[i]);

		}
	}

	
}
