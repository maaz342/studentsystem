package first.app.studentsystem.service;

import first.app.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List <Student> getallstudent();
}
