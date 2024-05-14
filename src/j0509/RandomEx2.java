package j0509;

public class RandomEx2 {
	public static void main(String[] args) {
		//임의의 수를 위한 라이브러리
		//1.java.lang.Math.random()
		
		for(int i=1; i<=6; i++) {
			
			
		double num=Math.random();//0~1사이의 실수
		
		//형이 달라서 괄호 열고 자료형을 붙인다. 여기에 있는 값이 어떤 값이든 괄호안에있는 값으로 바꾸어라 강제 형변환
		int ran=(int)(num*100000);
		//괄호를 안 넣으면 num만 인트형이 되어서 전부 정수형 0으로 되어 0이 나온다.
		ran=ran%45;
		ran=ran+1;
		
		System.out.print(ran+" ");
		}
	}

}
