package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		String num= "40";
		switch(num) {
		case "10":
			System.out.println("10입니다.");
		case "20":
			System.out.println("20입니다.");
		case "30":
			System.out.println("30입니다.");
		case "40":
			System.out.println("40입니다.");
			System.err.println("40입니다.2");
			break; // 멈추고 빠져나감
		case "50":
			System.out.println("50입니다.");
			default:
				System.out.println("결과에 상관없이 실행");  //*무조건 실행되는 값 /*break는 멈추고 해당 기능을 빠져나간다.
		}
		System.out.println("switch 밖");
	}

}
