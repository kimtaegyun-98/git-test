import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Kiosk {



        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItem = new ArrayList<>();

    public Kiosk(List<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

        void start () {

           for(MenuItem a:menuItem )
               System.out.println(a);
            System.out.println("0. 종료       | 종료");


            System.out.println("주문하실 햄버거 번호를 입력해주세요 ");


            while (true) {

                int number = scanner.nextInt();// 주문할 햄버거 번호 입력 받기


                switch (number) {
                    case 1:
                        System.out.println("| w 3500 | " + "불고기버거 메뉴를 선택하셨습니다");
                        break;
                    case 2:
                        System.out.println("| w 5500 | " + "새우버거 메뉴를 선택하셨습니다");
                        break;

                    case 3:
                        System.out.println("| w 5000 | " + "치킨버거 메뉴를 선택하셨습니다");
                        break;

                    case 4:
                        System.out.println("| w 4000 | " + "치즈버거 메뉴를 선택하셨습니다");
                        break;

                    default:
                        throw new IllegalArgumentException("잘못된 숫자 입력입니다");
                }
                if (number == 0) {
                    System.out.println("키오스크를 종료합니다");
                    return;
                }

            }
        }

    }



