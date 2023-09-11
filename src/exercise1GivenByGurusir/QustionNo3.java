package exercise1GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QustionNo3 {

	public static void main(String[] args) {
	//	3.	WAP to take an input of List of Strings and returns a list of unique strings.
		List<String> list=new ArrayList<>();
		
		list.addAll(Arrays.asList("Jayesh","Tirumala","Vasanth","Kavitha","Vasanth","Tirumala"));
		
		System.out.println(listofUniqueStrings1(list));

	}
	
	public static List<String> listofUniqueStrings1(List<String> list){
	
		List<String> output=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			
			
			int count=0;
			if(!output.contains(list.get(i))) {
			for(int j=0;j<list.size();j++) {
				
				if(list.get(i).equals(list.get(j))) {
					count++;
				}
			}
			
			if(count==1) {
				
				output.add(list.get(i));
			}
			}
		}
		
		return output;
		
		
	}

}
