package j0509;

public class Op3 {
	//논리연산자 &&<and) ||(or) !(not)
	//2개의 true, false값을 연산
	public static void main(String[] args) {
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&true);//앞에 거만 봐도 될 때는 하나만 써도 된다.
		System.out.println(false&false);
		
		System.out.println("--------------");
		
		System.out.println(true|true);
		System.out.println(true|false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		
		System.out.println("--------------");
		
		
		
		System.out.println(!true);
		System.out.println(!false);
	}
	
}
