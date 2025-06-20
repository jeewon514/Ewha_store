package 페이지목록;

public class 카페메뉴조회페이지 extends 카페지점페이지{
	static String[] menu = {"아이스 아메리카노", "핫 아메리카노", "아이스 카페라떼", "아이스티 (ice only)", "아이스 초코 카페 라떼", "망고 라떼 (ice only) [New!]"};
	static int[] price = {1700, 2000, 3700, 2500, 4400, 6000};
	
	public 카페메뉴조회페이지(String branchName) {
        super(branchName);
    }
	
	public static void show_page() {
		System.out.println("===========================================");
        System.out.println("                메뉴 조회 페이지               ");
        System.out.println("===========================================");
        for(int i=0; i<menu.length; i++) {
            System.out.println("메뉴" + (i+1) + ": " + menu[i]);
            System.out.println("가격: " + price[i] + "원");
            System.out.println();
        }
        System.out.println("===========================================");
        System.out.println("(전으로 돌아가려면 10을 입력하시오)");
        System.out.print("메뉴 주문하기 (예시: 아이스 아메리카노): ");
        String order = sc.nextLine();
        if (order.equals("10")) {
        	카페지점페이지.show_page();
        } else if (order.equals("0")){
            System.exit(0);
        }
        카페주문결과페이지.show_page(order);
	}

}
