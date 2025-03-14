package days28;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

class Player implements Serializable {
    private String name;
    private int points;
    private int gamesWon;
    private int setsWon;

    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.gamesWon = 0;
        this.setsWon = 0;
    }

    public String getName() { return name; }
    public int getPoints() { return points; }
    public int getGamesWon() { return gamesWon; }
    public int getSetsWon() { return setsWon; }

    public void addPoint() { points++; }
    public void winGame() { gamesWon++; points = 0; }
    public void winSet() { setsWon++; gamesWon = 0; }
    public void resetPoints() { points = 0; }

    // 세트 종료 시 양쪽 플레이어를 모두 0으로 만들기 위해 사용
    public void resetGames() { this.gamesWon = 0;}
}

class ScoreBoard implements Serializable {
    private Player player1;
    private Player player2;
    private int totalSets;
    private boolean tieBreak;
    private boolean isDoubles;
    private boolean isMale;
    private String scoreStatus;

    public ScoreBoard(Player p1, Player p2, int sets, boolean isDoubles, boolean isMale) {
        this.player1 = p1;
        this.player2 = p2;
        this.totalSets = sets;

        this.tieBreak = false;
        this.isDoubles = isDoubles;
        this.isMale = isMale;
        this.scoreStatus = "0 - 0";
    }

    private String convertPoints(int points) {
        switch (points) {
            case 0: return "0";
            case 1: return "15";
            case 2: return "30";
            case 3: return "40";
            default: return "승리"; 
        }
    }

    // ★ 추가: 타이브레이크 전용 스코어 출력 메서드
    private void displayTieBreakScore() {
        System.out.println("----------------------------------");
        System.out.println("Tie-break in progress!");
        System.out.println(player1.getName() + " - Sets: " + player1.getSetsWon()
                           + " | Games: " + player1.getGamesWon()
                           + " | Tie-break points: " + player1.getPoints());
        System.out.println(player2.getName() + " - Sets: " + player2.getSetsWon()
                           + " | Games: " + player2.getGamesWon()
                           + " | Tie-break points: " + player2.getPoints());
        System.out.println("----------------------------------");
    }

    public void pointScored(int playerNumber) {
        Player scorer = (playerNumber == 1) ? player1 : player2;
        Player opponent = (playerNumber == 1) ? player2 : player1;

        if (tieBreak) {
            // 타이브레이크 모드에서는 매 득점마다 tie-break 스코어 표시
            scorer.addPoint();
            displayTieBreakScore();    // ← 이 한 줄 추가
            checkTieBreakWin(scorer, opponent);
        } else {
            scorer.addPoint();
            updateScoreStatus();
            checkGameWin(scorer, opponent);
        }
    }

    private void checkGameWin(Player scorer, Player opponent) {
        if (scorer.getPoints() >= 3 && (scorer.getPoints() - opponent.getPoints()) >= 2) {
            scorer.winGame();
            opponent.resetPoints();
            updateScoreStatus();
            checkSetWin(scorer, opponent);
        }
    }

    private void checkSetWin(Player scorer, Player opponent) {
        // 6:6 시점에 타이브레이크 활성화
        if (scorer.getGamesWon() >= 6 && opponent.getGamesWon() >= 6) {
            tieBreak = true;
            System.out.println("Tie-break activated!");
            displayScoreBoard();  // 6:6을 확인할 수 있도록 즉시 전광판 출력
        }
        // 7게임 이상 & 2게임 차이로 세트가 끝나는 경우
        else if (scorer.getGamesWon() >= 6 && (scorer.getGamesWon() - opponent.getGamesWon()) >= 2) {
            scorer.winSet();
            opponent.resetGames();  // 세트 종료 후 상대편 게임도 0으로

            tieBreak = false;
            player1.resetPoints();
            player2.resetPoints();
            updateScoreStatus();
            checkMatchWin();
        }
    }

    private void checkTieBreakWin(Player scorer, Player opponent) {
        int requiredPoints = 7;

        // 더블스 3세트 / 남자 단식 5세트 -> 10포인트 타이브레이크
        if (!isDoubles) {
            requiredPoints = 7;
        } else if (isDoubles) {
            requiredPoints = 10;
        }

        // 타이브레이크 승리 조건(해당 포인트 & 2점 차 이상)
        if (scorer.getPoints() >= requiredPoints && (scorer.getPoints() - opponent.getPoints()) >= 2) {
            scorer.winGame();
            scorer.winSet();
            opponent.resetGames(); 

            tieBreak = false;
            player1.resetPoints();
            player2.resetPoints();
            updateScoreStatus();
            checkMatchWin();
            displayScoreBoard(); // 세트/매치 상황도 최종 출력
        }
    }

    private void checkMatchWin() {
        if (player1.getSetsWon() >= (totalSets / 2) + 1) {
            System.out.println("\nMatch Over! Winner: " + player1.getName());
            System.exit(0);
        } else if (player2.getSetsWon() >= (totalSets / 2) + 1) {
            System.out.println("\nMatch Over! Winner: " + player2.getName());
            System.exit(0);
        }
    }

