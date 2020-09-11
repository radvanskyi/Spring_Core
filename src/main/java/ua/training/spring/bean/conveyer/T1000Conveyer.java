package ua.training.spring.bean.conveyer;

import ua.training.spring.interfaces.Robot;
import ua.training.spring.interfaces.RobotConveyer;

public abstract class T1000Conveyer implements RobotConveyer {

	@Override
	public abstract Robot createRobot();

}
