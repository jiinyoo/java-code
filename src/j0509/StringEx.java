package j0509;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		String chk;
		Scanner sc = new Scanner(System.in);
		chk=sc.next();
		
		//chk값이 토끼이면 간을 주세요.
		//"토끼"가 아니면 "그냥 가세요"
		//보라색으로 보이는 자료형은 == 연산이 가능하다
		//String은 ==연산이 가능은 하나 제대로 동작이 안될 수 있다.
		//다른 것들은 모습이 드러난다. String은 박스안에 들어있다.
		//다르다고 판단. 
		//까만색으로 나오는 것은 equals를 선언해주어야 함. 
		//박스를 열어보는 것
		if(chk.equals("토끼"))
			
		{
			System.out.println("간을 주세요");
			
		}
		else
		{
			System.out.println("그냥 가세요");
		}
	}

}
