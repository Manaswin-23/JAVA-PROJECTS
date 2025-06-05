package demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIce {

	public static void main(String[] args) {
		Queue<String> qe=new LinkedList<String>();
		qe.add("student 1");
		qe.add("student 2");
		qe.add("student 3");
		System.out.println(qe.poll());
		System.out.println("the kid waiting for ice"+qe);

	}

}
