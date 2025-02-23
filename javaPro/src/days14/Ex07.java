package days14;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 2:50:57
 * @subject
 * @content
 */

public class Ex07 {

	public static void main(String[] args) {
		// 클래스 복사(copy)
		// 클래스 복제(clone) - 얉은 복제 / 깊은 복제 
		
		/*  인스턴스                                            객체
		 *  [color][power][channel][][][]                    [0x100]
		 *  0x100                                             t1
		 *  
		 *                                                   [0x100]
		 *                                                    t3
		 *  
		 *  인스턴스                                            객체
		 *  [color][power][channel][][][]                    [0x200]
		 *  0x200                                              t2
		 *  
		 *  
		 *  
		 *                 [power()][channelUp()][channelDown()]
		 * */
		
		//메소드는 한번만 올라감
		// 클래스 복제 = 객체 복제
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t2.channel = t1.channel;
		t2.power = t1.power;
		t2.color = t1.color ; 
		// 복제 . 완전 똑같은 값 / 성질 그대로 똑같이 가진 객체 생성
		
		Tv t3 = t1; // 주소값만 가져간다는 뜻 => 객체 복사 = 클래스 복사 / 인스턴스가 같은 값을 참조할때
		
		t1.color = "red";
		System.out.println(t1.color);
		System.out.println(t3.color);
		
		objectCopy(t1);
		System.out.println(t1.color);
		
		
	}

	private static void objectCopy(Tv t) { // 클래스 복사/ Tv t = t1; 같은 주소값 참조
		t.color = "blue";
		
	} // main

} // class
