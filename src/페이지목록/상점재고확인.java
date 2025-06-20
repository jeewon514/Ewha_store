package 페이지목록;

import java.util.InputMismatchException;

class 상점재고확인 extends 상품탐색페이지{
    private String 입고상품, 매진상품, 혜택;
    private double 가격;

    public static void show_page(){
        subpage1("빙그레 바나나 우유", 1.8);
        subpage2("햄포테이트명란마요샌드위치");

        System.out.println("메뉴-1: 메인 페이지       |    메뉴-2: 마이 페이지 ");

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
            case 10:
                상점지점페이지.show_page();
                return;
        }


    }

    public static void subpage1(String 입고상품, double 가격){
        입고상품 = 입고상품;
        가격 = 가격;
        System.out.println("입고 >>");
        System.out.println("상품. " + 입고상품);System.out.println("가격: " + 가격);System.out.println();
    }
    public static void subpage2(String 매진상품){
        매진상품 = 매진상품;
        System.out.println("매진 >>");
        System.out.println("상품. " + 매진상품);System.out.println();
    }
    public static void subpage3(String 혜택){
        System.out.println("혜택 >>");
        System.out.println(혜택);System.out.println();
    }
}
