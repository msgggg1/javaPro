package scorer;

import java.util.Scanner;

public class TennisScorer {

	Player p1 ;
	Player p2 ;
	boolean gender  ;
	boolean isDouble ;
	int sets ;
	int currentSet = 1;
	
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
		System.out.println("[ 게임을 시작합니다! ]");
		basicDsip();
		while (!checkMatchWin()) {
			playGame();
		} //  while
		
		System.out.println("[ 게임 종료 ]");
		System.out.printf("승리자 : %s ");
		
		
	}
	
	 boolean checkMatchWin() {
		if (sets == 3) {
			if ( p1.getSetpoints() == 2) {
				System.out.printf("%s , 매치 승리!", p1.getName());
				return true;
			} // if
			if ( p2.getSetpoints() == 2 ) {
				System.out.printf("%s , 매치 승리!", p2.getName());
				return true;
			} // if
		} else {
			if ( p1.getSetpoints() == 3 ) {
				System.out.printf("%s , 매치 승리!", p1.getName());
				return true;
			} // if
			if ( p2.getSetpoints() == 3 ) {
				System.out.printf("%s , 매치 승리!", p2.getName());
				return true;
			} // if
		}
		return false;
	}
	 
	 boolean checkSetWin() {
		if ((p1.getGames()>=6||p2.getGames()>=6) && Math.abs(p1.getGames() - p2.getGames())>=2) {
			if (p1.getGames() > p2.getGames()) {
				System.out.printf("%s , %d세트 승리!", p1.getName(), currentSet);
				p1.winSet();
			} else {
				System.out.printf("%s , %d세트 승리!", p2.getName(), currentSet);
				p2.winSet();
			}
			currentSet++;
			p1.setGames(0);
	        p2.setGames(0);
	        
	        return checkMatchWin();
	     	        
	    } else if (p1.getGames() == 6 && p2.getGames() == 6) {
	        checkTieBreak();
	    }
		return false;
	 }
	 
	void checkTieBreak() {
		
	}

	void checkGameWin() {
		if (Math.abs(p1.getPoints()-p2.getPoints()) >= 2) {
			if (p1.getPoints() > p2.getPoints()) {
				System.out.println(p1.getName()+"게임 승리!");
				p1.winGame();
			} else {
				System.out.println(p2.getName()+"게임 승리!");
				p2.winGame();
			}
		} // if
		 
	 }


	void basicDsip() {
		System.out.println("=".repeat(60));
		System.out.println();
		System.out.printf("\t\t%s\t\t%s\n",gender?"남자":"여자", isDouble?"단식경기":"복식경기");
		System.out.println();
		System.out.printf("\t%s\t\tvs\t\t%s",p1.getName(),p2.getName());
		System.out.println();
		System.out.println("=".repeat(60));
	}
	
	void playGame() {
		int winner = (int)(Math.random()*2) ;
		switch (winner) {
		case 0: p1.winPoint();
			break;
		case 1: p2.winPoint();
		} // switch
		System.out.printf("%s 득점!\n",(winner==0? p1 : p2).getName());
		basicDsip();
		setDisp();
		scoreDisp();
		
		// 게임 승리 판정
	    checkGameWin();
	    
	    if (checkSetWin()) {
	        System.out.println("[ 경기 종료 ]");
	        return;  
	    }
		
	}

	void scoreDisp() {
		String [] tennisScore = {"0","15","30","LOVE", "AD"};
		System.out.printf("\t%s\t\t\t%s", tennisScore[p1.getPoints()], tennisScore[p2.getPoints()]);
		handleDuece();
		
	}

	void setDisp() {
		System.out.printf("\t\t\t[%d세트]\n", currentSet);
		
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

} // class

