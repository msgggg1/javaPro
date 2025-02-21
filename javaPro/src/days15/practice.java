package days15;

public class practice {

	public static void main(String[] args) {
		Student s = new Student();
		Student [][] students = new Student [3][30];
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				students[i][j] = new Student();
			} // for j
		} // for i
		
		String name;
		int kor, eng, mat, tot, rank, wrank, no, ban;
		double avg;
		
		int [] cnt = new int [3];
		char con = 'y';
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.printf("반 입력?");
			ban = scanner.nextInt();
			
			System.out.printf("[%d번] 학생 이름, 국어, 영어 수학 입력?", cnt[ban-1]+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			
			tot = kor + eng + mat ;
			avg = (double)tot/3;
			rank = 1;
			wrank = 1;
			
			students[ban-1][cnt[ban-1]].no = cnt[ban-1]+1 ;
			students[ban-1][cnt[ban-1]].avg = avg;
			students[ban-1][cnt[ban-1]].eng = eng;
			students[ban-1][cnt[ban-1]].kor = kor;
			students[ban-1][cnt[ban-1]].mat = mat;
			students[ban-1][cnt[ban-1]].name = name;
			students[ban-1][cnt[ban-1]].rank = rank;
			students[ban-1][cnt[ban-1]].tot = tot;
			students[ban-1][cnt[ban-1]].wrank = wrank;
			
			students[ban-1][cnt[ban-1]]=new student();
			
			cnt[ban-1]++;
			
			System.out.println(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13 10
			
		} while (Character.toUpperCase(con)=='Y');
		
		
		for (int i = 0; i < ban; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				students[i][j].wrank=students[i][j].rank = 1;				
				for (int i2 = 0; i2 < students.length; i2++) {
					for (int j2 = 0; j2 < students[i2].length; j2++) {						
						if(students[i][j].tot <students[i2][j2].tot) {
							students[i][j].wrank++;
							if (i == i2) {
								students[i][j].rank ++;
							} // if
						} // 
					} // for j
				} // for i
				
			} // for j
		} // for i
		
		for (int i = 0; i < ban; i++) {
			for (int j = 0; j < cnt[ban-1]; j++) {
				System.out.println(students[i][j].getInfo());
			} // for j
		} // for i

	} // main

	} // main

} // class
