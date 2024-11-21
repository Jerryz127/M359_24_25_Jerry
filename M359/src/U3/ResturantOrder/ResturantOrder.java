//package U3.ResturantOrder;
//// Jerry Zhang, Denna, 8th
//public class ResturantOrder {
//    private String customerName;
//    private String currentOrder;
//    private boolean hasDiscount;
//    private double discount;
//    private double taxRate;
//    public double totalPrice;
//    public double burgerCost = 10.99;
//    public double pizzaCost = 12.99;
//    public double pastaCost = 8.99;
//    public double saladCost = 6.99;
//
//    public ResturantOrder(String name, double discountNum, double tax){
//        customerName = name;
//        currentOrder = "";
//        hasDiscount = true;
//        discount = discountNum;
//        taxRate = tax;
//
//    }
//
//    public ResturantOrder(String name, double tax){
//        customerName = name;
//        currentOrder = "";
//        hasDiscount = false;
//        discount = 0;
//        taxRate = tax;
//    }
//
//    public void addItem(String food, int quantity){
//        String foodName = food.toLowerCase();
//        if(quantity > 0){
//            if(foodName.equals("burger")){
//                totalPrice += quantity * burgerCost;
//                currentOrder += "Ordered " + quantity + " Burgers(s)\n";
//            }
//            else if(foodName.equals("pizza")){
//                totalPrice += quantity * pizzaCost;
//                currentOrder += "Ordered " + quantity + " Pizza(s)\n";
//            }
//            else if(foodName.equals("pasta")){
//                totalPrice += quantity * pastaCost;
//                currentOrder = "Ordered " + quantity + " Pasta(s)\n";
//            }
//            else if(foodName.equals("salad")){
//                totalPrice += quantity * saladCost;
//                currentOrder += "Ordered " + quantity + " Salad(s)\n";
//            }
//            else{
//                currentOrder += "Sorry, " + foodName + " is not on the menu.\n";
//            }
//        }
//        else{
//            currentOrder += "Sorry, " + foodName + " quantity must be greater than 0.\n";
//        }
//    }
//
//    public String toString(){
//        double taxPercentage = taxRate * 100;
//        double taxTotal = taxPercentage * totalPrice;
//        String output = currentOrder;
//        output += "\n Subtotal:\t\t$" + totalPrice;
//        output += "\n Tax   (" + taxPercentage + "):\t" + taxTotal + "%";
//        output += "";
//        return output;
//    }
//
//}
