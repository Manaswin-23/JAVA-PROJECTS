package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueSortExample {

	public static void main(String[] args) {
		Queue<Integer> qe=new LinkedList<Integer>();
		qe.add(5);
		qe.add(2);
		qe.add(8);
		System.out.println("before sort:"+qe);
		List<Integer> list=new ArrayList<Integer>(qe);
		Collections.sort(list);
		qe.clear();
		qe.addAll(list);
		System.out.println("After Sort:"+qe);
	}

}
