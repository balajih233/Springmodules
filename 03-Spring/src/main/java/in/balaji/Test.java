package in.balaji;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("File.xml");
		
		Car ca=ctxt.getBean(Car.class);
	}

}
