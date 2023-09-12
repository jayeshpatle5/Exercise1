package exercise_2GivenByGurusir;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class QustionNo13 {

	public static void main(String[] args) {
	

		String[] colors= {"web", "internet","web","chrome", "internet" ,"safari"};
		CountWordsUsingHashMap(colors);

	}
	public static void CountWordsUsingHashMap(String[] colors)
	{
		Map<String,Integer> map=new HashMap<>();
		for (int i = 0; i < colors.length; i++) {	
			map.put(colors[i], map.getOrDefault(colors[i], 0)+1);
		}

		for(Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"-"+entry.getValue());
			}
		}
	}
	
}
