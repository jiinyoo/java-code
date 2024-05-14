package j0509;

import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
		//사용자에게 원하는 메뉴를 입력받는다.
		//1.짜장면, 2.짬뽕, 3.우동 4.비빔국수
		int chk;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.짜장면, 2.짬뽕, 3.우동 4.비빔국수");
		chk=sc.nextInt();
		
		switch(chk)
		{
			case 1:System.out.println("짜장면을 주문");break;//break=> break를 만나면 { }영역을 끝내라는 뜻, 가끔 밑에 것을 실행해야 할 일 이 있어서 
			case 2:System.out.println("짬뽕을 주문"); break;
			case 3:System.out.println("우동을 주문");break;
			case 4:System.out.println("탕수육을 주문");break;
			default: System.out.println("잘못 입력");break;
		}
	}

}
//if문과 큰 차이는 없으나 조건식으로 하느냐 값으로 하느냐의 차이임.
