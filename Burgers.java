public class Burgers {
    public String[] burgerNameList() {
        return new String[]{"Chicken burger", "Beef burger"};
    }

    public int[] burgerPriceList() {
        return new int[]{600, 800};
    }

    public String getChickenBurger() {
        return burgerNameList()[0] + " - " + burgerPriceList()[0];
    }

    public String getBeefBurger() {
        return burgerNameList()[1] + " - " + burgerPriceList()[1];
    }
}