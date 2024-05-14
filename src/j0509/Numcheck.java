package j0509;

import java.util.Scanner;

public class Numcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자를 입력받는다.
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		//입력된 숫자가 홀수인지 짝수인지 출력하시오.
		if(num%2==0)
		{
			System.out.println("짝수");
		}
		
		else
		{
			System.out.println("홀수");
		}

	}

}
