package days22;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex07_05 {
	// 객체 생성 필요없이 그냥 사용 가능
	static Queue q = new LinkedList(); // 1개. 인터페이스로 객체 생성 못 -> 자식클래스로 받기
	static final int MAX_SIZE = 5; // Queue에 명령어 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while (true) { // 무한루프
			System.out.println(">>"); // 무한루프 돌때마다 출력
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if ("".equals(input)) continue; // -> true로 다시 
				
				if (input.equalsIgnoreCase("q")) {
					// 0 다른 프로세스에게 0 정수값을 전달 (어떤 이유로 종료하는지 알려주기 위함) 보통 0 , -1
					System.out.println("\t\t프로그램 종료");
					System.exit(0); // 프로그램 종료
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를" + MAX_SIZE+"개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					
					//LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					while (it.hasNext()) {
						 System.out.println(++i+"."+it.next());
						
					}	
					// 입력받은 명령어를 저장하고, 
					save(input);
					
				}else { // 그 외 모든 경우
					save(input);
					System.out.println(input);
				} //if (input.equalsIgnoreCase("q")) {
					
	
			} catch (Exception e) {
			System.out.println("입력오류입니다.");
			}
		} //  while(true)
		

	} // main

	private static void save(String input) {
		//queue에 저장한다.
		if (!"".equals(input)) {
			q.offer(input);
		} // if
		// queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다. 
		if (q.size() > MAX_SIZE) {
			q.remove();
		} // if
		
	}

} // class