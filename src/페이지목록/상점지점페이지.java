package 페이지목록;

public class 상점지점페이지 extends 상점메인페이지{
public static String branchName;
	
	public 상점지점페이지(String branchName) {
		this.branchName = branchName;
	}
	
	public static void show_page() {
		System.out.println("===========================================");
        System.out.println(branchName);
        System.out.println("운영시간: 매일 24시간 무인 운영\n        주중 8:30 ~ 17:30");
        System.out.println("===========================================");
        System.out.println("메뉴1: 상품보기");
        System.out.println("메뉴2: 재고확인하기");
        System.out.println("===========================================");
        System.out.println("메뉴-1: 통합페이지 | 메뉴-2: 마이페이지");
        System.out.print("메뉴 번호를 입력하세요: ");
        int sel = sc.nextInt();
        sc.nextLine();
        
        if(sel == 1)  {
            상품탐색페이지.showSubpage();
        } 
        else if(sel == 2) {
            상점재고확인.showSubpage();
        } 
        else {
            System.out.println("잘못된 입력입니다.");
            show_page();
        }
	}
}
