package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.List;

public class QustionNo22 {

	public static void main(String[] args) {
//		22.	Given a string find the total number of sub-strings that can be formed out of it.
//		(This is a mathematical problem of finding the number of permutations 
//				of a given number.) also write a program to print all the sub-strings.
		
		String str="abcd";

		System.out.println(createsubStringusingString(str));
	}

	public static List<String> createsubStringusingString(String str){
		
		List<String> list=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			
			for(int j=i;j<str.length();j++) {
			
			list.add(str.substring(i,j+1));
			}
		}
		
		return list;
		
		
	}
}
