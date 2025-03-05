package days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex10_04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임횟수 입력?");
		int gameNumber = scanner.nextInt();
		
		HashSet lotto = new HashSet();
		ArrayList gameList = new ArrayList();
		
		fillLotto(lotto, gameList ,gameNumber);
		dispLotto(lotto, gameList ,gameNumber);

	} // main
	
	private static void dispLotto(HashSet lotto, ArrayList gameList, int gameNumber) {
	Iterator ir = gameList.iterator();
	while (ir.hasNext()) {
		int n = (int) ir.next();
		System.out.printf("[%02d]", n);
	}
	
}

private static void fillLotto(HashSet lotto, ArrayList gameList, int gameNumber) {
	
	while (gameList.size()<gameNumber) {
		 Random rnd = new Random();
		  int n = 0;
		  while (lotto.size()<6) {
			n = rnd.nextInt(45)+1 ;
			lotto.add(n);
		} //  while
		  
	} //  while
	
}
	
} // class
