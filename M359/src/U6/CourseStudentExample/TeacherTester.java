package U6.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TeacherTester {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Open and read the file studentScheduleData.txt
        read number of students for the size of array
        create Student array of this size
        loop through
            read all data for a Student
            create a Student
            Add student to the student[]
        */

        Scanner asd = new Scanner(new File("studentScheduleData.txt"));
        int amtStudents = asd.nextInt();
        asd.nextLine();
        Student[] a = new Student[amtStudents];
        int index = 0;
        while(asd.hasNextLine()){
            String name = asd.nextLine();
            Course[] schedule = new Course[8];
            // this is where we copy over code from before
            // read in everything for one student
            // create the student
            // add student to Student[]
            // read data for ONE course
            for(int i = 0; i < schedule.length;i++){
                // read data for ONE course
                String t = asd.nextLine();
                String c = asd.nextLine();
                String g = asd.nextLine();
                int p = asd.nextInt();
                if(asd.hasNextLine())
                    asd.nextLine();
                Course oneC = new Course(t,c,g,p);
                schedule[i] = oneC;
            }
            Student s = new Student(name,schedule);
            a[index] = s;
            index++;
        }
        for(Student s: a){
            if(s != null)
                System.out.println(s);
        }
        System.out.println(a);
    }
}
