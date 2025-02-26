package days18;

/**
 * @author msg
 * @date 2025. 2. 26. - 오전 9:45:54
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		Ex00 obj = new Ex00();
		obj.aaa();
		obj.bbb();
		obj.ccc();
	*/
//		IC obj = new Ex00();
//		obj.aaa();
		
		// 부모 인터페이스에도 업캐스팅 가능하다
		IA obj = new Ex00(); 
		obj.aaa(); // 애만 사용가능
		
	} // main

} // class

interface IA{
	void aaa();
}

interface IB{
	void bbb();
}

// 인터페이스 끼리 상속할 때 extends
interface IC extends IA, IB{
	void aaa();
	void bbb();
	void ccc();
}

//class Ex00 implements IA, IB{
class Ex00 implements IC{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}
