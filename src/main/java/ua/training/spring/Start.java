package ua.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.training.spring.interfaces.Robot;
import ua.training.spring.interfaces.RobotConveyer;

public class Start {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		context.getBean("t1000");

		RobotConveyer t1000Conveyer = (RobotConveyer) context.getBean("t1000Conveyer");

		Robot t1 = t1000Conveyer.createRobot();
		Robot t2 = t1000Conveyer.createRobot();
		Robot t3 = t1000Conveyer.createRobot();

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
