package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QustionNo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"racecar", "abcdecac", "override", "madam"};
		List<Map<Character,Integer>> listofMap=countEachCharacterInString(s);
		
		for(int i=0;i<listofMap.size();i++) {
			
			System.out.println(listofMap.get(i));
		}
	}

	public static List<Map<Character,Integer>> countEachCharacterInString(String[] s)
	{
		List<Map<Character,Integer>> list=new ArrayList<>();
		
	for(int i=0;i<s.length;i++) {
		
		Map<Character,Integer> map=new HashMap<>();
		for(int j=0;j<s[i].length();j++) {
			char c=s[i].charAt(j);
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		list.add(map);
	}
	return list;
		
	}
	
}
