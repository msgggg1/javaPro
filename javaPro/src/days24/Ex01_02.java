package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01_02 {
	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\Ex10.java";
		
		Map<Character, HashSet<String>> hm = new LinkedHashMap<>();
		
		for (int i = 'A'; i < 'z'; i++) {
			if (Character.isAlphabetic(i)) {
				hm.put((char)i, new HashSet<String>());
			} // if
		} // for i
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader)){
			
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = br.readLine()) != null) { // readLine -> 개행문자 삭제함
				sb.append(line);
				sb.append("\r\n"); // 개행문자 추가
			} //  while
			
			String content = sb.toString();
//			System.out.println(content);
			
			//									1번 이상
			//Pattern pattern = Pattern.compile("\\w+");
			Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z0-9_가-힣]*"); // ^
			Matcher matcher = pattern.matcher(content);
			
			char key ;
			HashSet<String> value ;
			while (matcher.find()) {
				String word = matcher.group();
				//System.out.println(word);
				key = word.charAt(0);
				value = hm.get(key);
				value.add(word);
			} //  while
			
			// 출력
			Set<Entry<Character, HashSet<String>>> es = hm.entrySet();
			Iterator<Entry<Character, HashSet<String>>> ir = es.iterator();
			while (ir.hasNext()) {
				Map.Entry<Character, HashSet<String>> entry = (Map.Entry<Character, HashSet<String>>) ir.next();
				key = entry.getKey();
				value = entry.getValue();
				System.out.printf("[%c로 시작하는 단어 -%d개]\n", key, value.size());
				Iterator<String> ir2 = value.iterator();
				int num = 1;
				while (ir2.hasNext()) {
					String word = (String) ir2.next();
					System.out.printf("%d. %s\n",num++ , word);
				}
				System.out.println("=".repeat(60));
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
