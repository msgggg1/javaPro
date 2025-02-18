package days12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author msg
 * @date 2025. 2. 18. - 오전 10:20:57
 * @subject 배열 섞기(카드 섞기, 화투 섞기)
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i +1;
		} // for i
		System.out.println(Arrays.toString(m));

		shuffle(m);

		System.out.println(Arrays.toString(m));


		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */

	} // main 

	private static void shuffle(int[] m) {

		int idx1 = 0, idx2;
		Random rnd = new Random();
		
		for (int i = 0, temp; i < 10; i++) { 
			idx2 = rnd.nextInt(m.length-1)+1; // 1~9         
			System.out.printf("%d - %d \n", idx1, idx2);
			temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		} // for i
	}


	//		int idx1, idx2;
	//		Random rnd = new Random();
	//		
	//		for (int i = 0; i < m.length; i++) {
	//			idx1 = rnd.nextInt(m.length);
	//			idx2 = rnd.nextInt(m.length);
	//			
	//			if (idx1 == idx2) i--;
	//			else {
	//				System.out.printf("%d - %d \n", idx1, idx2);
	//				int temp = m[idx1];
	//				m[idx1] = m[idx2];
	//				m[idx2]= temp;
	//			
	//			}
	//		} // for i


	//		for(int i=0; i<10; i++) {
	//			int[] randomPos = new Random().ints(0,10).distinct().limit(2).toArray();
	//			int tmp = m[randomPos[0]];
	//			m[randomPos[0]] = m[randomPos[1]];
	//			m[randomPos[1]] = tmp;
	//		}



} // class
