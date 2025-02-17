package days03;

public class _2일차복습 {

	public static void main(String[] args) {
		//4. 이름, 나이, 학점, 성별 관련 변수를 선언및 초기화하고, 출력하세요. 
	    
	   // 조건1) printf() 메서드 사용"
	    //조건2) 출력 형식은    ">이름:"홍길동", 나이:20, 학점:'A', 성별:true" 
		
			String name = "홍길동";
			byte age = 20;
			char grade = 'A';
			boolean gender = true;
			
			System.out.printf(">이름:\"%s\", 나이:%d, 학점:'%c', 성별:%b \n", name, age, grade, gender);
			
		//	double money = 1234569.7089
				    //소수점 2자리까지 출력
				   // 세 자리마다 콤마(,) 출력하는 코딩을 하세요 . 
			double money = 1234569.7089;
					System.out.printf("%,.2f\n",money);
			//[생각] 소수점 3자리에서 절삭
					//System.out.printf("\%,.2f\n",money);
					System.out.printf("\\%,.2f\n",money);
					
					
		// char a = 'x';
		// char b;    
		//  a 변수의 값을 대문자로 변환시켜서 b 변수에 저장 후 출력하는 코딩을 하세요.
			char a = 'x';
				   	System.out.printf("%C", a);
					
		// 	String b =;
			 		
				   	/*int a =10, b=10, c=10;
				   	
				   	int a,b,c,d;
				   	a=b=c=d=10;
				   	//= 처리방향: 오 -> 왼;
				 */

	}		

}
