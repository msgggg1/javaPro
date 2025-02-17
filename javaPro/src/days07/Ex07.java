package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 11. - 오후 3:43:25
 * @subject do ~ while 문
 * @content 가위/바위/보 게임 구현..
 * 			1) 게임을 계속 여부 ? y
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {

		int com, user;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		int comScore = 0;
		int userScore = 0;
		boolean isFirst = false;
		int count = 0;
		String input;

		// int [] winningRate = new int[2]; // [0] 컴퓨터 점수 저장, [1] 사용자 점수 저장
		// 7_02+ 7_03  //counting/ 종료 / 유효성

		String [] rpsArr = {"","가위","바위","보"};

		input = scanner.next();
		String regex = "[1-3]";
		if (input.matches(regex)) {

			do { 
				com = (int) (Math.random() * 3) + 1;
				System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
				user = scanner.nextInt();

				System.out.printf("> com=%s, user=%s\n", rpsArr[com], rpsArr[user]); 

				switch (user - com) {
				case 0:
					System.out.print("무승부\n");		      
					break;

				case 1:
				case -2:
					System.out.print("사용자 승리\n");
					userScore++;		  // winningRate[1]++;
					break;

				case -1:
				case 2:
					System.out.print("컴퓨터 승리\n");
					comScore++;		      
					break;
				} // switch

				System.out.printf("스코어 : %d대%d", comScore, userScore); 

				if (userScore==3 || comScore==3) {
					System.out.printf("최종승리자: %s입니다.\n", userScore>comScore ? "사용자":"컴퓨터");

					break ; // while 문 빠져나옴. if문 단독으로는 사용 못함
				} // if

				// 1)게임 계속 여부?
				System.out.println("\n 게임 계속합니까? ");
				con = (char)System.in.read(); //y,n
			} while (con == 'y' || con == 'Y' );

		} else {

			if (count==3) {
				System.out.printf ("[알림] 누적 3회 프로그램 종료");
				return ;
			}// if
			if (isFirst) {
				System.out.printf ("[알림] 1~3 정수를 다시 입력(실패횟수:%d)!!!\n",count);
			} // if	  
			isFirst = true;

			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user= scanner.nextInt();

			count++;
		} //else










		System.out.println("end");


	} // main

} // class
