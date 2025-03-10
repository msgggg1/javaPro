package days25;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 12:27:46
 * @subject DataOutputStream 보조 스트림 -> 파일 쓰기
 * 				ㄴ 바이트 스트림
 * @content	DataInputStream -> 읽어들이기
 */
public class Ex07_02 {

	public static void main(String[] args) {
		String name = "홍길동";
		// 기본형 8가지 중에 3가지 ( int, double, boolean)
		int kor , eng , mat ;
		int tot;
		double avg ;
		boolean gender ;
		
		// 이 학생 정보를 파일로 저장.
		String fileName = "student02.dat"; // dat -> data의미, 이진데이터, ini -> 초기 설정값// java{rp 폴도에 저장. // 리눅스 3글자..
		
		try (FileInputStream in = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(in);){ // 자료형 8개 다 읽고 쓰기 가능
			
			// 저장한 사람 다 읽어오도록
			while (dis.available() != 0) {
				name = dis.readUTF(); 
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
						, name, kor, eng, mat, tot, avg, gender);
				
			} //  while
			
		} catch (EOFException e) {
		// 빠져나가자
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("end"); // byte 스트림 -> 이진으로 저장

	} // main

} // class
