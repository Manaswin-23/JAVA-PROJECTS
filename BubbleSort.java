package demo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums= {5,3,8,4,2};
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=0;j<nums.length-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println("sorted List");
		for(int n:nums)
		{
			System.out.println(n);
		}
	}

}
