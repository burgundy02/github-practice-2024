package j06_조건;

public class If2 {

	public static void main(String[] args) {
		/* hint
		 * 
		 * 3,000 -> 딸기, 귤, 샤인머스켓
		 * 4,000 -> 통귤, 산타
		 * 
		 * 10,000원이 넘게 있으면 통귤, 산타 중에 하나 먹어라
		 * 6,000원이 넘게 있으면 딸기,귤,샤인머스켓 중에 하나 먹어라
		 * 6,000원 이하 있으면 버스타고 가라
		 */
		
		int money = 12000; // *출력하면 "통귤, 산타"
		if(money  > 10000) {
			System.out.println("통귤, 산타 중에 하나 먹어라");
			
		} else {
			if (money > 6000) {
				System.out.println("딸기, 귤, 샤인머스켓 중에 하나 먹어라");
			} else {
				System.out.println("버스타고 집가라");
			}
		}
			
	}

}
