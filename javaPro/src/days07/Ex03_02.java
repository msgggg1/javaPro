package days07;

public class Ex03_02 {

	public static void main(String[] args) {
		
		String data = "홍길동 ,  이창익,	서영학 , 정창기"; //
		String regex = "\\s*,\\s*";
		String [] names = data.split(regex);

		for (String name : names) {
//			System.out.printf("[%s]\n", name.trim()); // 앞뒤 공백 제거 ///  regex -> 정규표현식 쓸수있는 문자열
			System.out.printf("[%s]\n", name); 
		}
		
	} //  main

} // class
