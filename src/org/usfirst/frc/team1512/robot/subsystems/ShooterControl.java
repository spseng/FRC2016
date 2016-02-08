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

public class ShooterControl extends Subsystem {

	OI oi = new OI();
	public Talon shooter, collector;
	
	
	ShooterControl Shooter;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public ShooterControl()
	{
		shooter = new Talon(5);
		collector = new Talon(6);
	}
	
	public double getshooterspeed()
	{
		return shooter;
	}
	
	public void startshooter ()
	{
		shooter.set(0.5);
	}
	
	public void speedupshooter()
	{
		shooter.set(shooter+0.1);
	}
	
	public void speeddownshooter()
	{
		shooter.set(shooter-0.1);
	}
	
	public void stopshooter()
	{
		shooter.set(0);
	}
	
	public double getcollectorspeed()
	{
		return collector;
	}
	
	public void startcollector()
	{
		collector.set(0.5);
	}
	
	public void speedupcollector()
	{
		collector.set(collector+0.1);
	}
	
	public void speeddowncollector()
	{
		collector.set(collector-0.1);
	}
	
	public void stopcollector()
	{
		collector.set(0);
	}
	
	public void setcollector(double x)
	{
		collector.set(x);
	}
	
	public void shoottop()
	{
		collector.set(1);
		Timer.delay(3);
		collector.set(0);
	}
	
	public void shootbot()
	{
		collector.set(-1);
		Timer.delay(3);
		collector.set(0);
	}
	
}
