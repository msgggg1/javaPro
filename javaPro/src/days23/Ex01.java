package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 3. 6. - 오전 10:04:22
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		String line = null;
		
		// Set X - 동명이인 있는 경우
		// List O -AL, V, LL, S, PQ -> ArrayList
		
		ArrayList<String> team1 = new ArrayList<>();
		ArrayList<String> team2 = new ArrayList<>();
		ArrayList<String> team3 = new ArrayList<>();
		ArrayList<String> team4 = new ArrayList<>();
		
		ArrayList<ArrayList<String>> class5 = new ArrayList<>();
		
		
		String[] lineArr = null;
		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);){
				ArrayList<String> team = null;
			while ((line = br.readLine())!=null) {
				
				lineArr = line.split("[/:]");
				//lineArr = line.split("(/|:)");
				switch (lineArr[0]) {
				case "1조": team = team1;
					break;
				case "2조": team = team2;
					break;
				case "3조": team = team3;
					break;
				case "4조": team = team4;
					break;
					
				} // switch
				
				for (int i = 0; i < lineArr.length; i++) {
					team.add(lineArr[i]);
				} // for i
				
				class5.add(team);
				
			} //  while
			
			// 각 팀원 출력형식으로 출력
			// dispTeam(1,2,3,4);
			dispClass(class5);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end");

	} // main

	// 반복자 사용해서 출력
	private static void dispClass(ArrayList<ArrayList<String>> class5) {
			Iterator<ArrayList<String>> ir = class5.iterator();
			int no = 1;
			while (ir.hasNext()) {
				System.out.printf("[%d조]\n", no++);
				ArrayList<String> team = ir.next();
				char seq = 'A';
				Iterator<String> ir2 = team.iterator();
				while (ir2.hasNext()) {
					String name = (String) ir2.next();
					System.out.printf("   %c. %s\n", seq++, name);
				}
			}
		
		
//		  for (int i = 0; i < class5.size(); i++) {
//			  int j = 0;
//			  System.out.printf("[%d조]", i+1);
//			Iterator ir = class5.get(i).iterator();
//			while (ir.hasNext()) {
//				String member = (String) ir.next();
//				System.out.printf("\t\t%c. %s\n", 65+j++ ,member);
	}

} // class
