package days14;

public class Ex01 {

	public static void main(String[] args) {
		int [][] m = new int [5][5];
		
		//골뱅이
		whelk(m);
		//마방진

		dispM(m);
		
	} // main

	private static void whelk(int[][] m) {
		int n = 5; // 수행 횟수
		int row = 0, col = 0; // 헹, 열 인덱스
		int v = 1;
		
		// 행 고정     열증가+1/열감소 -1   for문 (수행횟수)
		for (int i = 0; i < n; i++) {
			m[row][col] = v++;
			col++;
		} // for i
		
		col--;
		n--; // 수행횟수 1감소
		// 열 고정 행증가/행감소   for문
		for (int i = 0; i < n; i++) {
			m[row][col] = v++;
			row++;
		} // for i
		
	}

	private static void dispM(int[][] m) {
		System.out.println("     0열 1열 2열 3열 4열");	    
		for (int i = 0; i < m.length; i++) {           // 행크기
			System.out.printf("%d행 " , i);
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				System.out.printf("[%2d]", m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i

	}
} // class
