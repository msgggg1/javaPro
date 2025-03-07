package days24;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author msg
 * @date 2025. 3. 7. - 오전 11:29:46
 * @subject  Map - Hashtable - (구)동기화 처리O
 * @content		   HashMap	 - (신)         X - 권장 ***(자주사용)
 * 				   LinkedHashMap
 * 				   TreeMap
 * 				   Properties 컬렉션 클래스 ***
 * 						ㄴ entry ( key + value ) 로 데이터 저장하는 Map 계열의 컬렉션 클래스
 * 						ㄴ 주로 설정 파일 (???.properties)을 읽고 쓰기 (에 사용)
 * 							   파일 읽고 쓰기 -> 메서드 제공 (내장)
 * 						ㄴ Hashtable의 자식 클래스이다. 
 * 						ㄴ String key, String value : 무조건. 다른건 안됨. 
 */
public class Ex04 {

	public static void main(String[] args) {

		//Properties<K,V> ->안뜸. String 고정 
		Properties p = new Properties();

		// Oracle DBMS
		// 연결하기 위한 문자열( 설정값 ) 필요
		// DB 연결 문자열
		//						패키지 명			실제 클래스 명
		String className = "oracle.jdbc.driver.OracleDriver"; // JDBC 드라이버
		//								내 pc     포트번호(-호)       <- IP 주소(-아파트 -동)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";

		// properties 없이
		String fileName = "oracle.config"; //-config -> 설정관련
		
		try (FileWriter writer = new FileWriter(fileName)){
			//writer.append(CharSequence csq);
			//writer.append(String str);
			writer.write(String.format("%s=%s\r\n", "className", className));
			writer.write(String.format("%s=%s\r\n", "url", url));
			writer.write(String.format("%s=%s\r\n", "user", user));
			writer.write(String.format("%s=%s\r\n", "password", password));
			
			writer.close(); //  stream 비우고 저장해라
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		


	} // main

} // class
