package days22;

import java.util.ArrayList;

/**
 * @author msg
 * @date 2025. 3. 5. - 오전 10:35:28
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		//다른 클래스 객체 모두 들어갈 수 있다. int string class list....
			
		ArrayList team1 = new ArrayList();
		team1.add("권태정");
		team1.add("김민선");
		team1.add("김도훈");
	
		ArrayList team2 = new ArrayList();
		team2.add("김승효");
		team2.add("김예지");
		team2.add("김유미");
		
		ArrayList team3 = new ArrayList();
		team3.add("서재웅");
		team3.add("박지웅");
		team3.add("안준호");
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		
		System.out.println(class5);
		
		// team1 a,b,c,d
		// team2   b,c,  f,g
		// team1.retainAll(team2); // 기능: team1에 있는 요소와 team2에 있는 요소 중에 공통요소만 남기는 메서드
		
		// ArrayList -> 배열로 변환
		Object [] arr = class5.toArray();
		
		// addAll(Collection C)
		// removeAll(Collection C)
		class5.removeAll(team3);
		System.out.println(class5);
		
	} // main

} // class
