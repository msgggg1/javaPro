package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 4:48:25
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		  String fileName = ".\\src\\days18\\Ex10.java";
	      char one = '\u0000';
	      int code = -1;
	      //     'A'		10
	      Map<Character, Integer> hm = new HashMap<Character, Integer>();
	      
	      try (FileReader reader = new FileReader(fileName);){

		         while ( (code = reader.read()) != -1 ) {
		            // 'a' 존재 여부 ->   key  hm    존재하면 ++1
//		            if ( [A-Za-Z0-9] ) {
		            if ( Character.isUpperCase(code)|| Character.isLowerCase(code)|| Character.isDigit(code) ) {
		               
		            	one = (char) code; // key값으로 존재 유무 확인
		            	if (hm.containsValue(one)) {
							// value ++
		            		int oldValue = hm.get(one);
		            		hm.put(one, oldValue+1);
						} else {
							//entry 추가
							hm.put(one, 1);
						}
		            	
		            }// if
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
		         
//		         int count = 0;
//		         for (int i = 0; i < counts.length; i++) {      
//		            // int[] -> IntStream
//		        	//Arrays.stream(counts[i]).sum();
//		            int totalCount = IntStream.of(counts[i]).sum(); // sum쓰려고 
//		            System.out.printf("==%s:%d==\n"
//		                  ,i==0?"대문자":(i==1?"소문자":"숫자")
//		                  ,  totalCount );
//		            
//		            for (int j = 0; j < counts[i].length; j++) {
//		               count  = counts[i][j];
//		               System.out.printf("%c(%d) %s\n", 
//		                     j+(i==0?'A':(i==1?'a':'0')), count, "#".repeat(count));
//		            } // for j
//		            
//		         } // for i
		          

		      } catch (Exception e) {
		         System.out.println(e.toString());
		      }

	} // main

} // class
