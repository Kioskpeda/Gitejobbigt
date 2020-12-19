package se.lexikon.data_access;

import se.lexikon.Course;

import java.time.LocalDate;
import java.util.List;

public class CourseDaoList implements CourseDao {

    private static List <Course> courses;

    @Override
    public Course saveCourse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Course findById(int id) {
        for (Course cur: courses) {
            if(cur.getId()==id){
                return cur;
            }
        }
    return null;
    }

    @Override
    public List<Course> findByName(String name) {
        for (Course nam: courses) {
            if(nam.getCourseName()==name){
                return (List<Course>) nam;
            }
        }
        return null;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Course> findAll() {

        return courses;
    }

    @Override
    public boolean removeCourse(Course course) {
        for (Course rem: courses) {
        if(rem.equals(course)){
            courses.remove(course);
            return true;
        }
    }
        return false;
    }

}
