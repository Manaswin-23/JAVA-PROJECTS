package demo;

import java.util.TreeMap;

public class TreeMapCountry {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String, String>();
		tm.put("India","New Delhi");
		tm.put("USA","Washington");
		tm.put("Germany","Berlin");
		tm.put("Japan", "Tokya");
		tm.put("India","Delhi");
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.higherKey("Germany"));
		System.out.println(tm.lowerKey("Japan"));

	}

}
