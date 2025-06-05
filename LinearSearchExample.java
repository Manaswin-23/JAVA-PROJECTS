package demo;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums= {1,2,3,4,5,6};
		int target=5;
		boolean found=false;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
			{
			System.out.println("found"+" "+target+"at index"+":"+i);
			found=true;
			break;
		}
		
		}
	}

}
