package j0509;

import java.util.Scanner;

public class ifEx06 {
	public static void main(String[] args) {
		//ifEx5.java에서 
		//1~3의 값이 아닌 것이 들어올 경우
		//"잘못 입력하셨습니다."라고 출력하기
		int chk;
		Scanner sc = new Scanner(System.in);
		chk=sc.nextInt();
		if(chk==1)
		{
			System.out.println("짜장면을 주문하셨습니다.");
		}
		else if(chk==2)
			
			{
				System.out.println("짬뽕을 주문하셨습니다.");
			}
			else if(chk==3) {
				System.out.println("우동을 주문하셨습니다.");
			}

				else
				{
					System.out.println("잘못 입력하셨습니다.");
				}
	}

}
