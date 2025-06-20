package 페이지목록;

public class 카페주문결과페이지 extends 카페지점페이지{
	static String order;
	
	public 카페주문결과페이지(String branchName, String order) {
        super(branchName);
        this.order = order;
    }
	
	public static void show_page() {
		int myNum = (int)(Math.random()*10 + 1);
		int frontNum = (int)(Math.random()*myNum);
		
		System.out.println("주문하신 메뉴: " + order);
        System.out.println("대기번호: #" + myNum);
        System.out.println("내 앞 대기 팀: " + frontNum + "팀");
        
        System.out.println("=======");
        System.out.println("메뉴-1: 통합페이지 | 메뉴-2: 마이페이지");
	}

}
