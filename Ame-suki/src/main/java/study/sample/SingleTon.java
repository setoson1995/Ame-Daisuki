package study.sample;

public class SingleTon {
	// 1번 = static영역에 객체를 1개만 생성해둔다.
	private static final SingleTon sigleton = new SingleTon();
	// 2번 = printer 인스턴스가 필요하면 이 static 메서드를 통해서만 조회 가능하도록 설정한다.
	public static SingleTon getSingleTon() {
		return sigleton;
	}
	// 3번 = 외부에서 생성자 호출을 막기위해 private로 설정한다.
	private SingleTon() {
		
	}
	
	public void print() {
		System.out.println("출력 !");
	}
}