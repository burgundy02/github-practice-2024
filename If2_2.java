package j06_조건;

import java.util.Scanner;

public class If2_2 {

	public static void main(String[] args) {
		/*
		 * 학점 판독기
		 * 점수(score)
		 * 점수를 입력하시오 : 97
		 * 
		 * 점수가 89점 초과 -> A학점 입니다.
		 * 점수가 79점 초과 -> B학점 입니다.
		 * 점수가 69점 초과 -> C학점 입니다.
		 * 점수가 59점 초과 -> D학점 입니다.
		 * 점수가 59점 이하 -> F학점 입니다.
		 * 점수가 0점 이하이거나 100점 초과이면 -> 계산불가 입니다.
		 * 
		 * 
		 * 메모
		 * 문제푸는 곳, 키오스크
		 */
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String result = null;
		
		System.out.println("점수를 입력하시오 : ");
		score = sc.nextInt();
		
//		if (sc > 89) {
//			System.out.println("A학점 입니다");
//		}else {
//			if (sc > 79) {
//				System.out.println("B학점 입니다");
//		}
//
//		}else {
//			if (sc > 69) {
//				System.out.println("C학점 입니다");
//		}
//		}
//		
//		}else {
//			if (sc > 69) {
//			System.out.println("C학점 입니다");
//		}
//		}else{
//			if (sc > 59) {
//				System.out.println("D학점 입니다");
//		} 
//		}else {
//			if (sc < 59) {
//					System.out.println("F학점 입니다");
//		}
//		}else {
//				System.out.println("계산 불가입니다");
//		}
		
		
		
		
		if (score < 0 || score > 100) {
			result = "계산불가";
		} else if (score > 89) {
			result = "A학점";
		} else if (score > 79) {
			result = "B학점";
		} else if (score > 69) {
			result = "C학점";
		} else if (score > 59) {
			result = "D학점";
		} else {
			result = "F학점";
		}
		
		System.out.println(result + "입니다");
		
		
		
		
		
		
		
	}

}
