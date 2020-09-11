package ua.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.training.spring.bean.pool.T1000Pool;

public class Start {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		context.getBean("t1000");

//		RobotConveyer t1000Conveyer = (RobotConveyer) context.getBean("t1000Conveyer");
//
//		Robot t1 = t1000Conveyer.createRobot();
//		Robot t2 = t1000Conveyer.createRobot();
//		Robot t3 = t1000Conveyer.createRobot();
//
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);

		T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
		t1000Pool.action();

		((ConfigurableApplicationContext) context).close();
	}

}
