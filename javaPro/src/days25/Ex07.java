package days25;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 12:20:26
 * @subject Ex06.java 코딩을 DataInputeStream/DataOutputStream 사용해서 수정
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		String name = "서길동";
		// 기본형 8가지 중에 3가지 ( int, double, boolean)
		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		// 이 학생 정보를 파일로 저장.
		String fileName = "student02.dat"; // dat -> data의미, 이진데이터, ini -> 초기 설정값// java{rp 폴도에 저장. // 리눅스 3글자..
		
		try (FileOutputStream out = new FileOutputStream(fileName, true);
			DataOutputStream dos = new DataOutputStream(out);){ // 자료형 8개 다 읽고 쓰기 가능
			
			dos.writeUTF(name); // String
			dos.writeInt(kor); // i nt
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg); // double
			dos.writeBoolean(gender); // boolean
			
			dos.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("end"); // byte 스트림 -> 이진으로 저장
	} // main

} // class
