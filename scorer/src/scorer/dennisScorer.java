package scorer;

import java.util.Scanner;

public class dennisScorer {
	
    private final Player p1;
    private final Player p2;
    private boolean gender;
    private boolean isDouble;
    private int sets;
    private int currentSet = 1;
    private int currentGame = 1;
    private final Scanner scanner;

    public dennisScorer() {
        this.p1 = new Player();
        this.p2 = new Player();
        this.scanner = new Scanner(System.in);
    }

    void gameSetting() {
        // 성별 입력
        while (true) {
            System.out.println("[남자경기: 'M', 여자경기: 'W' 입력]");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("M")) {
                gender = true;
                break;
            } else if (input.equals("W")) {
                gender = false;
                break;
            } else {
                System.out.println("잘못된 입력! 'M' 또는 'W' 입력하세요.");
            }
        }

        // 단/복식 입력
        while (true) {
            System.out.println("[ 단식: 'S', 복식: 'D' 입력 ]");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("D")) {
                isDouble = true;
                break;
            } else if (input.equals("S")) {
                isDouble = false;
                break;
            } else {
                System.out.println("잘못된 입력! 'S' 또는 'D' 입력하세요.");
            }
        }

        // 세트 수 입력 (남자 단식만 3 또는 5세트 선택)
        if (gender && !isDouble) {
            while (true) {
                System.out.println("[ 3세트 : 3, 5세트: 5 입력 ]");
                try {
                    int input = Integer.parseInt(scanner.nextLine().trim());
                    if (input == 3 || input == 5) {
                        this.sets = input;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("세트 수는 3 또는 5만 입력 가능! 다시 입력하세요.");
                }
            }
        } else {
            this.sets = 3;  // 여자 경기 또는 복식은 기본 3세트
        }

        // 선수 이름 입력
        if (!isDouble) {
            System.out.println("[ Player 1 name ? ]");
            p1.setName(scanner.nextLine());
            System.out.println("[ Player 2 name ? ]");
            p2.setName(scanner.nextLine());
        } else {
            System.out.println("[ Team A name ? ]");
            p1.setName(scanner.nextLine());
            System.out.println("[ Team B name ? ]");
            p2.setName(scanner.nextLine());
        }
    }

    void gameStart() {
        System.out.println("[ 게임 시작 ]");
        basicDisp();

        while (true) {
            playGame();
            if (checkSetWin()) {
                break;  // 매치가 종료되면 while문 탈출
            }
        }

        System.out.println("[ 게임 종료 ]\n");
        System.out.printf("승리자: %s\n", (p1.getSetpoints() > p2.getSetpoints() ? p1.getName() : p2.getName()));
    }

    void playGame() {
        System.out.printf("[ %d세트 - %d게임 시작 ]\n", currentSet, currentGame);

        while (true) {
            scanner.nextLine(); // 엔터 입력 대기
            int winner = (int) (Math.random() * 2);

            if (winner == 0) {
                p1.winPoint();
            } else {
                p2.winPoint();
            }

            System.out.printf("%s 득점!\n", (winner == 0 ? p1 : p2).getName());
            basicDisp();
            setDisp();
            scoreDisp();

            if (checkGameWin()) {
                currentGame++;
                if (checkSetWin()) {
                    return;  // 세트 종료 후 매치 종료 검사
                }
                break;
            }
        }
    }

    boolean checkGameWin() {
        if (p1.getPoints() == 4 || p2.getPoints() == 4) {
            if (Math.abs(p1.getPoints() - p2.getPoints()) >= 2) {
                if (p1.getPoints() > p2.getPoints()) {
                    System.out.println(p1.getName() + " 게임 승리!");
                    p1.winGame();
                } else {
                    System.out.println(p2.getName() + " 게임 승리!");
                    p2.winGame();
                }
                p1.setPoints(0);
                p2.setPoints(0);
                return true;
            }
        }
        return false;
    }

    boolean checkSetWin() {
        if ((p1.getGames() >= 6 || p2.getGames() >= 6) && Math.abs(p1.getGames() - p2.getGames()) >= 2) {
            if (p1.getGames() > p2.getGames()) {
                System.out.printf("%s, %d세트 승리!\n", p1.getName(), currentSet);
                p1.winSet();
            } else {
                System.out.printf("%s, %d세트 승리!\n", p2.getName(), currentSet);
                p2.winSet();
            }

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
        int targetWins = (sets == 3) ? 2 : 3;

        if (p1.getSetpoints() == targetWins) {
            System.out.printf("%s, 매치 승리!\n", p1.getName());
            return true;
        }
        if (p2.getSetpoints() == targetWins) {
            System.out.printf("%s, 매치 승리!\n", p2.getName());
            return true;
        }
        return false;
    }

    void basicDisp() {
        System.out.println("=".repeat(60));
        System.out.printf("\t\t%s\t\t%s\n", gender ? "남자" : "여자", isDouble ? "복식" : "단식");
        System.out.printf("\t%s\t\tvs\t\t%s\n", p1.getName(), p2.getName());
        System.out.println("=".repeat(60));
    }

    void scoreDisp() {
        String[] tennisScore = {"0", "15", "30", "40"};
        String p1Score = (p1.getPoints() >= 4) ? "AD" : tennisScore[p1.getPoints()];
        String p2Score = (p2.getPoints() >= 4) ? "AD" : tennisScore[p2.getPoints()];
        System.out.printf("\t%s\t\t\t\t%s\n", p1Score, p2Score);
    }

    void setDisp() {
        System.out.printf("\t\t\t[%d세트]\n", currentSet);
    }

    public static void main(String[] args) {
        dennisScorer scorer = new dennisScorer();
        scorer.gameSetting();
        scorer.gameStart();
    }
}

