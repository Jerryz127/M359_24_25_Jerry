package U6.CourseStudentExample;

public class StudentTester {
    public static void main(String[] args) {
        Course course1 = new Course("Matarazzo", "Sophmore Wellness", "A+", 1);
        Course course2 = new Course("Marsh", "English 2/H\t\t", "B", 2);
        Course course3 = new Course("Piggott", "Trig/Calc A\t\t", "A", 3);
        Course course4 = new Course("Corcoran", "APUSH\t\t\t", "B", 4);
        Course course5 = new Course("Lunch", 5);
        Course course6 = new Course("Meuret", "Chinese 3\t\t", "A", 6);
        Course course7 = new Course("Carlson", "Chemistry/H\t\t", "B", 7);
        Course course8 = new Course("Denna", "AP CSA\t\t\t", "A", 8);
        Course[] a = {course1, course2, course3, course4, course5, course6, course7, course8};
        Student me = new Student("Jerry", a);
        System.out.println(me);
    }
}
