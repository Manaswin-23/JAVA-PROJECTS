package demo;

import java.util.Stack;

public class BurgerStack {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("Burger 1");
		st.push("Burger 2");
		st.push("Burger 3");
		st.push("Burger 4");
		System.out.println("top Burger"+st.peek());
		System.out.println("serving burger"+
		st.pop());
		if(st.isEmpty())
		{
			System.out.println("All Burger are served");
		}

	}

}
