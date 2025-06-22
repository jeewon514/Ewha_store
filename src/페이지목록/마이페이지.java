package 페이지목록;

import 메인.*;
import java.util.*;
public class 마이페이지 extends 웹페이지 {

    static Scanner sc = new Scanner(System.in);
    public static void show_page(){
    	System.out.println(" ");
        System.out.println("===========================================");
        System.out.println("                  마이페이지                  ");
        System.out.println("===========================================");

        System.out.println(Main.user.name+"님! 환영합니다.");
        System.out.println("찜한 메뉴: "+Main.user.favmenu);
        System.out.println("스탬프 개수:  5개");
        System.out.println("===========================================");

        System.out.println("    마이 메뉴    ");
        System.out.println("메뉴 1: 결제수단 관리  | 메뉴 2: 전자 영수증   | 메뉴 3: 메뉴 찜하기");
        System.out.println("메뉴 4:  쿠폰 등록    | 메뉴 5: 개인정보 관리 | 메뉴 6: 지점 찜하기");

        System.out.println("===========================================");
        System.out.println("                   바로가기                  ");
        System.out.println("===========================================");
        System.out.println("메뉴 -1: 메인페이지 | 메뉴 -2: 마이페이지");

        int select;
        System.out.print("메뉴 선택(번호 입력): ");
        select = sc.nextInt();

        switch(select){
            case -1:
                메인페이지.show_page();
                break;
            case -2:
                show_page();
                break;
            case 0:
                System.exit(0);
        }

    }
}



