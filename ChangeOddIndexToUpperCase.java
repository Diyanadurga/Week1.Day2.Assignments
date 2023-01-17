package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeuc";
		char[] CharArray = test.toCharArray();		
		for (int i=0;i < CharArray.length;i++)
		{
			if (i % 2 != 0)				
			{
				char convertedChar =Character.toUpperCase(CharArray[i]);
				System.out.println(convertedChar);
			}else
			{
				System.out.println(CharArray[i]);
			}
		}
	}
}
