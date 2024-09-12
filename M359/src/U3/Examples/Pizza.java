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
