
public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("Helloa"));
	}

	public static int lengthOfLastWord(final String A) {

		String b = A.trim();

		if (b.length() == 0)
			return 0;

		String lastWord = "";

		for (int i = b.length() - 1; i >= 0; i--) {
			char c = b.charAt(i);

			if (c == ' ')
				break;
			lastWord = c + lastWord;
		}

		return lastWord.length();
	}

}
