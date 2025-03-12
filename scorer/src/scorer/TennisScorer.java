package scorer;

import java.util.Scanner;

public class TennisScorer {


	Player p1 ;
	Player p2 ;
	boolean gender  ;
	boolean isDouble ;
	int sets ;
	int currentSet = 1;
	int currentGame = 1;

	public TennisScorer() {
		this.p1 = new Player();
		this.p2 = new Player();
	}

	void gameSetting() {
		Scanner scanner = new Scanner(System.in);

		// 성별입력
		while (true) {
			System.out.println("[ Men or Women?]");
			System.out.println("[남자경기: 'M', 여자경기: 'W' 를 입력하세요]");
			String strGender = scanner.nextLine().trim();

			if (strGender.equalsIgnoreCase("m")) {
				gender = true;
				break;
			} // if
			if (strGender.equalsIgnoreCase("w")) {
				gender = false;
				break;
			} // if
			else {
				System.out.println("잘못된 입력입니다! 'M' 또는 'W'를 입력하세요.");				
			}

		} //  while


		//단/복식
		while (true) {
			System.out.println("[ 단식: 'S', 복식: 'D' 를 입력하세요 ]");
			String strIsDouble = scanner.nextLine().trim();

			if (strIsDouble.equalsIgnoreCase("d")) {
				isDouble = true;
				break;
			} // if
			if (strIsDouble.equalsIgnoreCase("s")) {
				isDouble = false;
				break;
			} // if
			else {
				System.out.println("잘못된 입력입니다! 'S' 또는 'D'를 입력하세요.");
			}
		} //  while


		// '남자 경기& 단식' 일 경우 세트 수 입력
		if (gender && !isDouble ) {
			while (true) {
				System.out.println("[ 3세트 : 3, 5세트: 5 를 입력하세요 ]");
				String input = scanner.nextLine().trim();
				try {
					int sets = Integer.parseInt(input);
					if (sets == 3 || sets == 5) {
						this.sets = sets; // 값을 올바르게 저장
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("세트 수는 3 또는 5만 입력 가능합니다! 다시 입력하세요.");										
				}
			} //  while
		} else {  // ⚠️ 추가: 여자경기 또는 복식의 경우 기본 3세트로 설정
			this.sets = 3; // 기본 3세트
		} // if
		// 선수이름/팀명
		if (!isDouble) {
			System.out.println("[ Player 1 name ? ]"); // 선수 1이름
			p1.setName(scanner.nextLine());
			System.out.println("[ Player 2 name ? ]"); // 선수 2이름
			p2.setName(scanner.nextLine());

		} else {
			System.out.println("[ Team A ]");
			p1.setName(scanner.nextLine());
			System.out.println("[ Team B ]");
			p2.setName(scanner.nextLine());
		} //else

	}

	void gameStart(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("[ 게임을 시작합니다! ]");
		basicDsip();

		while (true) {
			playGame();

			if (checkSetWin()) {   // 세트 종료라면 true 반환됨
				if (checkMatchWin()) { // 매치 승리 확인 후 루프 종료
					System.out.println("[ 매치 종료 ]");
					break; //🎯 바로 탈출!
				}
			} 


		} // while

		System.out.println("[ 게임 종료 ]\n");
		System.out.printf("승리자 : %s \n", (p1.getSetpoints() > p2.getSetpoints() ? p1.getName() : p2.getName()));

	}



	void checkTieBreak() {

	}


	void playGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("[ %d세트 - %d게임 시작 ]\n", currentSet, currentGame);
		while (true) {
			scanner.nextLine(); // 엔터 입력 대기

			int winner = (int) (Math.random() * 2);
			switch (winner) {
			case 0:
				p1.winPoint();
				break;
			case 1:
				p2.winPoint();
			}

			 System.out.printf("%s 득점!\n", (winner == 0 ? p1 : p2).getName());
		        basicDsip();
		        setDisp();
		        scoreDisp();

		        if (checkGameWin()) {
		            currentGame++;

		            // ✅ 게임 승리 후 세트 승리 체크
		            if (checkSetWin()) {
		                if (checkMatchWin()) { // ✅ 매치 승리 체크 후 종료
		                    System.out.println("[ 매치 종료 ]");
		                    return;
		                }
		            }
		            break;
		        }
		    }
		}



