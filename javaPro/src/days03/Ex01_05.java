package days03;

public class Ex01_05 {

	public static void main(String[] args) {
		
		// 대문자 +32 = 소문자
		//System.out.println('A'-'a'); // -32
		
		char a = 'x';
		char b;
		
		//b = a - 32;
		//Type mismatch: cannot convert from int to char
		
		b = (char) (a - 32);
		
		System.out.printf("%c\n", a - 32);
		
		System.out.printf("a=%1$c, b=%1$C\n", a);
		
		//'A' 문자코드값 65	     'a' 97
		//'B'         66     'b' 98

	}

}
