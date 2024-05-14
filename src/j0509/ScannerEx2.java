package j0509;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//이름 나이를 입력 받아보자
		String name=sc.next();
		int age=sc.nextInt();
		
		//실무에서는 변수명 2가지 이상의 단어의 조합으로 쓴다.
		System.out.println(name);
		System.out.println(age);
	}

}
