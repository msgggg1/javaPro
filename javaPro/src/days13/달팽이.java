package days13;

public class 달팽이 {

	public static void main(String[] args) {
			// 정처기 실기
			int [][] m = new int [5][5];

			fillM04(m);
			dispM(m);


		} // main

	




	private static void dispM(int[][] m) {
		System.out.println("      0열  1열  2열  3열  4열");
		
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d행]", i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%2d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i
		
	}

	private static void fillM04(int[][] m) {
		for (int i = 0 ; i < m.length; i++) {
			if (condition) {
				
			} else {
				
			}
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5*i+j+1;
			} // for j 00 11
			System.out.println();
		} // for i
		
	} // main

} // class
