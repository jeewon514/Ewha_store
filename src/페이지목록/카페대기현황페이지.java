package 페이지목록;

public class 카페대기현황페이지 extends 카페지점페이지{
	public 카페대기현황페이지(String branchName) {
		super(branchName);
	}
	
	public static void show_page() {
		int waitingTeams = (int)(Math.random()*10+1);
		System.out.println("현재 대기 팀 수: " + waitingTeams + "팀");
		System.out.println("=======");
        System.out.println("메뉴-1: 통합페이지 | 메뉴-2: 마이페이지");
	}
}
