package demo;

public class ConstantTime {
	public static void printFirst(int[] arr)
	{
		if(arr.length > 0)
		{
			System.out.println("first element:"+arr[0]);
		}
		else
		{
			System.out.println("Array is empty:");
		}
	}

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50,60,70,80,90,100};
		printFirst(num);

	}

}
