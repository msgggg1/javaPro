package days05;

/**
 * @author msg
 * @date 2025. 2. 7. - 오후 2:29:23
 * @subject
 * @content
 */

public class Ex06 {

	public static void main(String[] args) {
		    
		// [while] 1~10
		
		int i = 1, sum = 0;
		// 1 -> Type mismatch: cannot convert from int to boolean -> true
		while (true) { //무한루프
			if(i==11) break;
			System.out.printf("%d+",i);
			sum += i;
			i++;
					
		} //  while
		
		// Unreachable code -> if () break;
		System.out.printf("\b=%d\n", sum);
	

	} //main

} // class
