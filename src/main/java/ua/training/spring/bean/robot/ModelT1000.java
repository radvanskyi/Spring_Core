package ua.training.spring.bean.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ua.training.spring.interfaces.Hand;
import ua.training.spring.interfaces.Head;
import ua.training.spring.interfaces.Leg;

@Configuration
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

	private String color;
	private int year;
	private boolean soundEnabled;

	public ModelT1000() {
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ModelT1000 model1() {
		return new ModelT1000();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ModelT1000 model2() {
		return new ModelT1000();
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(String color, int year, boolean soundEnabled) {
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void action() {
		getHead().calc();
		getHand().catchSomething();
		getLeg().go();
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("can play sound: " + soundEnabled);
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

}
