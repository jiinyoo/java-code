package j0509;

public class RandomEx3 {
	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			double num=Math.random()*45; //0~45사이의 실수
			//math random 0.0 ~ 1에 무한히 가까운 수를 제공합니다
			int ran=(int)num; //0~44까지의 정수
			ran=ran+1;
			System.out.print(ran+" ");
			
			
		}
	}

}
