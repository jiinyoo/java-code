package j0509;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		//콘솔창으로 입력하는 객체 만들기
		//Scanner라는 객체를 sc라는 이름으로 복사해라 
		//콘솔창으로 입력하는 객체만들기
		Scanner sc = new Scanner(System.in);
		//sc라는 가져온 장치의 기능을 보고 싶으면 sc.찍어보기
		sc.next();//문자를 입력받는 기능
		sc.nextInt();//숫자를 입력받는 기능
	}
}
