package 페이지목록;

import java.util.*;
public class 홈페이지 extends 웹페이지{

    public static Scanner sc = new Scanner(System.in);
    public static void show_page(){
        System.out.println("===========================================");
        System.out.println("                  이화상점                   ");
        System.out.println("===========================================");
        System.out.println("메뉴 1: 로그인     |    메뉴 2: 회원가입 ");
        System.out.print("메뉴를 선택해주세요: ");

        int select = 0;
        while(true){
            try{
                select = sc.nextInt();
            } catch(InputMismatchException e){
                sc.next();
                continue;
            }

            break;
        }

        switch(select){
            case 1:
                로그인페이지.show_page();
                return;
            case 2:
                회원가입페이지.show_page();
                return;
        }
    }
}
