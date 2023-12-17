package MODUL3.TPMODUL3_WAHYU;

import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourse;

    public Student(String name, int id) {
        super(name, id);
        enrolledCourse = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourse.add(course);
    }

    @Override
    public String getUserDetails() {
        return "Student - Name: " + name + ", ID: " + id + ", Enrolled Courses: " + String.join(", ", enrolledCourse);
    }
}
