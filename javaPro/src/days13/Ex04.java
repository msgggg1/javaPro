package days13;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 19. - 오전 11:20:53
 * @subject
 * @content
 * 	 입력 형식
 *   > 게임 횟수 입력 ? 3
 *   
 *   출력형식
 *    [1 게임]      [42][36][21][38][6][26]
      [2 게임]      [11][7][19][2][25][15]
      [3 게임]      [36][33][44][42][18][10]
 */

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임횟수 입력?");
		int gameNumber = scanner.nextInt();
		
		int [][] lotto = new int [gameNumber][6];
		
		
		fillLotto(lotto, gameNumber);
		dispLotto(lotto, gameNumber);
		
	}

	private static void dispLotto(int[][] lotto, int gameNumber) {
		
		for (int i = 0; i < gameNumber; i++) {
			System.out.printf("%d게임 : ",i+1);
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.printf("[%d]", lotto[i][j]);
			} // for i
		System.out.println();		
		} // for i

		
	}//disp

	private static void fillLotto(int[][] lotto, int gameNumber) {
		
		for (int i = 0; i < gameNumber; i++) {
			int index = 0, n;
			lotto[i][index++] = getRandomInteger(1, 45); 
			while ( index <= 5 ) {
				n =  getRandomInteger(1, 45);              
				if( !isDuplicateLotto(lotto, n, index, i) ) //or lotto[i]
					lotto[i][index++] = n;
			} // while	
			
		} // for i
		
		
	}//fill
		

	   private static boolean isDuplicateLotto(int[][] lotto, int n, int index, int row) {
		   boolean flag = false;
	    	  for (int j = 0; j < lotto[row].length; j++) {
	    		  if( lotto[row][j] == n ) {
	    			  System.out.println("*");
	    			  flag = true;
	    			  break;
	    		  }		
			} // for j
	      return flag;
	  
	}

	    

	   public static int getRandomInteger(int min, int max) {      
	      return (int)( Math.random()*(max-min+1))+min;
	   }

	   private static void dispLotto(int[][] lotto) {
		   for (int i = 0; i < lotto.length; i++) {
			   System.out.printf("%d게임 : ",i+1);
			   for (int j = 0; j < lotto[i].length; j++) {
				   System.out.printf("[%d]", lotto[i][j]);
			   } // for i
		} // for i
	      System.out.println();
	   }

} // class
