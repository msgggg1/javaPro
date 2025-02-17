package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 12. - 오후 2:15:42
 * @subject 메소드 선언 + 호출
 * @content
 */
public class Ex06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

				String name;
				byte kor, eng, mat;
				short tot;
				double avg;

				Scanner sc = new Scanner(System.in);

				name = getName(sc); 
				
				kor = getScore(sc, "국어");
				eng = getScore(sc, "영어");
				mat = getScore(sc, "수학");
				
				System.out.println(name);
				
				tot = getTotal(kor, eng, mat);
				avg = getAvg(tot);
				
				printScore(name, kor, eng, mat, tot, avg); 
				

	} // main

	private static void printScore(String name, byte kor, byte eng, byte mat, short tot, double avg) {
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f\n", 
				name, kor, eng, mat, tot,avg);	
	}

	private static double getAvg(short tot) {
		// 
		return (double)tot/3;
	}

	private static short getTotal(byte kor, byte eng, byte mat) {
		// TODO Auto-generated method stub
		return (short)(kor + eng + mat);
	}

	private static byte getScore(Scanner sc, String subject) {
		// 0 ~ 100 유효성 검사 (String.matches() 사용
		// 무슨점수?
		byte score;
		String strScore;
//		String regex = "[0-9]{1,3}";
		String regex = "^(100|[1-9]?\\d)$";
		//  * :0~여러번
		/* ? -> 0 or 1
		 * {n} : n번
		 * {n,m}: n~m번
		 * [0-9]  == \d != \D
		 * [^0-9]: 0-19가 오면 안됨
		 * *
		 */
		//^:시작부터, $: 끝 
		
		boolean isFirst = false;
		
		do {
			if (isFirst) {
				System.out.println("[다시]");
			} // if
			System.out.printf("> %s 점수입력?", subject);
			strScore = sc.next();
			isFirst = true;
		} while (!strScore.matches(regex));
		 
		
		score = Byte.parseByte(strScore);
		return score;
	}

	private static String getName(Scanner sc) {
		System.out.print("이름?");
		String name = sc.next();
		return name;
	}

//	private static String getName() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름?");
//		String name = sc.next();
//		return name;
//	}

} //class
