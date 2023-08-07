package hello.core.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int price;
    private int discountPrice;

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }

    public int calculate () {
        return price - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Order(Long memberId, String itemName, int price, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.price = price;
        this.discountPrice = discountPrice;
    }
}
