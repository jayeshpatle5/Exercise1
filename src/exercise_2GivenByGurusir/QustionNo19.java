package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class QustionNo19 {

	public static void main(String[] args) {
		//		method should  retun boolean value By taking string values and as shown below.
		//		S=“rabbbit”;
		//		T=“rabbit”//True
		//		U=“tabbit”//false
		//		V=“ab”//true

		String str="rabbbit";
		String target="ab";
		System.out.println(wordUsingStringUsingHashMap1(str, target));

	}

	public static boolean wordUsingStringUsingHashMap1(String str,String target) {

		Map<Character,Integer> map1=new HashMap<>();

		Map<Character,Integer> map2=new HashMap<>();

		for(char c: str.toCharArray()) {

			map1.put(c, map1.getOrDefault(c, 0)+1);
		}

		for(char c: target.toCharArray()) {

			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		
		
		for(Entry<Character,Integer> entry:map1.entrySet()) {
			Character c=entry.getKey();
			if(!map2.containsKey(c) ) {
				return false;
			}
			if(entry.getValue()>map2.get(c)) {
				
				return false;
			}
		}
		return true;


	}


	public static boolean wordUsingString2(String str,String target) {

		List<Character> list1=new ArrayList<>();
		List<Character> list2=new ArrayList<>();

		for(char c: str.toCharArray()) {

			list1.add(c);
		}

		for(char c: target.toCharArray()) {

			list2.add(c);
		}

		return list1.retainAll(list2);


	}

}
