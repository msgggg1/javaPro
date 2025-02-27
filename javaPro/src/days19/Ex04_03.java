package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오전 11:41:20
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
//		System.out.println( "abC".compareTo("abc"));
//		System.out.println( "abC".compareToIgnoreCase("abc"));

		// http://
		String url = "http://www.naver.com";
//		String url = "ftp://www.naver.com";
//		String url = "https://www.naver.com";
		
//		url.charAt(0) == 'h';
//		url.charAt(0) == 'h';
//		url.charAt(0) == 'h';
//		url.charAt(0) == 'h';
//		url.charAt(0) == 'h';
//		url.charAt(0) == 'h';
		
//		url.substring(0, 7).equals("http://");
		
		// 메서드 O
		String prefix = "http://";
		System.out.println(url.startsWith(prefix));
	
		String fileName = "Sample.java";
		
		String suffix = ".java";
		System.out.println(fileName.endsWith(suffix));
		
		//startWith()	접두사
		//endsWith()
		
		// 정규표현식으로 체크
		String [] urls = {
				"www.naver.com", 
				"http://www.naver.com", 
				"ftp://www.naver.com",  
				"https://www.naver.com"
				
		};
		
		String regex = "http://.*"; //^ $ 의미 포함되어있음. -> "http://", .*뒤에 어떤문자가 몇개 와도 상관없음
		for (String u : urls) {
			if (u.matches(regex)) {
				System.out.println(u);
			} // if
		}
		
		
	} // main

} // class
