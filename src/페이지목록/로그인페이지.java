package 페이지목록;

import java.util.*;
import 사용자.*;
import 메인.*;

public class 로그인페이지 extends 웹페이지 {

    static Scanner sc = new Scanner(System.in);

    public static void show_page(){
        System.out.print("아이디를 입력해주세요: ");
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

        System.out.print("비밀번호를 입력해주세요: ");
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

        if(db.authorize_user(id,pw)){
            System.out.println("로그인 성공! "+Main.user.name+"님 환영합니다! 메인페이지로 이동합니다.");
            try {
                Thread.sleep(1500); // 1초 동안 지연
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            메인페이지.show_page();
        }
        else{
            System.out.println("로그인 실패! 아이디와 비밀번호를 다시 확인해주세요");
            try {
                Thread.sleep(1500); // 1초 동안 지연
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            show_page();
        }
    }
}
