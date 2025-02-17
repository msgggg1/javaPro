package days10;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 14. - 오후 12:28:01
 * @subject
 * @content
 */
public class Ex03_06 {

	public static void main(String[] args) {
		// [별 찍기 -6] 이등변삼각형
		// ____*     :3  3  4
		// ___***    :4  2  3
		// __*****   :5  1  2
		// _*******         1
		// **********

		//[2]
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i+j<=5?"*":" ");
			} // for j
			System.out.println();
		} // for i




		//[1]

		//		for (int i = 1; i <= 3; i++) {
		//			for (int j = 1; j <= 3-i; j++) {
		//				System.out.print("_");
		//			} // for j
		//			for (int j = 1; j <= 2*i -1 ; j++) {
		//				System.out.print("*");
		//			} // for j
		//			System.out.println();
		//		} // for i


		//[2] 행의 갯수를 입력받아서 이등변 삼각형 그리기.
		// [별 찍기 -6] 이등변삼각형   4  5
		// ____*     :3  3  4
		// ___***    :4  2  3
		// __*****   :5  1  2
		// _*******         1
		// **********

		Scanner scanner = new Scanner(System.in);
		System.out.println("행의 개수 입력");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i ; j++) {
				System.out.print("_");
			} // for j
			for (int j = 1; j < 2*i ; j++) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i


	}//main



} // class