    private void updateScoreStatus() {
        // 듀스 / 어드밴티지 상태
        if (player1.getPoints() >= 3 && player2.getPoints() >= 3) {
            if (player1.getPoints() == player2.getPoints()) {
                scoreStatus = "Deuce";
            } else if (player1.getPoints() > player2.getPoints()) {
                scoreStatus = "Advantage " + player1.getName();
            } else {
                scoreStatus = "Advantage " + player2.getName();
            }
        } else {
            // 일반 득점 변환(0,15,30,40,A)
            scoreStatus = convertPoints(player1.getPoints()) + " - " + convertPoints(player2.getPoints());
        }
        displayScoreBoard();
    }

    public void displayScoreBoard() {
        System.out.println("----------------------------------");
        System.out.println(player1.getName() + " - Sets: " + player1.getSetsWon()
                           + " | Games: " + player1.getGamesWon());
        System.out.println(player2.getName() + " - Sets: " + player2.getSetsWon()
                           + " | Games: " + player2.getGamesWon());
        System.out.println("----------------------------------");
        System.out.println("Score: " + scoreStatus);
        System.out.println("----------------------------------");
    }
    
}

class Save {
	// 게임저장
    public static void saveGame(ScoreBoard scoreboard) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("savegame.dat"))) {
            out.writeObject(scoreboard);
        }
    }
    // 게임 불러오기
    public static ScoreBoard loadGame() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("savegame.dat"))) {
            return (ScoreBoard) in.readObject();
        }
    }
}

public class Tennis {

	   public static void main(String[] args) throws IOException, ClassNotFoundException {
	      Scanner scanner = new Scanner(System.in);
	      ScoreBoard scoreboard = null;
	      String loadOption;

	      // 유효한 입력을 받을 때까지 반복
	      while (true) {
	         System.out.print("세이브된 게임을 불러오시겠습니까? (네/아니오): ");
	         loadOption = scanner.nextLine().toLowerCase();

	         if (loadOption.equals("네") || loadOption.equals("아니오")) {
	            break; // 올바른 입력이면 루프 종료
	         }
	         System.out.println("잘못된 입력!!! '네' or '아니오'.");
	      }

	      if (loadOption.equals("네")) {
	         try {
	            scoreboard = Save.loadGame();
	            System.out.println("성공적으로 불러왔습니다!");
	            scoreboard.displayScoreBoard();
	         } catch (IOException | ClassNotFoundException e) {
	            System.out.println("로딩 에러: " + e.getMessage());
	            return;
	         }
	      } else { // "no"인 경우 (이전 else if 제거)
	         // 새로운 게임 설정
	         System.out.print("첫번째 플레이어 이름: ");
	         String player1Name = scanner.nextLine();

	         System.out.print("두번째 플레이어 이름: ");
	         String player2Name = scanner.nextLine();

	         String gender;
	         while (true) {
	             System.out.print("성별을 고르세요 (남자/여자): ");
	             gender = scanner.nextLine().toLowerCase();

	             if (gender.equals("남자") || gender.equals("여자")) {
	                 break;
	             }
	             System.out.println("잘못된 입력!!! '남자' or '여자'");
	         }
	         String gameMode;
	         do {
	            while (true) {
	               System.out.print("단식/복식을 고르세요 (단식/복식): ");   
	               gameMode = scanner.nextLine().toLowerCase();

	               if (gameMode.equals("단식") || gameMode.equals("복식")) {
	                  break; // 올바른 입력이면 루프 종료
	               }
	               System.out.println("잘못된 입력!!! '단식' or '복식'");
	            }
	         } while (!gameMode.equalsIgnoreCase("단식") && !gameMode.equalsIgnoreCase("복식"));

	         int totalSets;
	         while (true) {
	             System.out.print("세트 선택 (3 or 5): ");
	             
	             if (scanner.hasNextInt()) {
	                 totalSets = scanner.nextInt();
	                 scanner.nextLine(); 

	                 if (totalSets == 3 || (totalSets == 5 && gender.equalsIgnoreCase("남자") && gameMode.equals("단식"))) {
	                     break;
	                 }
	             } else {
	                 scanner.nextLine();
	             }
	             
	             System.out.println("잘못된 입력!!! 남자 단식만 5세트 가능, 나머지는 3세트만 선택 가능합니다.");
	         }

	         boolean isDoubles = gameMode.equalsIgnoreCase("복식");
	         boolean isMale = gender.equalsIgnoreCase("남자");

	         Player player1 = new Player(player1Name);
	         Player player2 = new Player(player2Name);

	         scoreboard = new ScoreBoard(player1, player2, totalSets, isDoubles, isMale);
	      }

	      while (true) {
	         System.out.println("\n선택옵션: [1] Press \"Enter\" = 경기진행 [2] Press '2' = 게임저장 [3] Press '3' = 나가기");
	         System.out.print("선택옵션 : ");
	         String option = scanner.nextLine();

	         switch (option) {
	         case "1":
	         case "":
	            int winner = new Random().nextInt(2) + 1;
	            scoreboard.pointScored(winner);
	            break;
	         case "2":
	            try {
	               Save.saveGame(scoreboard);
	               System.out.println("저장완료!");
	            } catch (IOException e) {
	               System.out.println("저장실패: " + e.getMessage());
	            }
	            break;
	         case "3":
	            System.out.println("나가기!");
	            return;
	         default:
	            System.out.println("올바른값이 아닙니다!");
	         }
	      }
	   }
	}