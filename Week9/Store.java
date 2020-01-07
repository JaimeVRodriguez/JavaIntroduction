public class Store {

    String productType;
    int inventoryCount;
    double inventoryPrice;

    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public static void main(String[] args) {
        Store chipsAlot = new Store("cookies",12,3.75);
        Store muffinStop = new Store("muffins", 15, 2.55);
        Store cakeMate = new Store("cakes", 2, 10.99);
        Store coffeeBeans = new Store("coffee", 18, 4.25);

        System.out.println("The \"Chips Alot\" store sells " +
                chipsAlot.inventoryCount + " " + chipsAlot.productType +
                " for " + "$" + chipsAlot.inventoryPrice + " a piece.");
        System.out.println("The \"Muffin Stop\" store sells " +
                muffinStop.inventoryCount + " " + muffinStop.productType +
                " for " + "$" + muffinStop.inventoryPrice + " a piece.");
        System.out.println("The \"Cake Mate\" store sells " +
                cakeMate.inventoryCount + " " + cakeMate.productType +
                " for " + "$" + cakeMate.inventoryPrice + " a piece.");
        System.out.println("The \"Coffee Beans\" store sells " +
                coffeeBeans.inventoryCount + " cups of " + coffeeBeans.productType +
                " for " + "$" + coffeeBeans.inventoryPrice + " a piece.");

    }
}
