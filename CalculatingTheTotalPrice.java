public class CalculatingTheTotalPrice {
    static int totalPrice;

    public void setTotalPrice(int price) {
        totalPrice = totalPrice + price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void restart() {
        totalPrice = totalPrice - totalPrice;
    }
}