	boolean checkGameWin() {
		if (p1.getPoints() >= 4 || p2.getPoints() >= 4) {  // 4점 이상일 때만 게임 승리 고려
			if (Math.abs(p1.getPoints() - p2.getPoints()) >= 2) {  // 2점 차이가 날 때만 게임 종료
				if (p1.getPoints() > p2.getPoints()) {
					System.out.println(p1.getName() + " 게임 승리!");
					p1.winGame();
				} else {
					System.out.println(p2.getName() + " 게임 승리!");
					p2.winGame();
				}
				p1.setPoints(0);  // 점수 초기화
				p2.setPoints(0);

				return true;
			}
		}
		return false;  // 게임이 종료되지 않음
	}


	boolean checkSetWin() {
		if ((p1.getGames()>=6||p2.getGames()>=6) && Math.abs(p1.getGames() - p2.getGames())>=2) {
			if (p1.getGames() > p2.getGames()) {
				System.out.printf("%s , %d세트 승리!\n", p1.getName(), currentSet);
				p1.winSet();
			} else {
				System.out.printf("%s , %d세트 승리!\n", p2.getName(), currentSet);
				p2.winSet();
			}
			// ✅ 매치 승리 체크 추가
	        if (checkMatchWin()) {
	            System.out.println("[ 매치 종료 ]");
	            return true;
	        }

	        currentSet++;
	        currentGame = 1;
	        p1.setGames(0);
	        p2.setGames(0);

	        return true;
	    }
	    return false;
	}

	boolean checkMatchWin() {
		if (sets == 3) {
			if ( p1.getSetpoints() == 2) {
				System.out.printf("%s , 매치 승리!\n", p1.getName());
				return true;
			} // if
			if ( p2.getSetpoints() == 2 ) {
				System.out.printf("%s , 매치 승리!\n", p2.getName());
				return true;
			} // if
		} else {
			if ( p1.getSetpoints() == 3 ) {
				System.out.printf("%s , 매치 승리!\n", p1.getName());
				return true;
			} // if
			if ( p2.getSetpoints() == 3 ) {
				System.out.printf("%s , 매치 승리!\n", p2.getName());
				return true;
			} // if
		}
		return false;
	}


	void handleDuece() {
		if (p1.getPoints() == 3 && p2.getPoints() == 3) {
			System.out.println("듀스 발생!");
		} else if (p1.getPoints() > 3 && p1.getPoints() == p2.getPoints()+1) {
			System.out.println(p1.getName() + " 어드밴티지!");
		} else if (p2.getPoints() > 3 && p2.getPoints() == p1.getPoints()+1) {
			System.out.println(p2.getName() + " 어드밴티지!");
		} else if (Math.abs(p1.getPoints() - p2.getPoints()) >= 2) {
			checkGameWin();
		}
	} // handleDuece

	void basicDsip() {
		System.out.println("=".repeat(60));
		System.out.println();
		System.out.printf("\t\t%s\t\t%s\n",gender?"남자":"여자", isDouble?"단식경기":"복식경기");
		System.out.println();
		System.out.printf("\t%s\t\tvs\t\t%s\n",p1.getName(),p2.getName());
		System.out.println();
		System.out.println("=".repeat(60));
	}

	void scoreDisp() {
		String [] tennisScore = {"0", "15", "30", "40"};

		String p1Score = (p1.getPoints() >= 4) ? "AD" : tennisScore[p1.getPoints()];
		String p2Score = (p2.getPoints() >= 4) ? "AD" : tennisScore[p2.getPoints()];

		System.out.printf("\t%s\t\t\t\t%s\n", p1Score, p2Score);
		handleDuece();
	}

	void setDisp() {
		System.out.printf("\t\t\t[%d세트]\n", currentSet);

	}


	public static void main(String[] args) {
		TennisScorer scorer = new TennisScorer();
		scorer.gameSetting();
		scorer.gameStart();

	}

} // class

