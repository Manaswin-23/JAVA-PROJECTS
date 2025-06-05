package demo;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchSort {

	public static void main(String[] args) {
		   String[] names= {"Sai","Ravi","Ram","Janu"};
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the name to search:");
		   String s=sc.nextLine();
		   if(Arrays.asList(names).contains(s))
		   {
			   System.out.println("exists name:"+s);
		   }
		   else
		   {
			   System.out.println("not Exists name");
		   }
		  sc.close();

	}
}
