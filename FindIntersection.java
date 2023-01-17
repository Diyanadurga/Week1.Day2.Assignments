package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] n1 = { 37,42,11,94,64,74 };
		int[] n2 = { 89,42,11,49,88,74 };
		
		for(int i=0;i<n1.length;i++)
		{
			for (int j=0;j<n2.length;j++)
			{
				if (n1[i] == n2[j])
				{
					System.out.println(n1[i]);
				}
			}
		}
	}

}
