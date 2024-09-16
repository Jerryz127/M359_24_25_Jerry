package U3.Examples;

public class Pizza {
    private String toppings;
    private double diameter;
    private boolean hasCheese;

    public Pizza(double diameter, String toppings, boolean hasCheese) {
        this.diameter = diameter;
        this.toppings = toppings;
        this.hasCheese = hasCheese;
    }

    /*
    The equals method MUST return a boolean and take
    ONE parameter of the same type as the class (Pizza)
    Always called equals
    Ex: public boolean equals(Pizza other)
     */

    public boolean equals(Pizza other){
        if(this.getToppings().equals(other.toppings) && this.diameter == other.diameter && this. hasCheese == other.hasCheese){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    If you print a pizza object WITHOUT having a defined toString
    Method, Java will only print out the address in memory of the
    reference variable(Ex.U3.Examples.Pizza@65ab7765)

    create a method with signature:
        public String toString(){ }

    If a toString is defined in Pizza class, then it will be called
    on your behalf whenever you print a Pizza reference variable
     */

    public String toString(){
        String str = "";
        str = "My " + diameter + "in pizza has " +toppings + " toppings";
        if (!hasCheese){
            str += " and no cheese";
        }
        return str;
    }
//
//    @Override
//    public String toString() {
//        return "Pizza{" +
//                "toppings='" + toppings + '\'' +
//                ", diameter=" + diameter +
//                ", hasCheese=" + hasCheese +
//                '}';
//    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }
}
