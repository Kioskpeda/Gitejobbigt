package se.lexikon;

import se.lexikon.data_access.CourseDaoList;
import se.lexikon.data_access.StudentDaoList;

public class Progbro {
    CourseDaoList torsten = new CourseDaoList();

    public void createCourse(){
        Course kek = new Course();
       kek.setId();
       kek.setStartDate();
       kek.setWeekDuration();
        torsten.saveCourse(kek);
    }
    StudentDaoList flink = new StudentDaoList();

    public void createStudent(){
        Student kek = new Student();
        kek.setId();
        kek.setEmail();
        kek.setAddress();
        kek.setName();
        flink.saveStudent(kek);
    }

    public void register(){

    }

}
