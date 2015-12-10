package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TowerControl extends Subsystem {

	Relay winchSpike;
	Relay spike2;
	DigitalInput topLS;
	DigitalInput topLS2;
	DigitalInput bottomLS;
	OI oi = new OI();
	
	TowerControl Tower;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public TowerControl()
	{
		super();
		winchSpike = new Relay(RobotMap.winchRelay);
		topLS = new DigitalInput(0);
		bottomLS = new DigitalInput(1);
		topLS2 = new DigitalInput(2);
	}
	
	public void LiftTower()
	{			
		winchSpike.set(Value.kForward);
	}
	
	public void DropTower()
	{
		winchSpike.set(Value.kReverse);
	}
	
	public void ResetTower()
	{
		winchSpike.set(Value.kOff);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public boolean getTLS()
    {
    	return topLS.get();
    }
    
    public boolean getTLS2()
    {
    	return topLS2.get();
    }
    
    public boolean getBLS()
    {
    	return bottomLS.get();
    }
}
