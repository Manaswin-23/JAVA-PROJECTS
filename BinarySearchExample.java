package demo;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] nums= {2,3,4,5,6,7,8,9};
		int left=0;
		int right=nums.length-1;
		int target=8;
		boolean found=false;
		while(left<right)
		{
			int mid=(left+right)/2;
			if(nums[mid]==target)
			{
				System.out.println("found"+" "+target+" "+"at :"+mid);
				found=true;
				break;
			}
			else if(target<nums[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		if(!found)
		{
			System.out.println("number"+target+"not found");
		}

	}

}
