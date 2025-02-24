package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오전 11:10:11
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// 가변인자 사용 중이었음.
//		System.out.printf();

		String [] names = {
						"홍",
						"김",
						"이",
						"오"
				
					};
		System.out.println(joinNames("/", names));
		System.out.println(joinNames("-", names));
		
	} // main
	
	public static String joinNames(String delimiter, String...args) {// 가변인자 제일 끝에(어디까지인지 모름)
		return String.join(delimiter, args);
	}
} //class
