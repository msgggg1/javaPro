package days25;

import java.io.FileWriter;

/**
 * @author msg
 * @date 2025. 3. 10. - 오전 11:47:46
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		String name = "김길동";
		// 기본형 8가지 중에 3가지 ( int, double, boolean)
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 이 학생 정보를 파일로 저장.
		String fileName = "student.txt"; // javaPro 폴더에 저장.
		
		try (FileWriter writer = new FileWriter(fileName, true)){
			String data = String.format("%s,%d,%d,%d,%d, %.2f,%b\n", 
					name, kor, eng, mat, tot, avg, gender);
			
			//writer.append(0)
			writer.write(data);
			writer.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}// main

} // class
