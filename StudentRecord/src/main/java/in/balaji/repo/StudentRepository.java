package in.balaji.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.balaji.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
