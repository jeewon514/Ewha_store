package 페이지목록;

import java.util.Scanner;

public class 로그인페이지 extends 웹페이지 {
    static Scanner sc = new Scanner(System.in);
    public int 재고현황보기;
    public void 재고현황(int 재고현황보기){
        this.재고현황보기 = 재고현황보기;
    }

    public void showSubpage() {
        System.out.println("===========================================");
        System.out.println("상점 하위페이지");
        System.out.println("===========================================");
        System.out.println("상품1. 빙그래) 바나나우유 240ml");System.out.println("가격: 1.8");System.out.println();
        System.out.println("상품2. CJ) 햇반소고기죽 268g");System.out.println("가격: 5.5");System.out.println();
        System.out.println("상품3. 바프) 쿠키앤크림몰크볼 40g");System.out.println("가격: 2.5");System.out.println();
        System.out.println("상품4. 동원) 덴마크초코초코우유 300g");System.out.println("가격: 2.0");System.out.println();
        System.out.println("상품5. 숯불맛소불고기김밥");System.out.println("가격: 2.8");
        System.out.println("===========================================");
        System.out.println("메뉴1: 전체 메뉴 조회    |    메뉴2: 인기순 메뉴 조회");
        System.out.println("메뉴3: 통합 페이지       |    메뉴4: 마이 페이지");
        System.out.println("===========================================");
    }
}
class subpage extends 로그인페이지{
    private String 입고상품, 매진상품, 혜택;
    private double 가격;
    @Override
    public void 재고현황(int 재고현황보기) {
        super.재고현황(재고현황보기);
    }
    public void subpage1(String 입고상품, double 가격){
        this.입고상품 = 입고상품; this.가격 = 가격;
        System.out.println("입고 >>");
        System.out.println("상품. " + 입고상품);System.out.println("가격: " + 가격);System.out.println();
    }
    public void subpage2(String 매진상품){
        this.매진상품 = 매진상품;
        System.out.println("매진 >>");
        System.out.println("상품. " + 매진상품);System.out.println();
    }
    public void subpage3(String 혜택){
        System.out.println("혜택 >>");
        System.out.println(혜택);System.out.println();
    }
    @Override
    public void showSubpage() {
        super.showSubpage();
    }
}
class menu extends subpage {
    public void setMenu() {
        System.out.println("메뉴1: 전체 메뉴 조회    |    메뉴2: 인기순 메뉴 조회");
        System.out.println("메뉴3: 통합 페이지       |    메뉴4: 마이 페이지");
    }
    public void printMenu(){
        int menu = sc.nextInt();
        String result=".";
        switch (menu){
            case 1: result = "1) 전체 메뉴 조회"; break;
            case 2: result = "2) 인기순 메뉴 조회";break;
            case 3: result = "3) 통합 페이지";break;
            case 4: result = "4) 마이 페이지";break;
        }
        System.out.println(result);
    }
}

public class 상점메인페이지 {
    public static void main(String[] args) {
        menu page = new menu();
        page.showSubpage();

        page.subpage1("하겐) 쿠키앤크림파인트",17.9);
        page.subpage2("매일) 바이오그릭 400g");
        page.subpage3("빙그레) 초코타임 200ml - 1 + 1");

        page.printMenu();
    }
}




//public class 상점메인페이지 extends 웹페이지{

  //  public static void show_page(){
  //      System.out.println("상점 메인페이지");
  //  }
//}
