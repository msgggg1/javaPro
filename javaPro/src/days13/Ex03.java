package days13;

/**
 * @author msg
 * @date 2025. 2. 19. - 오전 11:12:48
 * @subject 	가변 배열 (행마다 열개수가 다름)
 * @content
 */

public class Ex03 {

	public static void main(String[] args) {
		// 가변 배열 선언
		int [][] m = new int[3][];
		m[0]= new int [25];
		m[1] = new int [20];
		m[2] = new int [28];
		
		dispM(m);

	} // main
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i
	}
		
} // class
