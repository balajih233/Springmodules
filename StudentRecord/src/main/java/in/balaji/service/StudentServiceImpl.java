package in.balaji.service;

import java.util.List;

import org.springframework.stereotype.Service;


import in.balaji.entity.Student;
import in.balaji.repo.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	public StudentRepository srepo;
	public StudentServiceImpl(StudentRepository srepo) {
		this.srepo=srepo;
	}
	@Override
	public boolean saveStudent(Student s) {
		Student savedStudent=srepo.save(s);
		
		return savedStudent.getSid()!=null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}

}
