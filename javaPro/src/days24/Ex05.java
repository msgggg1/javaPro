package days24;

import java.io.FileOutputStream;
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
public class Ex05 {

	public static void main(String[] args) {

		// Oracle DBMS
		// DB 연결 문자열( 설정값 )
		//		key					value
		String className = "oracle.jdbc.driver.OracleDriver"; // JDBC 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";

		// properties로 Ex04
		
		Properties p = new Properties();
//		p.put(Object key , object value) put으로 저장X ㄴString으로 값 고정
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		System.out.println(p);
		
		/*
		// file에 저장 -> store
		String fileName = "oracle.properties"; //확장자 ,properties 꼭 그래야 하는건 아니나, properties 컬렉션 클래스가 사용하기 위함
		try (FileWriter writer = new FileWriter(fileName)){
			String comments = "oracle ConnectionString";
			p.store(writer, comments);
		
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		*/
		
		// XML 파일로 저장. 프로그램, 시스템간 정보(데이터)주고받을 때 사용하는 XML     / Jason
		String fileName = "oracle.xml"; // properties 쓸땐 properties 붙이는게 좋다  
		try (FileOutputStream outputStream = new FileOutputStream(fileName)){
			String comments = "oracle ConnectionString";
			p.storeToXML(outputStream, comments); // 메소드만 달라짐
		
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		System.out.println("end");
		
		


	} // main

} // class
