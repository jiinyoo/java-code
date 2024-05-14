package j0509;

public class RandomEx {

	public static void main(String[] args) {
		
		long num=System.currentTimeMillis();
		
		//System.out.println(num);
		//num변수의 값으로 1~45까지의 임의의 수 만들기
		//num의 값을 45로 나누면 나머지는 ?=> 0~44 => 1~45

		long lot=num%45;//0~44
		lot=lot+1;//1~45
		System.out.println(lot);
		
		System.out.println(lot);
		System.out.println("------------------");
		
		for(int i=1; i<=6; i++) {
			num=System.currentTimeMillis();
			lot=num%45;
			lot=lot+1;
			
			System.out.println(lot +" ");
		}
		
		
	}
	//너무 빨라서 같은 수가 실행됨
	
}
