package days23;

public class codingTest_days07 {

	public static void main(String[] args) {
		int n = 3489;
		System.out.println(solution(n));

	}



//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.


static int solution(int n) {
    int answer = 0;  
    String strn = String.valueOf(n);
    
    for (int i = 0; i < strn.length(); i++) {
    	answer += strn.charAt(i)-'0';
	} // for i
    
    return answer;

	}

}


