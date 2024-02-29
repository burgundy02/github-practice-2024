package j06_조건;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		/*
		 * 사분면
		 * 
		 * x값을 입력하시오 : 3
		 * y값을 입력하시오 : -2
		 *  * x또는 y중에 하나라도 0이 있으면 4사분면으로 보내시오
		 * 출력
		 * x : 3
		 * y : -2
		 * 결과 : 4사분면입니다.
		 */
		
//		System.out.println("x값을 입력하시오 : ");
//		System.out.println("y값을 입력하시오 : ");
//		
//		Scanner sc = new Scanner(System.in);
//		int num1;
//		int num2;
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		String result = null;
		System.out.println("x값을 입력하시오: ");
		x = sc.nextInt();
		System.out.println("y값을 입력하시오: ");
		y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			result = "1";
		}else if(x < 0 && y > 0) {
			result = "2";
		}else if(x < 0 && y < 0) {
			result = "3";
		}else {
			result = "4";
		}
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println(result + "사분면입니다.");
		
		
		
	}

}
