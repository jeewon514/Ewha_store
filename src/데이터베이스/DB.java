package 데이터베이스;

import java.io.*;
import java.util.*;
import 사용자.*;
import 메인.*;
public class DB {

    private static DB instance = null;
    public static File file = new File("src/data/사용자정보db.txt");
    public static ArrayList<고객> user_list = new ArrayList<>();


    private DB(){}

    public static DB getInstance(){
        if(instance == null){
            instance = new DB();
        }
        return instance;
    }



    //로그인 시 사용자.사용자 확인 여부 (아이디, 비밀번호 받아서 위에 벡터에 있는 정보인지 맞추는 함수)
    public boolean authorize_user(String id, String pw){

        for(고객 user : user_list){
            if(user.id.equals(id)){
                if(user.pw.equals(pw)){
                    Main.setUser(user);
                    return true;
                }
            }
        }
        return false;
    }

    //회원가입 시 유저 추가하는 메소드
    public void add_userlist(고객 customer){
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write("\n");
            writer.write(customer.id+","+customer.pw+","+customer.name+","+customer.phone+","+customer.favmenu);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        user_list.add(customer);
    }

    //앱 시작하면, 데이터베이스에 있는 정보 가져오는 메소드
    public static void load_data(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine())!=null){
                String[] user_info = line.split(",");
                고객 customer = new 고객(user_info[0], user_info[1], user_info[2],user_info[3], user_info[4]);
                user_list.add(customer);
            }
            reader.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}





