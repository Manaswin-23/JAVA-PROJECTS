package demo;

public class InsertionSort {
	public static void insertionsort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public static void printArray(int[] arr)
	{
		for(int num:arr)
		{
			System.out.println(num);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr= {9,7,5,3,1,0,2,4,6,10};
		InsertionSort is=new InsertionSort();
		System.out.println("Before sort:");
		printArray(arr);
		insertionsort(arr);
		System.out.println("After sort:");
		printArray(arr);
	}

}
