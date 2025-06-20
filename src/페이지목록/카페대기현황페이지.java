package 페이지목록;

import java.util.InputMismatchException;

public class 카페대기현황페이지 extends 카페지점페이지 {
    public 카페대기현황페이지(String branchName) {
        super(branchName);
    }

    public static void show_page() {
        int waitingTeams = (int) (Math.random() * 10 + 1);
        System.out.println(" ");
        System.out.println("===========================================");
        System.out.println("현재 대기 팀 수: " + waitingTeams + "팀");
        System.out.println("===========================================");
        System.out.println("메뉴-1: 메인페이지 | 메뉴-2: 마이페이지");
        System.out.print("메뉴 번호를 입력하세요 (전으로 돌아가려면 10을 입력하시오): ");

        int select = 0;
        while (true) {
            try {
                select = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                continue;
            }

            break;
        }

        switch (select) {
            case -1:
                메인페이지.show_page();
                return;
            case -2:
                마이페이지.show_page();
                return;
            case 0:
                System.exit(0);
            case 10:
            	카페지점페이지.show_page();
            	return;
        }
    }
}

