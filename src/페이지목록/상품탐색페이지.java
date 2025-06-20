package 페이지목록;

import java.util.Scanner;

public class 상품탐색페이지 extends 웹페이지 {

    public static Scanner sc = new Scanner(System.in);
    public static String storage = " 하겐) 쿠키앤크림파인트 \n17.9 ";
    public static boolean check_new = false;
    public static void show_page() {
    	System.out.println(" ");
        System.out.println("===========================================");
        System.out.println("                 상품 탐색 페이지              ");
        System.out.println("===========================================");
        System.out.println("상품1. 빙그래) 바나나우유 240ml");System.out.println("가격: 1.8");System.out.println();
        System.out.println("상품2. CJ) 햇반소고기죽 268g");System.out.println("가격: 5.5");System.out.println();
        System.out.println("상품3. 바프) 쿠키앤크림몰크볼 40g");System.out.println("가격: 2.5");System.out.println();
        System.out.println("상품4. 동원) 덴마크초코초코우유 300g");System.out.println("가격: 2.0");System.out.println();
        System.out.println("상품5. 숯불맛소불고기김밥");System.out.println("가격: 2.8");System.out.println();
        if(check_new){
            System.out.println("상품6. 하겐) 쿠키앤크림파인트 [New!]");System.out.println("가격: 17.9");System.out.println();
        }
        System.out.println("===========================================");
        System.out.println("메뉴 1: 전체 메뉴 조회      |    메뉴 2: 인기순 메뉴 조회");
        System.out.println("메뉴 3: 입고 확인");
        System.out.println("메뉴 -1: 메인 페이지       |    메뉴 -2: 마이 페이지");
        System.out.println("===========================================");

        select_menu();
    }

    public static void show_all(){
    	System.out.println(" ");
        System.out.println("===========================================");
        System.out.println("                 상품 탐색 페이지              ");
        System.out.println("===========================================");
        System.out.println("상품1. 동원) 뉴트리플랜흰살참치와치즈 160g");System.out.println("가격: 1.8");System.out.println();
        System.out.println("상품2. 동원) 덴마크초코초코우유 300g");System.out.println("가격: 2.0");System.out.println();
        System.out.println("상품3. 나뚜루) 딸기밀크초콜릿바 ");System.out.println("가격: 5.9");System.out.println();
        System.out.println("상품4. 빙그래) 바나나우유 240ml");System.out.println("가격: 1.8");System.out.println();
        System.out.println("상품5. 숯불맛소불고기김밥");System.out.println("가격: 2.8");System.out.println();
        System.out.println("상품6. 바프) 쿠키앤크림몰크볼 40g");System.out.println("가격: 2.5");System.out.println();
        if(check_new){
            System.out.println("상품7. 하겐) 쿠키앤크림파인트 [New!]");System.out.println("가격: 17.9");System.out.println();
            System.out.println("상품8. CJ) 햇반소고기죽 268g");System.out.println("가격: 5.5");System.out.println();
        }
        else{
            System.out.println("상품7. CJ) 햇반소고기죽 268g");System.out.println("가격: 5.5");System.out.println();
        }
        System.out.println("===========================================");
        System.out.println("메뉴 1: 전체 메뉴 조회      |    메뉴 2: 인기순 메뉴 조회 ");
        System.out.println("메뉴 3: 입고 확인");
        System.out.println("메뉴 -1: 메인 페이지       |      메뉴 -2: 마이 페이지");
        System.out.println("===========================================");

        select_menu();
    }

    public static void show_order(){
    	System.out.println(" ");
        System.out.println("===========================================");
        System.out.println("                 상품 탐색 페이지              ");
        System.out.println("===========================================");
        System.out.println("상품1. 바프) 쿠키앤크림몰크볼 40g");System.out.println("가격: 2.5");System.out.println();
        System.out.println("상품2. 동원) 덴마크초코초코우유 300g");System.out.println("가격: 2.0");System.out.println();
        System.out.println("상품3. 빙그래) 바나나우유 240ml");System.out.println("가격: 1.8");System.out.println();
        System.out.println("상품4. 숯불맛소불고기김밥");System.out.println("가격: 2.8");System.out.println();
        System.out.println("상품5. CJ) 햇반소고기죽 268g");System.out.println("가격: 5.5");System.out.println();
        System.out.println("상품6. 나뚜루) 딸기밀크초콜릿바");System.out.println("가격: 5.9");System.out.println();
        System.out.println("상품7. 동원) 뉴트리플랜흰살참치와치즈");System.out.println("가격: 1.8");System.out.println();
        if(check_new){
            System.out.println("상품8. 하겐) 쿠키앤크림파인트 [New!]");System.out.println("가격: 17.9");System.out.println();
        }
        System.out.println("===========================================");
        System.out.println("메뉴 1: 전체 메뉴 조회      |    메뉴 2: 인기순 메뉴 조회");
        System.out.println("메뉴 3: 입고 확인");
        System.out.println("메뉴 -1: 메인 페이지       |    메뉴 -2: 마이 페이지");
        System.out.println("===========================================");

        select_menu();
    }

    public static void add_product(){
        check_new = true;
        show_all();

    }

    public static void select_menu(){
        System.out.print("메뉴 번호를 입력하세요 (전으로 돌아가려면 10을 입력하시오): ");
        int select = sc.nextInt();
        switch(select){
            case 1:
                show_all();
                break;
            case 2:
                show_order();
                break;
            case 3:
                add_product();
                break;
            case 0:
                System.exit(0);
            case 10:
                상점지점페이지.show_page();
            case -1:
                메인페이지.show_page();
                break;
            case -2:
                마이페이지.show_page();
                break;

        }
    }
}