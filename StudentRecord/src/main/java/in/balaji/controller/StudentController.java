package in.balaji.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.balaji.entity.Student;
import in.balaji.service.StudentService;

@Controller
public class StudentController {
	private StudentService ser;
	public StudentController(StudentService ser) {
		this.ser=ser;
	}
	
	
	//method for empty form
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	//method for submit form
	@GetMapping("/savedStudent")
	public ModelAndView savedForm(Student s) {
		ModelAndView mav=new ModelAndView();
		boolean isSave=ser.saveStudent(s);
		if(isSave) {
			mav.addObject("smsg", "Succesfully Inserted");
		}else {
			mav.addObject("fmsg", "Failed to Insert");
		}
		mav.setViewName("index");
		return mav;
	}
	
	//method to all students 
	@GetMapping("/data")
	public ModelAndView getAllStudents() {
		List<Student> stuList=ser.getAllStudents();
		ModelAndView mav=new ModelAndView();
		mav.addObject("students", stuList);
		mav.setViewName("data");
		return mav;
	}
}
