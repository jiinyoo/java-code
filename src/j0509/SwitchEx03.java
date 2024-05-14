package j0509;

import java.util.Scanner;

public class SwitchEx03 {
	public static void main(String[] args) {
		//사용자에게 원하는 메뉴를 입력받는다.
		//A.짜장면, B.짬뽕, C.우동 D.탕수육
		String chk;
		Scanner sc=new Scanner(System.in);
		System.out.println("A.짜장면, B.짬뽕, C.우동 D.탕수육");
		chk=sc.next();
		
		
		switch(chk)
		{
			case "A":System.out.println("짜장면을 주문");break;
			case "B":System.out.println("짬뽕을 주문");break;
			case "C":System.out.println("우동을 주문");break;
			case "D":System.out.println("탕수육을 주문");break;
			default:System.out.println("잘못 입력");
		
		}
		
		
		
		
	}

}
