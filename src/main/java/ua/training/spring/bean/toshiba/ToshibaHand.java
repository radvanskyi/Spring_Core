package ua.training.spring.bean.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import ua.training.spring.interfaces.Hand;

@Component
@Lazy
public class ToshibaHand implements Hand {

	public void catchSomething() {
		System.out.println("Catched from Toshiba!");
	}

}
