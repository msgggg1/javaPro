package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 4:13:42
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		String line = null;

		// HashMap <key,value>
		// HashMap <팀명,팀원>
		// HashMap <String,ArrayList<String>>
//		ArrayList<ArrayList<String>> class5 = new ArrayList<>();
		// 순서 유지 X
		HashMap<String, ArrayList<String>> class5 = new HashMap<>();

		String [] lineArr = null;
		ArrayList<String> team = null;

		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);   ){

			while ( (line = br.readLine())!= null) {
				team = new ArrayList<String>(); //  
				lineArr = line.split("[/:]"); 
				String teamName = lineArr[0]; // 1조, 2조..
				for (int i = 1; i < lineArr.length; i++) {
					team.add( lineArr[i] );
				} // for i

//				class5.add(team);
				class5.put(teamName, team);
			} // while

			// 각 팀원 출력형식 출력 
			dispClass(class5);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("end");
	} // main

	// 반복자 사용해서 출력.
	private static void dispClass(HashMap<String, ArrayList<String>> class5) {
		
		Set<Entry<String, ArrayList<String>>> es = class5.entrySet();
		Iterator<Entry<String, ArrayList<String>>> eir = es.iterator();
		while (eir.hasNext()) {
			Entry<String, ArrayList<String>> entry = eir.next();
			String key = entry.getKey();
			System.out.printf("[%s]\n", key );
			ArrayList<String> team = entry.getValue();
	
			char seq = 'A';
			Iterator<String> ir = team.iterator();
			while (ir.hasNext()) {
				String name = ir.next();
				System.out.printf("   %c. %s\n", seq++, name);
		}
			
		}
	}
		
		

} // class
