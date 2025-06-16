package demo;

import java.util.HashMap;

public class HashMapAdt {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(40,"Apple");
		hm.put(50,"Mango");
		hm.put(55, "Banana");
		hm.put(60, "Milk");
		for(String st:hm.values())
		{
			System.out.println(st);
		}
	}

}
