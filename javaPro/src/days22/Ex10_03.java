package days22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 4:42:13
 * @subject days13.Ex04.java
 * @content 배운 컬렉션 클래스를 사용해서 구현
 * 
 * 	 입력 형식
 *   > 게임 횟수 입력 ? 3
 *   
 *   출력형식
 *    [1 게임]      [42][36][21][38][6][26]
      [2 게임]      [11][7][19][2][25][15]
      [3 게임]      [36][33][44][42][18][10]
 */
public class Ex10_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임횟수 입력?");
		int gameNumber = scanner.nextInt();

		//
		ArrayList  list = new ArrayList(gameNumber);
		
		for (int i = 0; i < gameNumber; i++) {
			HashSet lotto = new HashSet();
			fillLotto(lotto);
			list.add(lotto);
		} // for i
		
		for (int i = 0; i < gameNumber; i++) {
			System.out.printf("%d게임 : ",i+1);
			dispLotto((HashSet)list.get(i));
		}
		
		

	} // main
	
	
	private static void fillLotto(HashSet lotto) {
		  Random rnd = new Random();
		  int n = 0;
		  while (lotto.size()<6) {
			n = rnd.nextInt(45)+1 ;
			lotto.add(n);
		} //  while
		
	}

	private static void dispLotto(HashSet lotto) {
		// Set -> List 변환
		ArrayList list = new ArrayList(lotto);
		Collections.sort(list);
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%02d]", n);
		}
		System.out.println();
		
	}




} // class
