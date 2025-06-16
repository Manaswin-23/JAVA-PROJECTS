package demo;

import java.util.ArrayList;

public class ArrayListAdventure {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sai");
		al.add("ravi");
		al.add("ram");
		al.add("janu");
		al.add("siva");
		for(String st:al)
		{
		System.out.println(st);
		}
		System.out.println(al.remove(1));
		System.out.println(al.add("krishna"));
		System.out.println(al.get(1));
		
	}

}
