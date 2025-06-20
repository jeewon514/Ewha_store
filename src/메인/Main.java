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


    }

    public static void default_setting(){
        DB.load_data();
    }

    public static void show_mainpage(){

    }
    
}
