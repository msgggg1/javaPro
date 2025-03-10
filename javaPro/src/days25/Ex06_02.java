package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 12:07:29
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		// 기본형 8가지 중에 3가지 ( int, double, boolean)
		int kor , eng , mat ;
		int tot;
		double avg ;
		boolean gender ;
		
		// 이 학생 정보를 파일로 저장.
		String fileName = "student.txt"; // javaPro 폴도에 저장.
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);
			){
				
			String line = null;
			
			//[2]
			String pattern = "([가-힣]{2,}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),([0-9.]{4,7}),(true|false)";

	         while ( (line = br.readLine()) != null  ) {

	            Pattern p = Pattern.compile(pattern);
	            Matcher m = p.matcher(line);

	            // m.matches()
	            // m.find() 
	            while ( m.find() ) {
	               name = m.group(1);
	               kor = Integer.parseInt( m.group(2) );
	               eng = Integer.parseInt( m.group(3) );
	               mat = Integer.parseInt( m.group(4) );
	               tot = Integer.parseInt( m.group(5) ); 
	               avg = Double.parseDouble( m.group(6) );
	               gender = Boolean.parseBoolean(m.group(7));
	               System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
	                     , name, kor, eng, mat, tot, avg, gender);
	            } // while
	         }// while
			
			/*
			//[1]
			while (((line = br.readLine()) != null)) {
				
				// 학생 읽어와서 출력하는 코딩
				String [] datas = line.split(",");
				System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %f, 성별: %b", );
			} //  while
			
			
			
//			String data = String.format("%s,%d,%d,%d,%d,%.2f,%b\n", 
//					name, kor, eng, mat, tot, avg, gender);
 */
	      // [3]
				// [MessageFormat 형식화 클래스 사용] 
				/*
				String pattern = "{0},{1},{2},{3},{4},{5},{6}";
				MessageFormat mf = new MessageFormat(pattern);
				Object [] datas = mf.parse(line);

				// Object [] --> stream --> String [] 변환
				String [] s = Arrays.asList(datas).toArray(new String[datas.length]);

				name =   s[0]; 
				kor = Integer.parseInt( s[1] );
				eng = Integer.parseInt( s[2] );  // 예외발생
				mat = Integer.parseInt( s[3] ); // "null"

				avg = Double.parseDouble( s[5] ); 
				gender = Boolean.parseBoolean( s[6] );
				*/
			

		} catch (Exception e) {
			System.out.println(e.toString());
		}


	} // main

} // class
