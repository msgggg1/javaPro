package days11;

import java.io.StreamCorruptedException;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
//		1. 한 반에 10명인 학생의 성적 관리
//        ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
//        1. 이름, 국,영,수 입력
//        2. 총,평, 등 계산 처리
//        3. 모든 학생 정보를 출력..
//   조건) 등수 처리하는 메서드를 만드세요. 
//   조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
//   조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.
         
		String name = getName();
		int kor = getScore();
		int eng = getScore();
		int mat = getScore();
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		int rank = 1;
		
		String [] names = new String [10];
		int [] kors = new int [10];
		int [] engs = new int [10];
		int [] mats = new int [10];
		int [] tots = new int [10];
		double [] avgs = new double [10];
		
		int index = 0;
		for (int i = 0; i < avgs.length; i++) {
			if (index == avgs.length) {
				String [] tempNames = new String [avgs.length + 3];
				int [] tempKors = new int [kors.length + 3];
				int [] tempEngs = new int [kors.length + 3];
				int [] tempEngs = new int [kors.length + 3];
				int [] tempTots = new int [kors.length + 3];
				double [] tempAvgs = new double [avgs.length + 3];
			
			} // if
		} // for i
		if
		
		

	} // main

	private static int getScore() {
		int score =(int)(Math.random()*101) ;
		return score;
	}

	private static String getName() {
		Random rnd = new Random();
		char [] nameArr = new char [3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+ 1) +'가');
		} // for i
		return null;
	}

} // class
