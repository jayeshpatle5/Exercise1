package exercise_2GivenByGurusir;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class QustionNo5 {

	public static void main(String[] args) {
		//	5.	WAP to show the implementation of Hash Map

		Map<String,Integer> map=new HashMap<>();

		//		Random r=new Random();
		//		int no=10;

		map.put("Hyderabad", 2);
		map.put("Bangalore", 1);
		map.put("Chennai", 3);
		map.put("Mumbai", 2);
		map.put("Nagpur", 4);
		map.put("Pune", 5);
		map.put("Hyderabad", 2);

		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println("City : " +entry.getKey() +" Stores : "+ entry.getValue());

		}

	}
       
}
