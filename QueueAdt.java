package demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAdt {

	public static void main(String[] args) {
		Queue<String> qu=new LinkedList<String>();
		qu.add("sai");
		qu.add("ravi");
		qu.add("ram");
		qu.add("janu");
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		qu.add("nani");
		System.out.println(qu);

	}

}
