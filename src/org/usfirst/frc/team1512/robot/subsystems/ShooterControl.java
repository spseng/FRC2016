package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */

public class ShooterControl extends Subsystem {

	OI oi = new OI();
	Jaguar shooterSC, collectorSC;  //Speed Controls for shooter and selector
	double shooterspeed = 0.0; //variable to hold current speed of shooter
	double collectorspeed = 0.0; //variable to hold current speed of collector
	
	
	ShooterControl Shooter;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public ShooterControl()
	{
		shooterSC = new Jaguar(2);
		collectorSC = new Jaguar(3);
	}
	
	public double getshooterspeed()
	{
		return shooterspeed;
	}
	
	public void startshooter ()
	{
		shooterSC.set(0.5);
		shooterspeed=0.5;
	}
	

	public void speedupshooter()
	{
		shooterspeed = shooterspeed + 0.1;
		shooterSC.set(shooterspeed);
	}
	
	public void speeddownshooter()
	{
		shooterspeed = shooterspeed - 0.1;
		shooterSC.set(shooterspeed);
	}
	
	public void stopshooter()
	{
		shooterspeed = 0.0;
		shooterSC.set(shooterspeed);
	}
	
	public double getcollectorspeed()
	{
		return collectorspeed;
	}
	
	public void startcollector()
	{
		collectorspeed = 0.5;
		collectorSC.set(collectorspeed);
	}
	
	public void speedupcollector()
	{
		collectorspeed = collectorspeed + 0.1;
		collectorSC.set(collectorspeed);
	}
	
	public void speeddowncollector()
	{
		collectorspeed = collectorspeed - 0.1;
		collectorSC.set(collectorspeed);
	}
	
	public void stopcollector()
	{
		collectorspeed = 0.0;
		collectorSC.set(collectorspeed);
	}
	
	public void setcollector(double x)
	{
		collectorspeed = x;
		collectorSC.set(collectorspeed);
	}
	
	public void shoottop()
	{
		collectorspeed = 1.0;
		collectorSC.set(collectorspeed);
		Timer.delay(3);
		collectorspeed = 0.0;
		collectorSC.set(collectorspeed);
	}
	
	public void shootbot()
	{
		collectorspeed = -1.0;
		collectorSC.set(collectorspeed);
		Timer.delay(3);
		collectorspeed = 0.0;
		collectorSC.set(collectorspeed);
	}
	
}
