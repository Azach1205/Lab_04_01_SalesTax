public class Main {
    public static void main(String[] args) {
        //Declarations
        double salesTax = 0.05; //sales tax
        double computedSalesTax = 0;
        int itemPrice = 70; //input for now
        double totalPrice = 0; //Price including sales tax
        computedSalesTax = (int) (salesTax * itemPrice); //finding sales tax
        totalPrice = (int) (itemPrice + computedSalesTax); //putting total price together
        System.out.println("The item price of " + itemPrice + " plus the computed sales tax of " + computedSalesTax + " comes to a total of " +totalPrice);
    }
}