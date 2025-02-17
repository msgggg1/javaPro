package days03;

/**
 * @author msg
 * @date 2025. 2. 5. - 오후 4:06:25
 * @subject  논리연산자
 * @content
 */
public class Ex07_04 {

	public static void main(String[] args) {
		/*
		 * 1. 일반 논리 연산자
		 *   1) !	부정연산자 또는 Not 연산자, boolean 형 앞에 붙일 수 있음
		 *   2) &&	일반 논리 AND 연산자 ( 논리곱 연산자 )
		 *      true  && true  => true(1)
		 *      false && true  => false(0)
		 *      true  && false => false
		 *      false && false => false
		 *   3) ||	일반 논리 OR 연산자  ( 논리합 연산자 )
		 *      true  || true  => true
		 *      false || true  => true
		 *      true  || false => true
		 *      false || false => false
		 *      
		 * 연산 우선 순위   !   >   &&   >  ||
		 *      
		 * 2. 비트 논리 연산자  // 다룰일은 없음
		 *   1) ~	비트 부정 연산자 또는 틸트 연산자
		 *   2) &	비트 논리 AND 연산자
		 *   3) |   비트 논리 OR 연산자
		 *   4) ^	e[X]clusive OR 연산자, XOR 연산자 
		 *   		베타적인
		 *   
		 * ★★★★★  논리연산자 우선순위   ★★★★★
		 *   ~  ! >   &   >   ^   >   |   >  &&  >  ||
		 *   
		 * */
		
		// 연산자 우선 순위 파악   [!]    > 
		/*
		// !
      //System.out.println( !5 > 3 ); // !은 boolean형 앞에만 사용가능
		System.out.println( true ); 
		System.out.println( !true );
		
		//&&
		System.out.println( 3>5 && 5<7 );
		//                   false && 뒤에 연산 안함 
		//                   효율적 연산( short circuit evaluation )
		
		// ||
		System.out.println( 13>5 || 5<7 );
		//                   참     연산 x -> 효율적 연산
		*/
		
		// &
		System.out.println( 10 & 3 );//2
		// 		0000 1010
		// 	 &  0000 0011
		//      0000 0010
		
		System.out.println( 10 | 3 );//11
        // 		0000 1010
		// 	 |  0000 0011
		//      0000 1011
		
		System.out.println( 10 ^ 3 );//9
        // 		0000 1010
		// 	 ^  0000 0011
		//      0000 1001
		
		//System.out.println( 10 );
		//System.out.println( ~10 ); // -11
		
		//             ~0000 1010
		//              1111 0101
		//				1111 0100
		//				0000 1011
		//					0821
		// 					-11

	} // main

} //class
