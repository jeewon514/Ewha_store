package 매장;

public class 이화카페 extends 매장 {

    public 이화카페(){}

    public 이화카페 (String 매장이름, String 매장관리자, String 매장위치){
        this.매장이름 = 매장이름;
        this.매장관리자 = 매장관리자;
        this.매장위치 = 매장위치;
        this.매장식별id = this.toString();
    }
}
