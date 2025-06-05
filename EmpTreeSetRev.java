package demo;

import java.util.TreeSet;

public class EmpTreeSetRev {
public static void main(String[] args)
{
	TreeSet<String> ts=new TreeSet<String>();
	System.out.println("enter the employee names:");
	ts.add("Sumit");
	ts.add("Karan");
	ts.add("Anjali");
	ts.add("Mohan");
	ts.add("Zoya");
	System.out.println(ts.reversed());
}
}
