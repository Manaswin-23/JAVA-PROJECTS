package demo;

import java.util.Stack;

public class STACKEAMPLES {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("plate 1");
		st.push("plate 2");
		st.push("plate 3");
		st.push("plate 4");
		st.push("plate 5");
		System.out.println(st.pop());
		System.out.println(st);

	}

}
