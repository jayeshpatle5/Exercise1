package exercise_2GivenByGurusir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QustionNo17 {

	public static void main(String[] args) {
		
//		17.	For the given string count the reported words using hash map
//		a.	“Book key table key smart book key on the table science book”

		
		String str="Book key table key smart book key on the table science book";
		System.out.println(noofRepeatedwordsinSentence(str));

	}

	public static int noofRepeatedwordsinSentence(String str) {

		String[] arr=str.split(" ");
		int count =0;
		List<String> duplist=new ArrayList<>();
		
		for(int i=0;i<arr.length-1;i++) {

			String temp=arr[i];
			List<String> list=Arrays.asList(Arrays.copyOfRange(arr, i+1, arr.length));

			if(!duplist.contains(temp) && list.contains(temp)){
				duplist.add(temp);
				count++;

			}

		}
		
		return count;

	}
	
}
