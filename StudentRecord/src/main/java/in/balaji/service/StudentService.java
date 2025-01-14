package in.balaji.service;

import java.util.List;

import in.balaji.entity.Student;

public interface StudentService {
	public boolean saveStudent(Student s);
	public List<Student> getAllStudents();
}
