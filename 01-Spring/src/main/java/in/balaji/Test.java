package in.balaji;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//starting IOC by giving xml file as input
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Spring-beans.xml");
		Car c=ctxt.getBean(Car.class);
		
		c.drive();
		
	}

}
