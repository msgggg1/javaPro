package days03;

/**
 * @author msg
 * @date 2025. 2. 5. - 오후 3:19:14
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
//		int i = 100;
		int i = Integer.MAX_VALUE;
		int j =200;
//		int k = i+j; // int 산술 오버플로우 발생
        // 하나 강제로 long 형변환
		long k = i + (long)j;
		
		System.out.printf("%d + %d = %d \n", i ,j ,k);

	} // main

} //class
