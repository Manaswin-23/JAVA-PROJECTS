package demo;

public class QuadraticTime {

	public static void main(String[] args) {
		int[] nums= {10,20,30,40};
		boolean dup=false;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					dup=true;
					System.out.println("duplicate found:"+nums[i]);
				}
			}
		}
		if(!dup)
		{
			System.out.println("no duplication ");
		}

	}

}
