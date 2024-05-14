package j0509;

public class ForEx1 {
	public static void main(String[] args) {
		//반복문 : for(횟수를 알 수 있는), while(횟수를 알지 못하는)
		//for : 동일한 동작을 계속 할 경우 반복코드문을 이용하여 코드를 줄이는 효과
		//안녕하세요를 10번 출력하세요.
		
		
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
		//동일한 동작을 위한 반복문 for를 만들었다.
		//형식
		/*
		for(int i=1;조건식;증가값)//조건식이 참일 때 반복문이 실행된다.
		{
			//반복문장
		}
		*/
		//1.초기값 2.조건문 참=>반복문 거짓=>종료 3.증가값 4.조건식 참=>반복문 => 5.증가값 6.조건식 참=>반복문 7.증가값 8.조건식 참=>반복문
		//변수명을 왜 i로 할까 관습적인 표현
		for(int i=1; i<=10; i=i+1 ) {
			System.out.println("안녕하세요 "+i);
		}
		for(int i=0; i<10; i=i+1 ) {
			System.out.println("안녕하세요");
		}
	}

}
