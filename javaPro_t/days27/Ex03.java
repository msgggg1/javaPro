package days27;

/**
 * @author kenik
 * @date 2025. 3. 12. - 오전 10:39:58
 * @subject   java.util.function 패키지
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 1.  java.util.function(함수) 패키지
		 *   ㄴ 자주 사용되는 "함수형 인터페이스"를 미리 정의해 놓은 패키지.
		 *   ㄴ 사용하는 개발자의 이름 통일(표준), 유지, 보수 용이. 
		 *   ㄴjava.util.function 패키지의 주요 함수형 인터페이스
		 *       (1) Runnable   void run()   매개변수X, 리턴값X
		 *       (2) Supplier     T get()        매개변수X, 리턴값O
		 *       (3) Consumer T accept(T) 매개변수O, 리턴값X
		 *       (4) Function    T apply(T)  매개변수O, 리턴값O
		 *       (5) Predicate   T test(T)   매개변수O, 리턴값(b)
		 *   ㄴ  매개변수가 두 개인 함수형 인터페이스
		 *      1) 매개변수의 개수가 2개인 함수형 인터페이스는 이름 앞에 접두사 'Bi'가 붙는다. 
		 *       (1) BiConsumer
		 *       (2) BiPredicate
		 *       (3) BiFunction   
		 *   ㄴ 두 개 이상의 매개변수를 갖는 함수형 인터페이스
		 *      ( 개발자 직접 구현)
		 *      @FunctionalInterface
		 *      interface TriFunction<T,U,V,R>   {
		 *          R apply(T t, U u, V v);
		 *      }     
		 *  ㄴ UnaryOperator : Function 자손 ,   매개변수 == 리턴자료형
 		 *     BinaryOperator : BiFunction 자손 ,   매개변수 == 리턴자료형
 		 *     
 		 *    11:04 수업시작~    
 		 *  ㄴ 함수형 인터페이스 +  컬렉션 프레임워크(JCF)
 		 *    Ex03_02.java   
 		 *    
 		 *  ㄴ 기본형 X -> 래퍼클래스 사용.
 		 *    [ 기본형을 사용하는 함수형 인터페이스 ]  
 		 *     입력 타입 To 출력타입
			 *    1) DoubleToIntFunction
			 *    2)       ToIntFunction
			 *    3) Int        Function
			 *    4) ObjInt      Consumer
			 *    
			 *    Ex03_03.java
		 * */

	} //main

} // class













  