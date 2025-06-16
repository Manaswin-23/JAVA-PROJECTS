package demo;

import java.util.HashMap;

public class Dynamic {
	static HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	public static int fib(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		if(hm.containsKey(n))
		{
			return hm.get(n);
		}
		int result=fib(n-1)+fib(n-2);
		hm.put(n, result);
		return result;
	}
	public static void main(String[] args) {
		
		int n=6;
		System.out.println("Fibonacci of"+n+"is"+fib(n));
	}

}
