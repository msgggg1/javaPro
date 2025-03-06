package days23;

import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 4:48:25
 * @subject
 * @content 0~9 A-Z a-z 모두 나오고 정렬된대로 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		  String fileName = ".\\src\\days18\\Ex10.java";
	      char one = '\u0000';
	      int code = -1;
	      //     'A'		10
	      Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
	      

	  		for (int i = 0; i < 'z'; i++) {
	  			if (Character.isAlphabetic(i)||Character.isDigit(i)) {
//	  				System.out.printf("%c(%d)\n", (char)i,i);
	  				hm.put((char)i, 0);
	  			} // if
	  		} // for i
	  		
	      
	      try (FileReader reader = new FileReader(fileName);){

		         while ( (code = reader.read()) != -1 ) {
		            // 'a' 존재 여부 ->   key  hm    존재하면 ++1
//		            if ( [A-Za-Z0-9] ) {
		            if ( Character.isUpperCase(code)|| Character.isLowerCase(code)|| Character.isDigit(code) ) {
		               
		            	one = (char) code; // key값으로 존재 유무 확인
		            	int oldValue = hm.get(one);
		            	hm.put(one, oldValue+1);
					
						}
		            	
		         } // while
		         

		         // 막대그래프 그리기
		         Set<Entry<Character, Integer>> es = hm.entrySet();
		         Iterator<Entry<Character, Integer>> ir = es.iterator();
		         while (ir.hasNext()) {
					Entry<Character,Integer> entry = ir.next();
					char key = entry.getKey();
					int value = entry.getValue();
					 System.out.printf("%c(%d) %s\n", key, value, "#".repeat(value));
				} // while
		         

		      } catch (Exception e) {
		         System.out.println(e.toString());
		      }

	} // main

} // class
