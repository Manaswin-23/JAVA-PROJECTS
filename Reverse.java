package demo;
import java.io.*;
import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		String s=sc.nextLine();
		String Rev=new StringBuilder(s).reverse().toString();
		System.out.println("Reversed string: " + Rev);

        sc.close();
    }


}

