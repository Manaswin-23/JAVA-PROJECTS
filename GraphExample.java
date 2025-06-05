package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphExample {

	public static void main(String[] args) {
		Map<String,List<String>> grp=new HashMap<>();
		grp.put("Alice",Arrays.asList("Bob"));
		grp.put("Bob",Arrays.asList("Alice","charlie"));
		grp.put("charlie",Arrays.asList("Bob"));
		for(String per:grp.keySet())
		{
			System.out.println(per+ " is friends with"+grp.get(per));
		}

	}

}
