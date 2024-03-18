package study.sample;

public class SingleTon_Test {

	public static void main(String[] args) {
		// 1번 프린터 객체
		SingleTon singleTon1 = SingleTon.getSingleTon();
		// 2번 프린터 객체
		SingleTon singleTon2 = SingleTon.getSingleTon();
		/* SingleTon 클레스 파일에서 getSingleTon 를 
		생성하고 여기서 1, 2의 인스턴스를 생성했다.
		이것을 출력하면 True가 나오고,
		이걸로 하나의 인스턴스임을 알 수 있다.
		이것이 싱글톤 패턴이다 */
		System.out.println(singleTon1 == singleTon2);

	}

}
