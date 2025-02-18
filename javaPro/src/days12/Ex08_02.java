package days12;

/**
 * @author msg
 * @date 2025. 2. 18. - 오후 5:27:06
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		int [][][] m = new int [2][3][4]; 
		/*        m[0]      m[1]
	       *       [0x200주소][주소]                  [0x100주소]
	       *       0x100                              m
	       *       
	       *         m[0][0]
	       *       [0x300주소][주소][주소]
	       *       0x200
	       *       
	       *       [4바이트][4바이트][4바이트][4바이트]
	       *       0x300
	       * */
		
		dispM(m);

	} // main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) { // 면크기
			System.out.printf("[%d]면\n",i);
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]", i, j, k, m[i][j][k]);
				} // for k
				System.out.println();
			} // for j
			System.out.println();
		} // for i
		
	}

} // class
