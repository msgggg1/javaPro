package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 2:51:23
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<>(); // ~MAP => map으로 받기, ~List -> list로 받기
		//		LinkedHashMap<String, String> hm = new LinkedHashMap<>(); // 순서유지 O
		hm.put("admin", "관리자");
		hm.put("kenik", "이창익");
		hm.put("hong", "홍길동");

		System.out.println(hm);
		
		
		// 1. 모든 key 풀력 - keyset
		Set<String> ks = hm.keySet(); // key값 가지고 있는 set, 중복X, 순서 X
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			String value = hm.get(key);
			System.out.printf("%s-%s\n", key, value);
		}
		
		System.out.println("-".repeat(60));
		
		// 2. 모든 value 출력 - values
		Collection<String> vs = hm.values(); // 중복가능 -> set으로 리턴X
		ir = vs.iterator();
		while (ir.hasNext()) {
			String value = (String) ir.next();
			System.out.println(value);
		}
		
		// 3. 모든 엔트리 (key - value 쌍) 출력. ----- 통으로 기억
		//1.에 추가 코딩
		Set<Entry<String, String>> es = hm.entrySet(); // java util map의 entry
		Iterator<Entry<String, String>> eir = es.iterator();
		while (eir.hasNext()) {
			Entry<String, String> entry = eir.next();
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.printf("%s-%s\n", key, value);
		} // while
		
	} // main

} // class
