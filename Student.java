package Question2;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }
    //addCourse method
    public void addCourse(String course) {
        courses.add(course);
    }
    //removeCourse method
    public void removeCourse(String course) {
        courses.remove(course);
    }

    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student("Shellah Nsubuga", 11);

        // Add some courses
        student.addCourse("GEOLOGY");
        student.addCourse("SCIENCE");
        student.addCourse("MATHS");

        // Print the student's information and courses
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());

        // Remove a course
        student.removeCourse("SCIENCE");

        // Print the updated course list
        System.out.println("Updated Courses: " + student.getCourses());
    }
}
