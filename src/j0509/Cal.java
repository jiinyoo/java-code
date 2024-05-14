package j0509;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		//두 개의 숫자를 입력받는다.
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 숫자를 입력하시오");
		num1=sc.nextInt();
		num2=sc.nextInt();
		//사용자로부터 1:더하기 2:빼기 3:곱하기 4:나누기
		System.out.println("1:더하기 2:빼기 3:곱하기 4:나누기");
		int num3=sc.nextInt();
		//4개의 숫자를 입력받아서 두개의 숫자를 산술 연산하는 프로그램을 작성하시오.
		
		if(num3==1) {
			System.out.println(num1+num2);
		}else if(num3==2){
			System.out.println(num1-num2);
				}else if(num3==3){
					System.out.println(num1*num2);
						}else if(num3==4) {
							System.out.println(num1/num2);
						}
		
		
		
		
		
	}
}
