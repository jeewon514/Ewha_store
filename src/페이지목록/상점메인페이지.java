package 페이지목록;
import java.util.Scanner;

public class 상점메인페이지 extends 웹페이지{
	
	public static void goTo(상점지점페이지 page) {
        page.show_page();
    }

    public static void show_page(){
    	Scanner scanner = new Scanner(System.in);
		
		String[] branches = {"학생문화관점", "아산공학관점", "중앙도서관점"};
		
		System.out.println("===========================================");
		System.out.println("              이화 상점 메인 페이지              ");
		System.out.println("===========================================");
		System.out.println("                                           ");
		System.out.println("학생문화관점");
		System.out.println("학생문화관 B1층 B107호");
		System.out.println("-------------------------------------------");
		System.out.println("아산공학관점");
		System.out.println("아산공학관 1층 110호");
		System.out.println("-------------------------------------------");
		System.out.println("중앙도서관점");
		System.out.println("중앙도서관 B1층 B103-2호");
		System.out.println("                                           ");
		System.out.println("===========================================");
		
		while (true) {
            System.out.print("지점 선택하기(전으로 돌아가려면 10을 입력하시오): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println(" >> 입력이 없습니다. 다시 입력해주세요.");
                continue;
            } else if (input.equals("10")) {
				메인페이지.show_page();
				break;
			}	else if (!isValidBranch(input, branches)) {
                System.out.println(" >> 해당 지점이 존재하지 않습니다.");
                continue;
            }  else {
                System.out.println(" >> " + input + " 페이지로 이동");
                상점지점페이지 page = new 상점지점페이지(input);
                goTo(page);
                break;
            }
        }
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
