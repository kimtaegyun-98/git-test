
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItem = new ArrayList<>();
        menuItem.add(new MenuItem("1. 불고기버거", 3500, "한국인의 입맛에 딱 맞는 불고기 소스에 신선한 양상추의 맛있는 조합의 불고기버거"));
        menuItem.add(new MenuItem("2. 새우버거", 5500, "탱~글한 통새우살 가득~ 새우 버거!"));
        menuItem.add(new MenuItem("3. 치킨버거", 5000, "고소한 화이트 마요 소스와 아삭한 양상추가 함께 치킨버거!"));
        menuItem.add(new MenuItem("4. 치즈버거", 4000, "고소하고 부드러운 치즈와 100% 순 쇠고기 패티, 맥도날드만의 심플한 클래식 치즈버거"));

          Kiosk kiosk = new Kiosk(menuItem);

          kiosk.start();






    }


}



















