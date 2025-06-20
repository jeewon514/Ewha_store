package 페이지목록;

import java.util.Scanner;

public class 상품메뉴조회페이지 extends 상점지점페이지 {
    Scanner sc = new Scanner(System.in);
    static String[] menu = {"빙그래) 바나나우유 240ml", "CJ) 햇반소고기죽 268g", "바프) 쿠키앤크림몰크볼 40g", "동원) 덴마크초코초코우유 300g", "숯불맛소불고기김밥"};
    static int[] price = {1800, 5500, 2500, 2000, 2800};

    public static void setMenu() {
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
