
public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(10));
	}

	public static String countAndSay(int A) {
		String result = "";

		if (A == 1)
			return "1";
		if (A == 2)
			return "11";

		String smallerResult = countAndSay(A - 1);

		char firstChar = smallerResult.charAt(0);
		String charRep = "" + firstChar;

		for (int i = 1; i < smallerResult.length();) {
			char nextChar = smallerResult.charAt(i);

			if (firstChar == nextChar) {
				charRep += nextChar;
				i++;
			} else {
				result = result + String.valueOf(charRep.length()) + firstChar;
				charRep = "";
				firstChar = nextChar;
			}
		}

		if (!charRep.equals("")) {
			result = result + String.valueOf(charRep.length()) + charRep.charAt(0);
		}

		return result;

	}

}
