package days07;

public class Ex01_02 {

	public static void main(String[] args) {
		System.out.printf("%d(%c)\n", (int)'가', '가');
		System.out.printf("%d(%c)\n", (int)'힣', '힣');
		
		for (int i = '가'; i <'힣'; i++) {
			System.out.printf("%d(%c)\n", i, (char)i);
		} // for i

	}

}
