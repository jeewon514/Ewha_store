package 메인;

import 데이터베이스.DB;
import 매장.*;
import 사용자.*;
import 페이지목록.*;

import java.util.*;

public class Main {

    public static DB db= DB.getInstance();
    public static 고객 user = null;
    public static Scanner sc = new Scanner(System.in);


    public static void setUser(고객 u){
        user = u;
    }

    public static void main(String[] args){

        default_setting();
        홈페이지.show_page();
        웹페이지.show_page();

    }

    public static void default_setting(){
        DB.load_data();
        이화카페 공대점 = new 이화카페("매장.이화카페 공대점", "김이화1", "공대B132");
        이화카페 학관점 = new 이화카페 ("매장.이화카페 학관점", "김일화", "학관421");
    }

    public static void show_mainpage(){

    }
    
}
