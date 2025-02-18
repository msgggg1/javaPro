package days12;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * @author msg
 * @date 2025. 2. 18. - 오후 2:35:30
 * @subject 배열 선언 * int 100      0~9 임의의 정수 채워넣고
 * @content 0 11개
 * 			1 3개
 * 			2 20개
 */
public class Ex05 {

	public static void main(String[] args) {
		
		
//		int [] m = new int [100];
//		Random rnd = new Random();
//		for (int i = 0; i < m.length; i++) {
//			m[i] = rnd.nextInt(10);
//		} // for i
		
		//[3]
//		int [] m = new int [100];
//		Random rnd = new Random();
		
		/*
		m = IntStream.generate(new IntSupplier() {
			
			@Override
			public int getAsInt() {
				// TODO Auto-generated method stub
				return rnd.nextInt(10);
			}
		}).limit(100).toArray();
		*/
		//  -> :람다, 람다를 이용한 수식 ==람다식
//		m = IntStream.generate(() -> rnd.nextInt(10)).limit(100).toArray();
//		
		
		
		int [] m = new Random().ints(0,10).limit(100).toArray();
		System.out.println(Arrays.toString(m));
		
//		0 11개
//		1 3개
//		2 20개
		
//		10*100번
//		for (int i = 0; i <= 9; i++) {
//			int count = 0;
//			for (int j = 0; j < m.length; j++) {
//				if (m[j] == i) count++;		
//			} // for j
//			System.out.printf("%d: %d개\n", i, count);
//		} // for i
		
		//[2]
		int [] countArr = new int [10];
		for (int i = 0; i < m.length; i++) {
			countArr[m[i]]++;	
		} // for j

	} // main

} // class
