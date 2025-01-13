package U7.Examples;

import java.util.ArrayList;

public class Notes_7_1_7_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums;
        ArrayList<String> names = new ArrayList<>();
        //nums.add(17);
        names.add("Jerry");
        names.add("Lorelai");
        names.add("Angela");
        names.add("Eddie");
        names.add("Kinlen");
        // there is a default toString for AL
        System.out.println(names);
        String replaced = names.set(0, "Eric");
        System.out.println(names);
        names.set(3,"Edward");
        System.out.println(names);
        names.add(2, "Mary");
        System.out.println(names);

        ArrayList ages = new ArrayList();
        ages.add(15);
        ages.add("Seventeen");
        System.out.println(ages);
        int age = (int) ages.get(0);
    }
}
