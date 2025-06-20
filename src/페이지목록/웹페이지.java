package 페이지목록;
import 데이터베이스.*;
import 사용자.*;
import java.util.*;
public abstract class 웹페이지 {

    public static DB db= DB.getInstance();
    public String 페이지이름;
    
    public static Scanner sc = new Scanner(System.in);

    public static void show_page(){

    }

    public static void end(){
        end();
    }

}
