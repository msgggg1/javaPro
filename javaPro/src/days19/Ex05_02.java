package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 2:39:35
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {

		
		
		/*[1]
//		long start = System.currentTimeMillis();
		long start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum += i;
		} // for i
//		long end = System.currentTimeMillis();
		long end = System.nanoTime();
//		System.out.println(">> 처리 시간 :  "+ (end-start)+"ms");
		System.out.println(">> 처리 시간 :  "+ (end-start)+"ns");
		*/
		
		//[2] 
//		testString();
		testStringBuffer();
		
	} // main

	private static void testStringBuffer() {
		long start = System.nanoTime();
//		String s = "a";
		StringBuffer s = new StringBuffer("a");
		for (int i = 0; i < 2000000; i++) {
			s.append("a");
		} // for i
		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  "+ (end-start)+"ns");
		
	} // 0.01초

	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 2000000; i++) {
			s += "a";
		} // for i
		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  "+ (end-start)+"ns");
	} //9분

} // class
