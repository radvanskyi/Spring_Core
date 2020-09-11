package ua.training.spring.bean.pool;

import java.util.Collection;

import ua.training.spring.interfaces.Robot;
import ua.training.spring.interfaces.RobotPool;

public class T1000Pool implements RobotPool {

	private Collection<Robot> robotCollection;

	@Override
	public Collection<Robot> getRobotCollection() {
		return robotCollection;
	}

	public void setRobotCollection(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}

	public void action() {
		for (Robot robot : robotCollection) {
			robot.action();
		}
	}

}
