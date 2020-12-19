package se.lexikon.data_access;

import se.lexikon.Course;
import se.lexikon.Student;

import java.time.LocalDate;
import java.util.List;

public interface CourseDao {

    Course saveCourse(Course course);
    Course findById(int id);
    List<Course> findByName(String name);
    List<Course> findByDate(LocalDate date);
    List<Course> findAll();
    boolean removeCourse(Course course);

}
