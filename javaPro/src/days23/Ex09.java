package days23;

public class Ex09 {

	public static void main(String[] args) {
		for (int i = 0; i < 'z'; i++) {
			if (Character.isAlphabetic(i)||Character.isDigit(i)) {
				System.out.printf("%c(%d)\n", (char)i,i);
			} // if
		} // for i

	}

}
