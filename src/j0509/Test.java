package j0509;

public class Test {
	public static void main(String[] args) {
		//문자열 연결 연산자 => +
		//산술 연산이 불가능한 것은 연결이 된다.
		System.out.println(10+10);
		System.out.println(10+"점");//숫자랑 문자를 붙여서 사용하고 싶을 때
		System.out.println("하하하"+"호호호"+"ggg");
		
		int kor=99;
		System.out.println("국어점수는"+kor+"점 입니다.");
		
		
		//국어와 영어의 합계점수를 출력할 때
		//동일한 우선순위 연산자는 앞에서 부터 실행
		
		int eng=88;
		System.out.println("국어와 영어의 합계"+(kor+eng));
		
		String num1="100";
		String num2="88";
		System.out.println(num1+num2);
		
	}
}
