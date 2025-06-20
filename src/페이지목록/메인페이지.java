package 페이지목록;

import 메인.*;
import java.util.*;
public class 메인페이지 extends 웹페이지 {

    public static Scanner sc = new Scanner(System.in);
    public static void show_page() {
    	System.out.println(" ");
        System.out.println("===========================================");
        System.out.println("                  메인 페이지                 ");
        System.out.println("===========================================");

        System.out.println(Main.user.name+"님 환영합니다!");

        System.out.println("메뉴 1: 카페 페이지 | 메뉴 2: 상점 페이지");
        System.out.println("메뉴 -1: 메인페이지 | 메뉴 -2: 마이페이지");
        System.out.print("메뉴 선택(번호 입력): ");

        int select = sc.nextInt();

        switch(select){
            case 1:
                카페메인페이지.show_page();
                break;
            case 2:
                상점메인페이지.show_page();
                break;
            case 0:
                System.exit(0);
            case -1:
                show_page();
                break;
            case -2:
                마이페이지.show_page();
                break;
        }
    }
}



