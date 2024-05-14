package j0509;

import java.util.Scanner;

public class IfEx7 {
	public static void main(String[] args) {
		//국어점수를 입력받는다.
		//수우미양가로 출력하시오
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		
		if(kor>=90) {
			System.out.println("수");
		}else if(kor>=80) 
			{
			 System.out.println("우");
			}else if(kor>=70)
				{
				 System.out.println("미");
				}else if(kor>=60)
					{
					System.out.println("양");
					}else 
						{
						System.out.println("가");
						}
	}

}
