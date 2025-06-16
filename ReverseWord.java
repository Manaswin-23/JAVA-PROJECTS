package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWord {

	public static void main(String[] args) {
		List<String> ll=new ArrayList<String>();
		ll.add("sai");
		ll.add("ram");
		ll.add("janu");
		Collections.reverse(ll);
		System.out.println(ll);

	}

}
