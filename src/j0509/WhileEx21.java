package j0509;

public class WhileEx21 {
	public static void main(String[] args) {
		//while: 횟수를 알지 못하는 예제
		//임의의 숫자(1~10)를 발생했을 때 1이 발생하면 종료가 되는 소스
		
		int chk=(int)(Math.random()*10)+1;
		while(chk !=1 ) {
			System.out.println("안녕하세요");
			chk=(int)(Math.random()*10)+1;
		}
	}

}
