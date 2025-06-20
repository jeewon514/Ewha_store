package 페이지목록;
import java.util.Scanner;

public class 카페메인페이지 extends 웹페이지{

    public static void show_page(){
//         System.out.println("상점 메인페이지");
        
        
// 		System.out.print("지점 선택하기: ");
// 		String input = sc.next();
		
    	Scanner scanner = new Scanner(System.in);
		
		String[] branches = {"신공학관점", "학생문화관점", "학관점"};
		
		System.out.println("===========================================");
		System.out.println("              이화 카페 메인 페이지              ");
		System.out.println("===========================================");
		System.out.println("                                           ");
		System.out.println("신공학관점");
		System.out.println("신공학관 B2층 B258호");
		System.out.println("-------------------------------------------");
		System.out.println("학생문화관점");
		System.out.println("학생문화관 B1층 109호");
		System.out.println("-------------------------------------------");
		System.out.println("학관점");
		System.out.println("학관 4층 452호");
		System.out.println("                                           ");
		System.out.println("===========================================");
		System.out.println("                                           ");
		System.out.print("지점 선택하기 : ");
		String input = scanner.nextLine().trim();
		
    while(true){
       if (input.isEmpty()) {
			   System.out.println(" >> 입력이 없습니다. 다시 입력해주세요.");
         continue
		  }
		  else if (!isValidBranch(input, branches)) {
			  System.out.println(" >> 해당 지점이 존재하지 않습니다.");
		  }
		  else {
			  System.out.println(" >> " + input + " 페이지로 이동");
        goTo(new 카페지점페이지(input));
		  }
		  scanner.close();
    }
      
    public static boolean isValidBranch(String input, String[] branches) {
		for (String branch : branches) {
			if (branch.equals(input)) {
				return true;
			}
		}
		return false;
	}
}
