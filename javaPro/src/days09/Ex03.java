package days09;

import java.util.Arrays;
import java.util.Random;

import days08.Ex07;

/**
 * @author msg
 * @date 2025. 2. 13. - 오전 11:19:44
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/* 결재할 때마다 영수증보면 임의의 숫자 4개가 ****로 출력.
			"7655-****-9234-5677"
			"7655-8988-9234-****"
			"****-8988-9234-5677"
			"7655-8988-****-5677"*/
		
		String card ="7655-8988-9234-5677";
//			
//		String regex = "\\s*-\\s*";
//		String [] cardNum = card.split(regex);
//		
//		System.out.println(Arrays.toString(card));
//		
//		int n;
//		n = (int) (Math.random()*4);
//		cardNum[n] = "****";
//		
//		System.out.println(card);
		
		String [] cardArr = card.split("-");
		
		
//		int index = Ex07.getRandomInteger(0, 3);
//		랜덤 수 발생
//		1) Math.random
//		2) random 클래스 사용
		Random rnd = new Random();
//		rnd.nextBoolean(); // 랜덤 true/false
//		rnd.nextInt();
		int index = rnd.nextInt(4); // 0 <= int < bound 돌려줌.
		
//		new Random().nextInt(4);
		
		cardArr[index] = "****";
		
		// 각각의 cardArr 배열 요소를 -으로 연결해 출력
//		System.out.printf("%s-%s-%s-%s",cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		String result = String.join("-", cardArr);
		System.out.println(result);

	} // main

} // class
