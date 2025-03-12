package days27;

/**
 * @author msg
 * @date 2025. 3. 12. - 오전 10:24:52
 * @subject
 * @content
 */
public class Ex02_05 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.inner = 

	} // main

} // class


class Outer {
	
	int a = 10;						// 외부 변수1
	
	class Inner{
		int b = 20;					// 외부 변수2
		
		void method(int i) {		// 외부 변수4  람다식에서 사용하는 순간 자동 final int i -> 어디서든지 변경 불가
			int c = 30;				// 외부 변수3                "
			
			// c =100;
			// i = 200; 다른 값 할당 시 오류
			// Local variable i defined in an enclosing scope must be final or effectively final
			//(기억) 람다식에서 i/c 변수를 참조하면 final 붙이지 않아도 상수로 간주한다. 
			//MyFunction2 f = (i) ->{ // 에러. method(int i)와 (i) 이름 중복
			MyFunction2 f = () ->{ 
				// 외부 변수를 참조하는 람다식
				System.out.println("i: "+i);
				System.out.println("c: "+c);
				
				// 상수로 간주하지 않는다. 값을 변경해도 된다.
				this.b = 1000;
				Outer.this.a = 20000;
				System.out.println("b: "+this.b);
				System.out.println("a: "+Outer.this.a);
			};
			f.myMethod();
		}
	}
	
} // class


@FunctionalInterface
interface MyFunction2{
	void myMethod();
}