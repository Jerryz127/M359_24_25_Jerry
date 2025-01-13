package U7.Examples;

import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int choice = getUserChoice(kb);
        System.out.println("Method returned " + choice);
    }
    public static int getUserChoice(Scanner kb){
        System.out.println("Enter an int between 1-5");
        boolean keepGoing = true;
        int num = 0;
        while (keepGoing) {
            try {
                num = kb.nextInt();
                // this next line will only execute IF nextInt() worked
                if (num >= 1 && num <= 5) {
                    System.out.println("You enetered " + num);
                    keepGoing = false;
                } else {
                    System.out.println("Please enter a value between 1-5");
                }
            } catch (Exception e) {
                //if the nextInt fails then the code jumps here
                System.out.println("Please enter an INTEGER");
                // clear out the bad data
                kb.nextLine();
            }
        }
        return num;
    }
}
