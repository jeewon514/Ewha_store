package 페이지목록;

public class 상점입고결과페이지 {
    static String storage;
    public 상점입고결과페이지(String branchName, String storage){
        super(branchName);this.storage = storage;
    }
    public static void show_page(String order){
        System.out.println("===========================================");
        System.out.println("상점 하위페이지");
        System.out.println("===========================================");
        System.out.println("상품1. 빙그래) 바나나우유 240ml");System.out.println("가격: 1.8");System.out.println();
        System.out.println("상품2. CJ) 햇반소고기죽 268g");System.out.println("가격: 5.5");System.out.println();
        System.out.println("상품3. 바프) 쿠키앤크림몰크볼 40g");System.out.println("가격: 2.5");System.out.println();
        System.out.println("상품4. 동원) 덴마크초코초코우유 300g");System.out.println("가격: 2.0");System.out.println();
        System.out.println("상품5. 숯불맛소불고기김밥");System.out.println("가격: 2.8");

    }
}
