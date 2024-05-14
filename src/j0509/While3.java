package j0509;

public class While3 {
	public static void main(String[] args) {
		//같은 코드 값
		int chk;
		while((chk=(int)(Math.random()*10)+1)!=1)
			//괄호순서를 잘 지켜야 비교가 된다.
		{
			System.out.println("안녕하세요");
		}

		while((int)(Math.random()*10)+1!=1)
			//괄호순서를 잘 지켜야 비교가 된다.
		{
			System.out.println("안녕하세요");
		}
	}

}
