public class Beverages {
    public String[] beveragesNameList() {
        return new String[]{"Coke", "Sprite", "Fanta"};
    }

    public int[] beveragesPriceList() {
        return new int[]{200, 190, 200};
    }

    public String getCoke() {
        return beveragesNameList()[0] + " - " + beveragesPriceList()[0];
    }

    public String getSprite() {
        return beveragesNameList()[1] + " - " + beveragesPriceList()[1];
    }

    public String getFanta() {
        return beveragesNameList()[2] + " - " + beveragesPriceList()[2];
    }
}