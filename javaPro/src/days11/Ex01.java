package days11;

import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
//		1. 한 반에 10명인 학생의 성적 관리
//        ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
//        1. 이름, 국,영,수 입력
//        2. 총,평, 등 계산 처리
//        3. 모든 학생 정보를 출력..
//   조건) 등수 처리하는 메서드를 만드세요. 
//   조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
//   조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.
         
		String name;
		int kor = 0, eng = 0, mat = 0 ;
		
		String [] names = new String [10];
		int [] kors = new int [10];
		int [] engs = new int [10];
		int [] mats = new int [10];
		int [] tots = new int [10];
		double [] avgs = new double [10];
		char con;
		int cnt = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("이름 국어 영어 수학 점수 입력?");
				if (cnt == avgs.length) {
//					String [] tempNames = new String [avgs.length + 3];
//					int [] tempKors = new int [kors.length + 3];
//					int [] tempEngs = new int [kors.length + 3];
//					int [] tempMats = new int [kors.length + 3];
//					int [] tempTots = new int [kors.length + 3];
//					double [] tempAvgs = new double [avgs.length + 3];
//					
//					for (int i = 0; i < cnt; i++) {
//						tempNames[i] = names[i];
//						tempKors[i]= kors[i];
//						tempEngs[i]= engs[i];
//						tempMats[i]= mats[i];
//						tempTots[i]= tots[i];
//						tempAvgs[i]= avgs[i];
//					}	                    
//				
//					names = tempNames;	
//					kors = tempKors;
//					engs = tempEngs;
//					mats = tempMats;
//					tots = tempTots;
//					avgs = tempAvgs;
					
					int len = names.length;
					names = Arrays.copyOf(names, len+3);
					kors = Arrays.copyOf(kors, len+3);
					engs = Arrays.copyOf(engs, len+3);
					mats = Arrays.copyOf(mats, len+3);
					tots = Arrays.copyOf(tots, len+3);
					avgs = Arrays.copyOf(avgs, len+3);
					
					
				} // if
				names[cnt] = getName();
				kors[cnt] = getScore();
				engs[cnt] = getScore();
				mats[cnt] = getScore();
				tots[cnt] = kors[cnt] + engs[cnt] + mats[cnt];
				avgs[cnt] = (double)tots[cnt]/3;
				
				cnt++;
		
				System.out.println("계속 입력?");
				con = (char)System.in.read();
				System.in.skip(System.in.read());
			
		} while (Character.toUpperCase(con)=='Y');
		
		int [] ranks = new int [cnt];
		for (int i = 0; i < cnt; i++) {
			ranks[i] = 1;
			for (int j = 0; j <cnt; j++) {
				if (tots[i] < tots[j]) ranks[i]++;	
			}
		}
		for (int j = 0; j < cnt; j++) {
			System.out.printf("[%d]: \t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
					j+1, names[j],kors[j],engs[j],mats[j],tots[j],avgs[j],ranks[j] );		
		}
		

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
		String name = new String(nameArr);
		return name ;
	}

} // class
