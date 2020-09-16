package ua.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.training.spring.bean.robot.ModelT1000;

public class Start {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ModelT1000 t1 = (ModelT1000) context.getBean("model2");
		ModelT1000 t2 = (ModelT1000) context.getBean("model1");
		ModelT1000 t3 = (ModelT1000) context.getBean("model2");

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
