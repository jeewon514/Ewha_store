package 페이지목록;

import java.util.InputMismatchException;

public class 카페주문결과페이지 extends 카페지점페이지 {
    static String order;

    public 카페주문결과페이지(String branchName, String order) {
        super(branchName);
        this.order = order;
    }

    public static void show_page(String order) {
        int myNum = (int) (Math.random() * 10 + 1);
        int frontNum = (int) (Math.random() * myNum);

        System.out.println(" ");
        System.out.println("===========================================");
        System.out.println("주문하신 메뉴: " + order);
        System.out.println("대기번호: #" + myNum);
        System.out.println("내 앞 대기 팀: " + frontNum + "팀");

        System.out.println("===========================================");
        System.out.println("메뉴 -1: 메인페이지    |    메뉴 -2: 마이페이지");
        System.out.print("메뉴 번호를 입력하세요(전으로 돌아가려면 10을 입력하시오): ");

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
