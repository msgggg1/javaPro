package days14;

public class Ex01_02 {

	public static void main(String[] args) throws InterruptedException {
		
		int [][] m = new int [5][5];
		//마방진
		magicSquare(m); //열증가 행감소 
		
		dispM(m);
		
	} // main

	private static void magicSquare(int[][] m) throws InterruptedException {
		
		int row = 0, col = 2;
		int nextRow, nextCol;
		int v = 1;
		m[row][col] = v;
		
		//for -  i: 값으로 25까지
		
		while (v <= 25/*m.leg*m[0].leg*/) {
			
//			Thread.sleep(1000); // 1초 현재 스레드(일꾼) 일시 정지
//			dispM(m);
			
			// 1.열 증가 , 행 감소
			nextCol = col + 1;
			nextRow = row -1;
			
			// 2. 행 벗어난 경우 row=0&&감소 => row = -1
			if (nextRow<0) {
				nextRow = 4 /*m.length-1*/; 
			} // if
				
			// 3. 열 벗어난 경우
			if (nextCol>4/**/) {
				nextCol = 0 ;
			} // if

			// 4. 그 다음 위치에 값이 있는 경우
			if (m[nextRow][nextCol] != 0) {
				nextRow = row + 1 ;
				nextCol = col ;
			
				
			} // if
			m[nextRow][nextCol] = ++v;
			row = nextRow;
			col = nextCol ;
		} //  while
	
	
	}

	private static void whelk(int[][] m) {
		
		
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
