package days05;

/**
 * @author msg
 * @date 2025. 2. 7. - 오전 11:08:55
 * @subject  조건반복문 while 문 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// [for] 1~10 =55
		//  ㄴ 반복문
/*		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum += i;
			System.out.println(sum);
			*/
		
		//[while]문 1 ~10 = 55
		//	ㄴ 조건반복문: condition이 참일 동안 {} while문 블럭을 실행하는 반복문 // if는 한번만 실행, while은 거짓될때까지 반복
		
		/*
		while (condition) {
			
			
		}// while 조건식 거짓 -> 넘어감/ 참->실행후 다시 계속 돌아감
		
		do {//최소한 한번은 실행함
			
		} while (condition);
		
		//
		 */

		
	//	} // for i
		
	/*	if (조건)
			명령문 한줄
		  if 절 x
		if (조건) 명령문 한줄
		
		if, for, while 모두 동일
		
		*/
		
		int i = 1;
		int sum = 0 ;
		
	//	while ( i <= 10) { // i++ <=3  1 <=3 -> i=2
			while ( ++ i <= 3) { // 2<3
			System.out.printf("%d+",i);
			sum += i;
			// i++; 
			// ++i; -> 11
					
		} //  while  
		
		System.out.printf("=%d", sum);
		
		

	} // main

} //class
