package days10;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex07;

/**
 * @author msg
 * @date 2025. 2. 14. - 오후 3:12:18
 * @subject 배열 단점: 자동으로 크기 증가x  --> 코딩으로 직접
 * @content
 */

public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int [] korArr = new int [3];
		int index = 0;
		String regex = "^(100|[1-9]?[0-9])$";
		int score;
		char con = 'y';
		
		do {
			System.out.printf("%d번 학생 점수 입력?", index+1);
//			score = scanner.nextInt();
			score = Ex07.getRandomInteger(0, 100);
			
			if (index == korArr.length) {
				int [] temp = new int [korArr.length + 2];
				for (int i = 0; i < korArr.length; i++) {
					temp[i] = korArr[i];
				} // for i
				korArr = temp;
			} // if
			
			korArr[index++]=score;
			
			System.out.println(">입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available()) ; // 13 (\r) 10(\n) 제거
			
//		} while (con == 'y'|| con =='Y');
		} while (Character.toUpperCase(con)=='Y');
		
		dispScore(korArr, index);
		
		// 최고점수/최저점수/점수평균

		int max, min;
		max = min = korArr[0];
		
		for (int i = 1; i < index; i++) {
			max = Math.max(max, korArr[i]);
			min = Math.min(min, korArr[i]);
			
		} // for i
		
		System.out.println(max);
		System.out.println(min);
		
		IntStream stream = IntStream.of(korArr);
		OptionalInt oMax = stream.limit(index).max();
		int maxScore = oMax.getAsInt();
		
		int minScore = IntStream.of(korArr).limit(index).min().getAsInt();
		double avgScore = IntStream.of(korArr).limit(index).average().getAsDouble();
	
		
		
//		for (int i = 0; i < korArr.length; i++) {
//			if (korArr[0]<korArr[i]) {
//				korArr[0] = korArr[i]	;					
//			} // if
//		} // for i
//
//		for (int i = 0; i < korArr.length; i++) {
//			if (korArr[1]>korArr[i]) {
//				korArr[1] = korArr[i]	;					
//			} // if
//		} // for i
		

		
		for (int j = 1; j < korArr.length; j++) {
			System.out.printf("%d \n",korArr[j]);
		} // for j
		System.out.println(korArr[0]);
		System.out.println(korArr[1]);
		
		
	
	} // main

	private static void dispScore(int[] korArr, int index) {
		System.out.printf("> 입력한 수 : %d명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("%d번 학생의 점수: %d점\n", i+1, korArr[i]);
		} // for i
		
	
		
	}

} //class
