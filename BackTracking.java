package demo;

public class BackTracking {
	public static void makeword(String cur,String letters)
	{
		if(cur.length()==3)
		{
			System.out.println(cur);
			return ;
		}
		for(int i=0;i<letters.length();i++)
		{
			makeword(cur+letters.charAt(i),letters);
		}
	}

	public static void main(String[] args) {
		makeword(" ","sai");

	}

}
