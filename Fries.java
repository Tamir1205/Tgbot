public class Fries {
    public String[] friesNameList() {
        return new String[]{"French Fries"};
    }

    public int[] friesPriceList() {
        return new int[]{450};
    }

    public String getFrenchFries() {
        return friesNameList()[0] + " - " + friesPriceList()[0];
    }
}