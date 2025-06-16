package demo;

import java.util.Scanner;
import java.util.Stack;

public class StackPalindrome {
	    public static void main(String[] args) {
	        Stack<String> st=new Stack<>();
	        st.push("mam");
	        st.push("amma");
	        for(String s:st)
	        if (ispalindrome(s)) {
	            System.out.println("The string '"+s+"' is a Forward.");
	        } else {
	            System.out.println("The string "+s+" is a Backward.");
	        }
	    }
	   public  static boolean ispalindrome(String str)
	   {
		   String rev=new StringBuilder(str).reverse().toString();
		   return str.equalsIgnoreCase(rev);
	   }
	}
