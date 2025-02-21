package days14;

import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 5:07:38
 * @subject
 * @content 한 반 30명의 성적관리
 * 			(이름, 국어, 영어, 수학, 총점, 평균, 등수)
 * 			1. 입력 정보 - 이름, 국어, 영어, 수학
 * 			2. 총점, 평균, 등수 계산 처리
 * 			3. 모든 학생 정보 출력
 * 
 * 
 * 복습 하고, chapter6 읽고, 등수처리
 */

public class Ex12 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		final int STUDENT_COUNT = 30;
		
		// 클래스 배열 선언
		Student [] students = new Student [STUDENT_COUNT];
		
		int cnt = 0; // 입력받은 학생 수 저장할 변수
		char con = 'y';
		
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		
		do {
			// 한 학생의 정보를 입력
			System.out.printf("[%d번] 학생 이름, 국어, 영어 수학 입력?", cnt+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			
			tot = kor + eng + mat ;
			avg = (double)tot/3;
			rank = 1;// rank 계 속 바뀜 -> 마지막에 처리
			// 각 배열에 요소로 추가. (각 배열의 index ==> cnt 처리)
			s.no = cnt +1 ;
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = 1;
			
			students[cnt]=s;
			
			// 입력받은 학생 수 1증가
			cnt++;
			// 입력 계속 여부 체크
			System.out.println(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13 10
			
		} while (Character.toUpperCase(con)=='Y');
		
		// 등수 처리
		// tot 비교
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (students[i].tot < students[j].tot) students[i].rank ++ ;		
			} // if		
		} // for i
		for (int i = 0; i <cnt; i++) {
				System.out.println(students[i].s);
		} // for i

		
	} // main



	public static String getName() {
	      // '가' ~ '힣'
	      // 44032 ~ 55203
	      
	      // 5 ~ 13
	      // 0 ~ 8                -5
	      // 5 <=  (int)(Math.random()*9)+5 <= 13
	      
	       
	      //char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');
	      
	      char [] nameArr = new char[3];
	      Random rnd = new Random();
	      for (int i = 0; i < nameArr.length; i++) {
	         nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
	      }
	      
	      // char[] -> String 변환
	      String name = new String(nameArr);
	      return name;
	   }

	   public static int getScore() {
	      return  (int)( Math.random()*101 ) ;
	   }
	
} // class
