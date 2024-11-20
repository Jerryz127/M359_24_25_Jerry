package U6.Examples;

    import java.util.Scanner;

    public class LetterToSanta {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = kb.nextLine();
            System.out.println("How many items on your list?");
            int size = kb.nextInt();
            kb.nextLine();

            /*
            create a String array called myList and make it
            big enough for size elements
            sout ask for first element, read it in, save it in index 0
             */
            String[] myList = new String[size];
            boolean keepGoing = true;
            int i = 0;
            while (keepGoing){
                System.out.println("what do you want?");
                String item = kb.nextLine();
                if(item.equals("QUIT") || i == myList.length){
                    keepGoing = false;
                }
                else{
                    myList[i] = item;
                    i++;
                }
            }
            System.out.println("I'll tell Santa!");
            printList(name, myList);
        }
        public static void printList(String n, String[] arr){
            System.out.println(n + "'s Wish List");
            for (int i = 0; i < arr.length; i++){
                if(arr[i] != null){
                    System.out.println((i + 1) + ". " + arr[i]);
                }
            }
        }
    }
