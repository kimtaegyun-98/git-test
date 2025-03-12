
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Menu> menu = new ArrayList<>();
        List<MenuItem> burgers = new ArrayList<>();         // 버거 리스트
        burgers.add(new MenuItem(1, " 불고기버거", 3500, "한국인의 입맛에 딱 맞는 불고기 소스에 신선한 양상추의 맛있는 조합의 불고기버거"));
        burgers.add(new MenuItem(2, " 새우버거", 5500, "탱~글한 통새우살 가득~ 새우 버거!"));
        burgers.add(new MenuItem(3, " 치킨버거", 5000, "고소한 화이트 마요 소스와 아삭한 양상추가 함께 치킨버거!"));
        burgers.add(new MenuItem(4, " 치즈버거", 4000, "고소하고 부드러운 치즈와 100% 순 쇠고기 패티, 맥도날드만의 심플한 클래식 치즈버거"));

        List<MenuItem> drinks = new ArrayList<>();    // 음료 리스트
        drinks.add(new MenuItem(1, "콜라",1500,"상큼한 탄산음료"));
        drinks.add(new MenuItem(2, "사이다",1500,"상쾌한 탄산음료"));

        List<MenuItem> desserts =new ArrayList<>();   // 디저트 리스트
        desserts.add(new MenuItem(1, "소프트콘",1000,"부드러운 우유맛 아이스크림" ));
        desserts.add(new MenuItem(2, "초코콘",1500,"달콤한 초코가 듬뿍 들어간 아이스크림" ));

        menu.add(new Menu("1.버거", burgers));    // 카테고리 별 메뉴
        menu.add(new Menu("2.음료수",drinks));
        menu.add(new Menu("3.디저트",desserts));

        Kiosk kiosk = new Kiosk(menu);      // 키오스크 객체 소환
        // 키오스크 객체 소환
        kiosk.start();
    }
}



















