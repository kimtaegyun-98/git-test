public class MenuItem {
    private int index;
    private String name;          // 속성 만들기 :이름, 가격, 설명
    private int price;
    private String explanation;

    MenuItem(int index, String name, int price, String explanation) {
        this.index = index;
        this.name = name;
        this.price = price;
        this.explanation =explanation;
    }

    public int getIndex() {
        return index;
    }

    public String printMenuItem() {
        return index + ". " + name + " - " + price + "원: " + explanation;
    }
}












