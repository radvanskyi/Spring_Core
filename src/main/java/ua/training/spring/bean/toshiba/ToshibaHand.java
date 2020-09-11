package ua.training.spring.bean.toshiba;

import ua.training.spring.interfaces.Hand;

public class ToshibaHand implements Hand {

	public void catchSomething() {
		System.out.println("Catched from Toshiba!");
	}

}
