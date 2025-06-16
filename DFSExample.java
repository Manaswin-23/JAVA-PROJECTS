package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSExample {
	private Map<String, List<String>> map=new HashMap<String, List<String>>();
	private Set<String> st=new HashSet<String>();
	public void findSocialCircle(String person,String socialcricle)
	{
		map.computeIfAbsent(person,K-> new ArrayList<>()).add(socialcricle);
		map.computeIfAbsent(socialcricle,K->new ArrayList<>()).add(person);
	}
	public void findsocialcricleiterative(String currentperson)
	{
			if(st.contains(currentperson)) return ;
			st.add(currentperson);
			System.out.println("socialcricle :"+currentperson);
			for(String neighbor:map.getOrDefault(currentperson, new ArrayList<String>()))
			{
				findsocialcricleiterative(neighbor);
		}
	}

	public static void main(String[] args) {
		DFSExample ds=new DFSExample();
		ds.findSocialCircle("person1","person3");
		ds.findSocialCircle("person2","person1");
		ds.findSocialCircle("person3", "person2");
		System.out.println("Dfs traversal starting form socialcricle:");
		ds.findsocialcricleiterative("person1");

	}

}
