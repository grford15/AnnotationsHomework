import db.DBCourse;
import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Level;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course engCourse = new Course("Engineering", Level.BENG);
        DBHelper.save(engCourse);

        Student greg = new Student("Greg", "Rutherford", 28, 0101, engCourse);
        DBHelper.save(greg);
        Student adam = new Student("Adam", "Weir", 27, 0202, engCourse);
        DBHelper.save(adam);

        Lesson lesson1 = new Lesson("Welding", 101, 22.01, engCourse);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Cutting", 203, 23.01, engCourse);
        DBHelper.save(lesson2);

        List<Student> engineeringStudents = DBCourse.getStudentsOnCourse(engCourse);

        List<Lesson> engineeringLessons = DBCourse.getLessonsOnCourse(engCourse);

    }
}
