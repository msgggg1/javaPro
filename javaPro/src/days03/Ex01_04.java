package days03;

public class Ex01_04 {

	public static void main(String[] args) {
		
		System.out.printf("n\tame=\b%s\nage=%d\n", "홍길동", 20);
		
		//String.format(null, args) //printf와 매개변수 같음
		String strMoney = String.format("n\tame=\b%s\nage=%d\n", "홍길동", 20); //내가 원하는 문자열 형태로 바꾸려면 String.format사용. 나중에 사용할 목적, println은 그냥 출력 목적
				System.out.println(strMoney);
		//printf: 출력값 stream. string.format: 출력값 string
		
		
		
	}

}
