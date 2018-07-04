package models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int enrolementNumber;
    private Course course;

    public Student(){}

    public Student(String firstName, String lastName, int age, int enrolementNumber, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.enrolementNumber = enrolementNumber;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "EnrolementNumber")
    public int getEnrolementNumber() {
        return enrolementNumber;
    }

    public void setEnrolementNumber(int enrolementNumber) {
        this.enrolementNumber = enrolementNumber;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
