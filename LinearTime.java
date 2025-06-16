package demo;

public class LinearTime {
	public static void printAll(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("element:"+i+":"+arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] nums= {10,20,30,40};
		printAll(nums);

	}

}
