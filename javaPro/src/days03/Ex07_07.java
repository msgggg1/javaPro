package days03;

/**
 * @author msg
 * @date 2025. 2. 5. - 오후 5:06:40
 * @subject
 * @content
 */
public class Ex07_07 {

	public static void main(String[] args) {
		
		// +, - 부호연산자(양수, 음수), 단항연산자
		//System.out.println( +3 );
		//System.out.println( -3 );
		
		// instanceof 연산자 : 클래스 수업 후 다룸

		// [ 증감연산자  ++  -- ] 무조건 1만 증감. n은 안됨
		// [문제] 어떤 기억공간의 값을 1증가 시키는 코딩을 하세요
		// [문제] 어떤 기억공간의 값을 1감소 시키는 코딩을 하세요
		// [문제] 어떤 기억공간의 값을 5증가 시키는 코딩을 하세요
		int x = 10;
		// x = 11;
		// 1) x = x+ 1;
		// 2) x += 1;
		// 3) x++;     후위형                 x--;  전위형
		//++x;      					  //--x;
		//단독으로 증감연산자를 사용할때는 앞뒤 상관x. 결과값 전위형 == 후위형
		
		
		
		System.out.println( x );
		
		// int y = ++x; (우선순위 ++ > =) // 전위형
		 int y = x++;			// 후위형 -> 우선순위 상관없이 다른연산자 먼저 처리
		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
	} // main

} // class
