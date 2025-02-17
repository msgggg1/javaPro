package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3일차복습 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 1. 이름, 국어, 영어, 수학의 값을 입력받아서
		   총점, 평균을 계산하고 , 출력하기
		   ( 조건 : 평균은 소수점
		    2자리까지 출력 )
		   출력형식 예)  이름="홍길동",국어=89,영어=78,수학=90,총점=257,평균=85.67*/
		
		/*String name;
		byte kor;
		byte eng;
		byte mat;
		short tot;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름:");
		name = br.readLine();
				
		System.out.println("국어:");
		kor = Byte.parseByte(br.readLine());
		
		System.out.println("영어:");
		eng = Byte.parseByte(br.readLine());
		
		System.out.println("수학:");
		mat = Byte.parseByte(br.readLine());
		
		tot = (short)(kor + eng+ mat);
		
		avg = (double)tot/3;
				
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, tot, avg);
		
		
		*/
		
		//두 정수 x,y 변수를 선언하고 각각 1,2로 초기화하고  출력하고,
	    //두 값을 교환하고 x,y 값을 출력하는 코딩을 하세요.
		
		/*public static void main(String[] args) {
			int x = 1;
			int y = 2;
				
			System.out.printf("x=%d, y=%d\n", x, y);
				
			{int temp = x;
			x=y;
			y = temp;
					
				}
			System.out.printf("x=%d, y=%d", x, y);*/
	
	// 6.  String을  int로 형변환하는 코딩을 하세요.
		String s = "12";
		int i = Integer.parseInt(s);
	// 6-2.int을  String으로 형변환하는 코딩을 모두 하세요.
		//String s = 12 + ""; // " 12 "   -----> 모든 데이터타입에 + 빈"" ----> 문자열
		//String s = String.valueOf(i);
		//String.format("%d",i);  -----> 안 씀 
	
	
	
	

	} // main

} // class
