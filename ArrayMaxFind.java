package demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMaxFind {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(14);
		al.add(17);
		al.add(9);
		al.add(6);
		int Maxnumber=Collections.max(al);
		System.out.println(Maxnumber);

	}

}
