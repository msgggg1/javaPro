package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author msg
 * @date 2025. 2. 5. - 오후 2:11:26
 * @subject
 * @content // Type Convert(형 변환)
		    // 1) 자동 형 변환
		    // 2) 강제 형 변환
 * 
		     int -> byte
		     byte -> long 같은 정수계열끼리도 형변환임
 */
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		// [문제]
		// 이름, 국어, 영어, 수학 점수 입력받아서 
		// 총점
		// 평균
		// [출력]
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33

		String name;
		byte kor, eng, mat;
		short tot;
		double avg;

		/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("점수를 입력하세요.");

		name = br.readLine();
		kor = Byte.parseByte(br.readLine());
		eng = Byte.parseByte(br.readLine());
		mat = Byte.parseByte(br.readLine());
		tot = Short.parseShort(kor+eng+mat);
		avg = Double.parseDouble(tot/3);

		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%d", name, kor, eng, mat, tot, avg);
		 */



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("> 이름 입력?");
		name = br.readLine(); 
		
		System.out.print("> 국어 입력? ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("> 영어 입력? ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("> 수학 입력? ");
		mat = Byte.parseByte(br.readLine());
		
		// short =/= int
		// Type mismatch: cannot convert from int to short
		//tot = kor + eng + mat;// cpu 내부에서 int보다 작은 자료형 처리할때 내부적으로 결과값을 int로 처리
		//tot = (short)kor + eng + mat;
		tot = (short)(kor + eng + mat);

		//avg = tot /3;
		//avg = (double)tot/3;   
		avg = tot/(double)3;
		//avg = (double)(tot/3);
	
		
		//cannot cast from String to byte : 숫자타입일때만 사용

		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n", name, kor, eng, mat, tot,avg);


	}//main

}//class
