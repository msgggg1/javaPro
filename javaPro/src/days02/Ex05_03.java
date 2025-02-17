package days02;

/**
 * @author msg
 * @date 2025. 2. 4. - 오후 2:49:17
 * @subject
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		// %[argument_index$][flags][width][.precision]conversion
		
		double avg = 78.96844;
		System.out.printf("평균=%f\n",avg);
		System.out.printf("평균=[%.2f]\n",avg);//자동 반올림
		System.out.printf("평균=[%10.2f]\n",avg);
		System.out.printf("평균=[%+010.2f]\n",avg); //+0은 flags에 해당
		System.out.printf("평균=[%010.2f]\n",avg); //+0은 flags에 해당
	
		System.out.printf("평균=%e\n",avg); // 지수(e)로 나타낼때 
		
		
		System.out.println("-".repeat(50));//구분선
		
		String name = "admin";
		int age = 20;
		
		System.out.printf("%s"+'\n',name);
		System.out.printf("%10s"+'\n',name);//우측정렬
		System.out.printf("%-10s"+'\n',name);//좌측정렬
		//width : 총너비
		System.out.printf("%s"+'\n',age);
		System.out.printf("%10s"+'\n',age);
		System.out.printf("%-10s"+'\n',age);
		
		//나이(age)를 4자리로 출력 0020 -->[flags]
		System.out.printf("[%04d]\n",age);
		
		int money = 12573000;
		//          12,573,000 출력
		System.out.printf("[%,d]\n",money);
		
		System.out.printf("[%(d]\n",30);
		System.out.printf("[%(d]\n",-30);// (음수)
		
		System.out.println("-".repeat(50));//구분선
		//d 정수를 10진수로 출력
		System.out.printf("[%d]\n",10); // [10]
		//o 정수를 8진수로 출력
		System.out.printf("[%#o]\n",10); // [12]
		//x 정수를 16진수로 출력
		System.out.printf("[%1$#x][%1$#X]\n",10); // [a][A]
		 
		
		/*
		 * 2진법: 0 1
		 * 8진법: 0 1 2 3 4 5 6 7
		 * 10진법: 0 1 2 3 4 5 6 7 8 9
		 * 16진법: 0 1 2 3 4 5 6 7 8 9 a(10) b c d e f(15)
		 * */
		
	}// main

}//class
