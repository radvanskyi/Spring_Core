package ua.training.spring.bean.toshiba;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import ua.training.spring.interfaces.Head;

@Component
@Lazy
public class ToshibaHead implements Head {

	public void calc() {
		System.out.println("Thinking about Toshiba...");
	}

}
