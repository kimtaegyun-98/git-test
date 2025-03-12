import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<Menu> menu;   //
    Scanner scanner = new Scanner(System.in);

    Kiosk (List<Menu> menu){this.menu=menu;
    }

    void start ()  {// main에 사용할 메서드
        System.out.println("[ 메인 메뉴]");

        for (Menu printMenu : menu) {
            System.out.println(printMenu.getCategory());
        }
        System.out.println("0. 종료       | 종료");
        System.out.println("메뉴를 선택해주세요  ");

        while (true) {
          int number;
            // TODO 오류 예외처리 필요
            try {
                number = Integer.parseInt(scanner.nextLine()); // 문자열 입력 방지
            } catch (NumberFormatException e) {
                System.out.println(" 숫자를 입력해주세요!");
                continue;
            }
            // TODO 인덱스 검사
            if (number < 0 || number > menu.size()) {
                System.out.println("올바른 메뉴 번호를 입력해주세요!");
                continue;
            }
            Menu selecMenu = menu.get(number-1);
            selecMenu.showMenuItems();
            if (number == 0) {
                System.out.println("키오스크를 종료합니다");
                return;
            }
        }
    }
}



