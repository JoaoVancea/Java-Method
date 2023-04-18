public class Store {

    //variáveis de instância
    String productType;
    double price;

    //construtor
    public Store(String product, double productPrice) {
        productType = product;
        price = productPrice;
    }

    //método1
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    //método2
    public void greetCostumer(String costumer) {
        System.out.println("Welcome to the store, " + costumer + "!");
    }

    //método3
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println(price);
    }
    
    //método4
    public double getPriceWithTax() {
        double totalPrice = price + (price * 0.08);
        return totalPrice;
    }

    //método main
    public static void main(String[] args) {

        Store loja1 = new Store("limonada", 10);
        loja1.advertise();
        loja1.greetCostumer("João");
        loja1.increasePrice(1.5);

        double lemonadePrice = loja1.getPriceWithTax();
        System.out.println(lemonadePrice);
    }
}