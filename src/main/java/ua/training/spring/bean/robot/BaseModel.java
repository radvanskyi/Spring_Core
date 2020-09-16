package ua.training.spring.bean.robot;

import org.springframework.beans.factory.annotation.Autowired;

import ua.training.spring.interfaces.Hand;
import ua.training.spring.interfaces.Head;
import ua.training.spring.interfaces.Leg;
import ua.training.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

	@Autowired
	private Hand hand;

	@Autowired
	private Leg leg;

	@Autowired
	private Head head;

	public BaseModel() {
		System.out.println(this + " - BaseModel constructor");
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

}
