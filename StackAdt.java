package demo;

import java.util.Stack;

public class StackAdt {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("Write");
		st.push("Delete");
		st.push("Insert");
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);

	}

}
