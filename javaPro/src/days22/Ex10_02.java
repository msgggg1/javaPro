package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 4:17:38
 * @subject
 * @content
 * 
 * 특징 알기
 */
public class Ex10_02 {

	public static void main(String[] args) {
		  HashSet lotto = new HashSet();
		  
		  fillLotto(lotto);
		  dispLotto(lotto);
		  		  

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
		/*
		Object [] arr = lotto.toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		*/
	}
		/*[1] 정렬X, 순서X
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%02d]", n);
		}
		System.out.println();
	}
		*/
} // class
