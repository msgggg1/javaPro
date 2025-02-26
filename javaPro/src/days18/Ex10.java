package days18;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 4:34:34
 * @subject Chapter 12. Object 클래스 설명
 * @content              ㄴ 모든 클래스의 최상위 부모 클래스
 */
public class Ex10 {

	public static void main(String[] args) {

		/*[1] hashCode
		Value v1 = new Value(10);
		int hashCode = v1.hashCode(); // 객체 자신의 해시코드값
		System.out.println(hashCode);
		
		Value v2 = new Value(10);
		hashCode = v2.hashCode(); // 객체 자신의 해시코드값
		System.out.println(hashCode);

		Value v3  = v1;
		hashCode = v3.hashCode();
		System.out.println(hashCode);
		*/
		
		/* [2]getClass
		Value v1 = new Value(10);
		Class cls = v1.getClass(); //객체의 클래스 정보를 [C]lass (객체정보를 담은 '클래스'임)
		String fullName = cls.getName();
		System.out.println(fullName); // days18.Value
		//메서드 , 생성자, 필드 등 모든 클래스 정보를 얻어올 때 사용하는 메서드
		
		[3] toString
		System.out.println(v1.toString());// 객체 자신의 정보를 문자열로 반환하는 메서드
		System.out.println(v1); // toString()생략해도 된다. 
		
		System.out.printf("%s@%x", cls.getName(), v1.hashCode());
		//days18.Value@3ac3fd8b
		// fullName   @16진수hashcode => toString()
		 * 
		 */
		
		//[4] equals()
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		//v1  v2 객체 같니?
		System.out.println(v1 == v2);
		Value v3 = v1 ; // 객체 복사(copy)
		System.out.println(v3 == v1); // true
		// [1] Object.equals() 메서드를 오버라이딩하지 않으면 == 연산자와 동일한 기능이다. 
		// [2] 오버라이딩 int value 필드  필드값이 같으면 같은 객체이다 ..true
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		
		System.out.println(v1.toString());
		System.out.println(v1); // toString 없어도 같은 의미
		
		
	} // main

} // class


class Value extends Object{ // 컴파일러가 알아서 추가
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value && obj != null) {
			Value v = (Value)obj;// 다운캐스팅
			return v.value == this.value;
		} // if
		return false;
	}

	@Override
	public String toString() {

		return String.format("[value=%d]", this.value);
	}

	int value;
	
	public Value(int value) {
		this.value = value;
	}
	// 메서드 x
	
}
