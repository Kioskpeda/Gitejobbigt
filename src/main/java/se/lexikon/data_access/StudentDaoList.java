package se.lexikon.data_access;

import se.lexikon.Course;
import se.lexikon.Student;

import java.util.List;

public class StudentDaoList implements StudentDao {

    private static List<Student> students;




    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmail(String email) {
        for (Student mail: students) {
            if(mail.getEmail()==email){
                return mail;
            }
        }
        return null;
    }


    @Override
    public List<Student> findByName(String name) {
        for (Student namn: students) {
            if(namn.getName()==name){
                return (List<Student>) namn;
            }
        }
        return null;
    }

    @Override
    public Student findById(int id) {
        for (Student studId: students) {
            if(studId.getId()==id){
                return studId;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {

        return students;
    }

    @Override
    public boolean deleteStudent(Student student) {
        for (Student rem: students) {
            if(rem.equals(students)){
                students.remove(students);
                return true;
            }
        }
        return false;
    }
}
