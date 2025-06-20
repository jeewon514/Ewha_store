package 페이지목록;

import java.util.*;
import 사용자.*;

public class 회원가입페이지 extends 웹페이지 {

    public static Scanner sc = new Scanner(System.in);
    public static void show_page(){
        System.out.print("이름: ");
        String name = sc.next();

        System.out.print("전화번호: ");
        String phone = sc.next();

        System.out.print("아이디: ");
        String id;
        while(true){
            try{
                id = sc.next();
            } catch(InputMismatchException e){
                sc.nextLine();
                continue;
            }

            break;
        }

        System.out.print("비밀번호: ");
        String pw;
        while(true){
            try{
                pw = sc.next();
            } catch(InputMismatchException e){
                sc.nextLine();
                continue;
            }

            break;
        }
        //데이터베이스의 사용자추가 메소드
        고객 customer = new 고객(id, pw, name, phone, "찜한 메뉴가 없습니다");
        db.add_userlist(customer);
        System.out.println("회원가입 완료!");

        홈페이지.show_page();
        return;
    }
}
