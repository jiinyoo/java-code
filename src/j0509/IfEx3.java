package j0509;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		//국어점수(kor)와 영어점수(eng)를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		double kor=sc.nextInt();
		System.out.print("영어점수 입력 : ");
		double eng=sc.nextInt();
		
		//추가 입력값을 입력받는다(chk변수 : 정수형)
		//1이 입력되면 국어와 영어의 합계를 출력
		//1이 아니면 국어와 영어의 평균을 출력
		
		System.out.println("합계는 1을 입력 평균은 2를 입력");
		int chk = sc.nextInt();
		
		if(chk==1)
		{
			System.out.println(kor+eng);
		}
		else
		{
			System.out.println((kor+eng)/2);
		}
		
	}

}
