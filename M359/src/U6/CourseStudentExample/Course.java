package U6.CourseStudentExample;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    public Course(String subject, int period) {
        teacherName = "";
        this.subject = subject;
        this.period = period;
        currentGrade = "";
    }

    @Override
    public String toString() {
        String a = "";
        if(currentGrade == ""){
            currentGrade ="-";
        }
        return "Per: " + period + " " + currentGrade + "\t" + subject + "\t" + teacherName;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
