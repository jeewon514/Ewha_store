package 페이지목록;

public class 카페메인페이지 extends 웹페이지{

    public static void show_page(){
        System.out.println("상점 메인페이지");
        
        
		System.out.print("지점 선택하기: ");
		String input = sc.next();
		goTo(new 카페지점페이지(input));
    }
}
