package demo;

import java.util.TreeSet;

public class LibraryBookTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		System.out.println("enter the ID number");
		ts.add(5002);
		ts.add(4998);
		ts.add(5005);
		ts.add(4999);
		ts.add(5001);
		System.out.println(ts);
		System.out.println("First ID book:"+ts.first());
		System.out.println("Last ID book:"+ts.last());
		System.out.println("higher:"+ts.higher(4999));
		System.out.println("lower:"+ts.lower(5005));
		
	}
}

