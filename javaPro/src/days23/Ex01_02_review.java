package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex01_02_review {

	public static void main(String[] args) {
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		String line = null;
		
		ArrayList<ArrayList<String>> class5 = new ArrayList();
		String [] lineArr = null;
		ArrayList<String> team = null;
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);){
			
			while ((line=br.readLine()) != null) {
				team = new ArrayList<String>();
				lineArr = line.split("[:/]");
				for (int i = 1; i < lineArr.length; i++) {
					team.add(lineArr[i]);
				} //for
				class5.add(team);
			} //while
			
			dispClass(class5);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

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
				System.out.printf("\t\t%c. %s\n", seq++, name);
			} //while
		} //while
		
	}

}
