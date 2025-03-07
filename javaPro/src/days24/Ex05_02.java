package days24;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
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
public class Ex05_02 {
	// 설정파일 따로 빼놓는게 유지보수 쉬움
	public static void main(String[] args) {
		//Properties<K,V> ->안뜸. String 고정 

		// Oracle DBMS
		// 연결하기 위한 문자열( 설정값 ) 필요
		// DB 연결 문자열
		//						패키지 명			실제 클래스 명
		String className ; // JDBC 드라이버
		//								내 pc     포트번호(-호)       <- IP 주소(-아파트 -동)
		String url ;                  
		String user ;                                                                   
		String password ;

		// properties로 Ex04_02
		//String fileName = "oracle.properties";
		String fileName = "oracle.xml";
		
		
		// Ex04에서 생성한 파일 읽어오기
		Properties p = new Properties();
		System.out.println(p);
		/*
		try (FileReader reader = new FileReader(fileName);){
		
			p.load(reader);
			//System.out.println(p);
			
			System.out.println(p.getProperty("className"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
			
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		*/

		try (FileInputStream in = new FileInputStream(fileName)){
			
			p.loadFromXML(in);
			//System.out.println(p);
			
			System.out.println(p.getProperty("className"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
			
			System.out.println("end");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		


	} // main

} // class
