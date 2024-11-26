package U6.CourseStudentExample;

import java.util.Scanner;
import java.io.*;


public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
//        Course course1 = new Course("Matarazzo", "Sophmore Wellness", "A+", 1);
//        Course course2 = new Course("Marsh", "English 2/H\t\t", "B", 2);
//        Course course3 = new Course("Piggott", "Trig/Calc A\t\t", "A", 3);
//        Course course4 = new Course("Corcoran", "APUSH\t\t\t", "B", 4);
//        Course course5 = new Course("Lunch", 5);
//        Course course6 = new Course("Meuret", "Chinese 3\t\t", "A", 6);
//        Course course7 = new Course("Carlson", "Chemistry/H\t\t", "B", 7);
//        Course course8 = new Course("Denna", "AP CSA\t\t\t", "A", 8);
//        Course[] a = {course1, course2, course3, course4, course5, course6, course7, course8};
//        Student me = new Student("Jerry", a);
//        System.out.println(me);

        Scanner scan = new Scanner(System.in);		// keyboard input
        Scanner inF = new Scanner(new File("oneCourse.txt"));
        String teacherName = inF.nextLine();
        String className = inF.nextLine();
        String grade = inF.nextLine();
        int per = inF.nextInt();
        Course oneCourse = new Course(teacherName, className, grade, per);
            System.out.println(oneCourse);
        inF.close();				// closes Scanner object when done

        //Create var called inStudent for oneSchedule.txt
        Scanner inStudent = new Scanner(new File("oneSchedule.txt"));
        String name = inStudent.nextLine();
        //create a Course array to fill with all the course data
        Course[] schedule = new Course[8];
        for(int i = 0; i < schedule.length;i++){
            // read data for ONE course
            String t = inStudent.nextLine();
            String c = inStudent.nextLine();
            String g = inStudent.nextLine();
            int p = inStudent.nextInt();
            // dummy read to clear the EOL char after the int
            // this prevents the no such elements
            // try to dummy read when there is nothing left
            if(inStudent.hasNextLine())
            inStudent.nextLine();
            //Create a Course with this data
            Course oneC = new Course(t,c,g,p);
            schedule[i] = oneC;
        }
        Student s = new Student(name, schedule);
        System.out.println(s);
    }
}
