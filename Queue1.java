package demo;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
	
		Queue<String> qe=new LinkedList<String>();
		qe.add("student 1");
		qe.add("student 2");
		qe.add("student 3");
		System.out.println(qe);
		String first=qe.remove
				();
		System.out.println(first);
		System.out.println(qe);
		}

}
