package days09;

/**
 * @author msg
 * @date 2025. 2. 13. - 오후 12:32:46
 * @subject 
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		String rrn = "830412-1700001";

		// [문제] 주민등록번호 뒷자리 7개 출력
		int beginIndex = 6;
		int endIndex = 14;
		String s = rrn.substring(beginIndex);
		int count = rrn.length() - s.length(); 
		System.out.println("*".repeat(count) + s);
		
		
////		1)  -*******
//		int beginIndex = 0; 
//		int endIndex = 7;
//		String s = rrn.substring(beginIndex, endIndex);
//		int count = rrn.length() - s.length();
//		System.out.println(s + "*".repeat(count));
//
//		//      2) -1******
//		beginIndex = 0; // <=
//		endIndex = 8;   //  <
//		s = rrn.substring(beginIndex, endIndex);
//		count = rrn.length() - s.length();
//		System.out.println( s + "*".repeat(count));
	}

}
