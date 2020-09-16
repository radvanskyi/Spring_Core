package ua.training.spring.bean.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import ua.training.spring.interfaces.Leg;

@Component
@Lazy
public class ToshibaLeg implements Leg {

	public void go() {
		System.out.println("Go to Toshiba!");
	}

}
