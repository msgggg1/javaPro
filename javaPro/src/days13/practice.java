package days13;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("게임횟수 입력?");
		int gameNumber = scanner.nextInt();
		
		int [][] lotto = new int [gameNumber][6];
		
		
		fillLottos(lotto, gameNumber);
		dispLottos(lotto, gameNumber);
		
	}

	private static void dispLottos(int[][] lotto, int gameNumber) {
		
		for (int i = 0; i < gameNumber; i++) {
			dispLotto(lotto[i],i);	
		} // for i

		
	}//disp

	private static void fillLottos(int[][] lotto, int gameNumber) {
		for (int i = 0; i < gameNumber; i++) {
			fillLotto(lotto[i]);
		} // for i
			
	}//fill
		
    

	   public static int getRandomInteger(int min, int max) {      
	      return (int)( Math.random()*(max-min+1))+min;
	   }

	   
	   private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		      boolean flag = false;
		      for (int i = 0; i < index; i++) {
		         if( lotto[i] == n ) {
		            System.out.println("*");
		            flag = true;
		            break;
		         }
		      } // for i
		      return flag;
		   }
	   
	   private static void dispLotto(int[] lotto, int no) {
		      System.out.printf("%d게임 : ", no+1);
		      for (int i = 0; i < lotto.length; i++) {
		         System.out.printf("[%d]", lotto[i]);
		      } // for i
		      System.out.println();
		   }

	   private static void fillLotto(int[] lotto) {
		      int index = 0, n;
		      lotto[index++] = getRandomInteger(1, 45); 
		      while ( index <= 5 ) {
		         n =  getRandomInteger(1, 45);              
		         if( !isDuplicateLotto(lotto, n, index) ) 
		            lotto[index++] = n;
		      } // while

		   }
	   
} // class
