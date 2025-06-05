package demo;

import java.util.TreeSet;

public class TreeSetSearchFun {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Keyboard");
		ts.add("Cpu");
		ts.add("Memory");
		ts.add("Mouse");
		ts.add("Monitor");
		ts.add("Webcam");
		System.out.println(ts);
		if(ts.contains("Cpu"))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}

}
