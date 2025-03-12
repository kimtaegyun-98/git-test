import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem> menuItems; // 메뉴 아이템 리스트

    // 생성자
    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }
    public String getCategory() {
        return category;
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void showMenuItems() {
        for (MenuItem menuItems: menuItems){
            System.out.println(menuItems.printMenuItem());
        }
    }
}






