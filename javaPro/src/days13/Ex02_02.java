package days13;

/**
 * @author msg
 * @date 2025. 2. 19. - 오전 10:38:35
 * @subject
 * @content
 * 			2차원 배열의 초기화 설명
 */

public class Ex02_02 {

	public static void main(String[] args) {

		//		int [][] m = new int[2][4]; // 2행 4열 int 2차원 배열
		//		m[][]=;

		//2차원 배열의 초기화
//		int [][] m = new int [][] {
//			                       {1,2,3,4}, //0행
//			                       {5,6,7,8} //1행
//												};

//		int [][] m =  {
//						{1,2,3,4}, //0행
//						{5,6,7,8} //1행
//									};

		int [][] m =  {{1,2,3,4}, {5,6,7,8}};

		dispM(m);

	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i


} // main

} // class
