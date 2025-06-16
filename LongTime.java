package demo;

public class LongTime {

	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		int target=40;
		int low=0;
		int high=nums.length-1;
		while(low <= high)
		{
			int mid=(low+high)/2;
			if(nums[mid]==target)
			{
				System.out.println("found number"+target+" at position "+mid);
				return ;
			}
			else if(nums[mid]<target)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("not found number");

	}

}
