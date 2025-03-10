package days25;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 2:32:57
 * @subject RandomAccessFile 예제
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) throws IOException {
		int [] score = {
			// 번호, 국어, 영어, 수학
				1, 100, 90, 90,
	            2, 70 , 90,100,
	            3, 100,100,100,
	            4, 70 , 60, 80,
	            5, 70 , 90,100
				
		};
		
		String name = "score.dat"; // 성적 정보 저장 파일명
		String mode = "rw"; // 읽기쓰기 모드
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			for (int i = 0; i < score.length; i++) {
				if (i%4 == 0) {
					System.out.println("=".repeat(50));
				} // if
				long fp = raf.getFilePointer();
				System.out.printf("> 현재 FP : %d - [%d]\n", fp, score[i]);
				raf.writeInt(score[i]);
				
			} // for i


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}

		// 일시정지 + 엔터 계속
		일시정지();
		
		//[문제]
		// 모든 학생의 번호, 국,영,수 성적 정보를 출력.
		// 							총점, 평균
		// 일시정지
		int no;
		int kor , eng , mat ;
		int tot ;
		double avg ;
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			for (int i = 0; i < score.length/4; i++) {
				
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor+eng+mat;
				avg = (double)tot/3;

				System.out.printf("%d,%d,%d,%d,%d,%f\n"
						, no, kor, eng, mat, tot, avg);
			}  // for i
	      } catch (FileNotFoundException e) {
	          e.printStackTrace();
	       } catch (Exception e) {
	          e.printStackTrace();
	       }

		
		일시정지();
		
		//[문제2]
		// 3번 학생의 수학 점수(100) -> 20점으로 수정하는 코딩.
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			int pos = (4+4+4+4)*2 + (4+4+4) ; // 44
			raf.seek(pos);
			raf.writeInt(20);
			}  // for i
	      catch (FileNotFoundException e) {
	          e.printStackTrace();
	       } catch (Exception e) {
	          e.printStackTrace();
	       }
		
		일시정지();
		// [문제3]
		// 3번 학생의 번호/국/영/수/총/평 을 출력.
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			int pos = (4+4+4+4)*2 ; // 44
			raf.seek(pos);
			raf.writeInt(20);
			
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor+eng+mat;
				avg = (double)tot/3;

				System.out.printf("%d,%d,%d,%d,%d,%f\n"
						, no, kor, eng, mat, tot, avg);
			}  // for i
	      catch (FileNotFoundException e) {
	          e.printStackTrace();
	       } catch (Exception e) {
	          e.printStackTrace();
	       }

	} // main
	
	public static void 일시정지() {
		System.out.println(">엔터 진행");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

} // class
