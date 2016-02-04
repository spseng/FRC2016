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
	
	double shooterspeed;
	
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
		return shooterspeed);
	}
	
	public void startshooter ()
	{
		shooter.set(.5);
		shooterspeed=0.5;
	}
	
	public void speedupshooter()
	{
		shooter.set(getshooterspeed()+0.1);
		
		shooterspeed=shooterspeed+0.1;
	}
	
	public void speeddownshooter()
	{
		shooter.set(getshooterspeed()-0.1);
	}
	
	public void stopshooter()
	{
		shooter.set(0);
	}
	
	public double getcollectorspeed()
	{
		return collector.get();
	}
	
	public void startcollector()
	{
		collector.set(.5);
	}
	
	public void speedupcollector()
	{
		collector.set(getcollectorspeed()+0.1);
	}
	
	public void speeddowncollector()
	{
		collector.set(getcollectorspeed()-0.1);
	}
	
	public void stopcollector()
	{
		collector.set(0);
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
