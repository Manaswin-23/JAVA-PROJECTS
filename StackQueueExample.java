package demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {
	public static void main(String[] args)
	{
		Stack<String> st=new Stack<String>();
		System.out.println("enter the toy Box");
		st.push("Ball");
		st.push("Blocks");
		st.push("Puzzle");
		System.out.println(st.pop());
		System.out.println("toys played"+st);
		Queue<String> qe=new LinkedList<String>();
		System.out.println("enter the kids names");
		qe.add("Maya");
		qe.add("Leo");
		qe.add("Nina");
		System.out.println(qe.poll());
		System.out.println(qe);
	}

}
