package j06_조건;

public class If1 {

	public static void main(String[] args) {
		// 돈이 있으면 택시를 타고 돈이 없으면 걸어가라
		
		boolean money = false;
		if(money) {
			System.out.println("택시를 타고 가라");
		}
	    if (!money) {
	    	System.out.println("걸어가라");
	    	System.out.println("걸어가다라 빨리 뛰어라");
	    }
	    // 돈이 있으면 탕후루를 먹고 돈이 없으면 감귤먹어라
	    
	    boolean money2 = true;
	    if(money2) {
	    	System.out.println("탕후루를 먹을 자격이 있다");
	    	
	    }
	    if(!money2) System.out.println("감귤이라도 드시오");
	    // 조건문 안의 실행문이 하나일 때는 중괄호 생략가능
	    			System.out.println("제주 한라산 굿");   //*얘는 그냥 출력문이게 된다
	    			
	    			System.out.println();
	    			
	    			
	    			// 자동정렬 단축키 -> ctrl + shift + F
					if(money2) {
						System.out.println("탕후루를 먹을 자격이 있다2");  
						System.out.println("탕후루 짱짱!");

					}else {
						System.out.println("감귤먹어라2");
					}

					/*
					 * <if문의 기본구조>
					 * if(조건식) {
					 * 				실행문1;
					 * 				실행문2;
					 * 				...
					 * } else {
					 * 			실행문a;
					 * 			실행문b;
					 * 			...
					 * }
					 */
					
					
	}

}
