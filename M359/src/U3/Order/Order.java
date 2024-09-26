package U3.Order;
// Jerry Zhang, Denna, 8th
public class Order {
    private String customerName;
    private String currentOrder;
    private boolean hasDiscount;
    private double discount;
    private double taxRate;
    public double totalPrice;
    public double burgerCost = 10.99;
    public double pizzaCost = 12.99;
    public double pastaCost = 8.99;
    public double saladCost = 6.99;
    public String output;

    public Order(String name, double tax, double discountNum){
        customerName = name;
        currentOrder = "";
        hasDiscount = true;
        discount = discountNum;
        taxRate = tax;

    }

    public Order(String name, double tax){
        customerName = name;
        currentOrder = "";
        hasDiscount = false;
        discount = 0;
        taxRate = tax;
    }

    public void addItem(String food, int quantity){
        String foodName = food.toLowerCase();
        if(quantity > 0){
            if(foodName.equals("burger")){
                totalPrice += quantity * burgerCost;
                currentOrder += "Ordered " + quantity + " Burgers(s)\n";
            }
            else if(foodName.equals("pizza")){
                totalPrice += quantity * pizzaCost;
                currentOrder += "Ordered " + quantity + " Pizza(s)\n";
            }
            else if(foodName.equals("pasta")){
                totalPrice += quantity * pastaCost;
                currentOrder += "Ordered " + quantity + " Pasta(s)\n";
            }
            else if(foodName.equals("salad")){
                totalPrice += quantity * saladCost;
                currentOrder += "Ordered " + quantity + " Salad(s)\n";
            }
            else{
                currentOrder += "Sorry, " + foodName + " is not on the menu.\n";
            }
        }
        else{
            currentOrder += "Sorry, " + foodName + " quantity must be greater than 0.\n";
        }
    }

    public String toString(){
        double taxPercentage = this.taxRate * 100;
        double taxTotal;
        double subtotal = this.totalPrice;
        double discountPercentage = this.discount * 100;
        double amountSaved = this.discount * this.totalPrice;
        String output = "\n\n" + "------" + " Order for: " + this.customerName + " ------" + "\n\n";
        output += currentOrder;
        output += "\nSubtotal:\t\t$" + subtotal;
        if(this.hasDiscount){
            output += "\n\tDiscount:\t\t" + discountPercentage + "%\n";
            output += "\tYou saved:\t\t" + amountSaved;
            this.totalPrice = subtotal - amountSaved;
        }
        taxTotal = this.taxRate * this.totalPrice;
        this.totalPrice += taxTotal;
        output += "\n\nTax   (" + taxPercentage + "%):\t$" + taxTotal;
        output += "\nTotal:\t\t\t$" + this.totalPrice + "\n";
        output += "-----------------------------";
        return output;
    }

}
