package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days14.Student;

public class Ex03_review {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		final int STUDENT_COUNT = 30;
		
		ArrayList list = new ArrayList();
		
		int cnt = 0; // 입력받은 학생 수 저장할 변수
		char con = 'y';
		
		Scanner scanner = new Scanner(System.in);
		
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
			Student s = new Student();
			s.no = cnt +1 ;
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = 1;
			
			list.add(s);
			
			// 입력 계속 여부 체크
			System.out.println(">학생 입력 계속?");
			try {
				con = (char)System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.in.skip(System.in.available());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 13 10
			
		} while (Character.toUpperCase(con)=='Y');
		
		
		
		procRand(list);
		disp(list);
		
	} // main
	
	private static void procRand(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			for (int j = 0; j < list.size(); j++) {
				Student r = (Student) list.get(j);
				if (s.tot < r.tot) s.rank ++ ;		
			} // if		
		} // for 
	}

	private static void disp(ArrayList list) {
		System.out.printf("입력받은 학생수: %d명", list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		} //while
		
	}

	public static String getName() {
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
