package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String replaceAll = text.replaceAll("\\D", "");
		char[] CharArray = replaceAll.toCharArray();
		for (int i = 0; i < CharArray.length; i++) {
			int value = Character.getNumericValue(CharArray[i]);
			sum = sum + value;
		}

		System.out.println("Method 1 : " +sum);
	}

}
