package j0509;

public class WhileEx2 {
	public static void main(String[] args) {
		//while : 횟수를 알지 못하는 예제	
		
		//임의의 수 : 
		//1970년 1월 1일 0시 기준으로 지금까지의 1/1000초 단위의 값을 가져온다.
		long num=System.currentTimeMillis();
		
		//System.out.println(num);
		//num변수의 값으로 1~45까지의 임의의 수 만들기
		//num의 값을 45로 나누면 나머지는 ?=> 0~44 => 1~45
		
		long lot=num%45;//0~44
		lot=lot+1;//1~45
		System.out.println(lot);
	
				
	}
}