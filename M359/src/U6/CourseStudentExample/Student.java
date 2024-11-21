package U6.CourseStudentExample;

import java.util.Arrays;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public Student(String name) {
        this.name = name;
        myClasses = new Course[8];
    }

    @Override
    public String toString() {
        String a = "Student Name: " + name + "\n";
        for(int i =0; i < 8;i++){
            a += myClasses[i] +"\n";
        }
        return a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}
