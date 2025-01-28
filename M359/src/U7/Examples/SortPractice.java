package U7.Examples;
import java.util.ArrayList;

public class SortPractice {
    public static void main(String[] args) {
        ArrayList<Student> myClass = new ArrayList<>();
        myClass.add(new Student("Sora", 15));
        myClass.add(new Student("Jaime", 14));
        myClass.add(new Student("Jill", 15));
        myClass.add(new Student("Sruthi", 14));
        myClass.add(new Student("Aarush", 15));
        myClass.add(new Student("Dylan", 16));
        myClass.add(new Student("Peter", 16));
        myClass.add(new Student("Aayan", 15));
        myClass.add(new Student("Rithesh", 17));
        myClass.add(new Student("Anirudh", 18));

        System.out.println("Original class list");
        printStudents(myClass);

        sortByAge(myClass);
        System.out.println("\nSorted by Age");
        printStudents(myClass);

        sortByName(myClass);
        System.out.println("\nSorted by Name");
        printStudents(myClass);

        InsertionSortAge(myClass);
        System.out.println("\nSorted by Name");
        printStudents(myClass);

        InsertionSortName(myClass);
        System.out.println("\nSorted by Name");
        printStudents(myClass);
    }

    public static void sortByName(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(minIndex).getName().compareTo(
                        students.get(j).getName()) > 0) {
                    // I need to update the min!
                    minIndex = j;
                }
            }
            // perform the swap AFTER the inner loop
            // 3 lines of code for a swap!
            // swap i with minIndex
            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }

    public static void sortByAge(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(minIndex).getAge() > students.get(j).getAge()) {
                    // I need to update the min!
                    minIndex = j;
                }
            }
            // perform the swap AFTER the inner loop
            // 3 lines of code for a swap!
            // swap i with minIndex
            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void InsertionSortAge(ArrayList<Student> students){
        for (int i = 1; i < students.size(); i++) {
            int temVal = students.get(i).getAge();
            int currPos = i;
            while(currPos > 0 && students.get(currPos - 1).getAge() > temVal){
                //shift the bigger value over
                students.get(currPos).setAge(students.get(currPos - 1).getAge());
                currPos--;
            }
            // insert into correct place
            students.get(currPos).setAge(temVal);
        }
    }

    public static void InsertionSortName(ArrayList<Student> students){
        for (int i = 1; i < students.size(); i++) {
            Student temVal = students.get(i);
            int currPos = i;
            while(currPos > 0 && students.get(currPos - 1).getName().compareTo(temVal.getName())>0){
                //shift the bigger value over
                students.set(currPos, students.get(currPos -1));
                currPos--;
            }
            // insert into correct place
            students.set(currPos, temVal);
        }
    }
}

