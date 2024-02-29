package j06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //*이렇게 하면 스케너를 쓸 준비가 완료
		String name = null;
		name = sc.nextLine();
		if(name.equals("파마산")) {
			System.out.println("파마산입니다");
		}else if (name.equals("모짜렐라")) {
			System.out.println("모짜렐라");
		}else if (name.equals("슈레드")) {
			System.out.println("슈레드입니다");
		}
		
	}

}
