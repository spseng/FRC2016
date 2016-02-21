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
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */

public class ShooterControl extends Subsystem {

	
	double shooterspeed = 0.0; //variable to hold current speed of shooter
	double collectorspeed = 0.0; //variable to hold current speed of collector
	Talon shooterSC, winchSC;
	Relay collectorSpikeRelay;  //Speed Controls for shooter and selector
	Servo flipperL, flipperR;
	
	ShooterControl Shooter;
	OI oi = new OI();
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public ShooterControl()
	{
		shooterSC = new Talon(2);
		winchSC = new Talon(3);

		
		/*
		collectorSpikeRelay = new Relay(0);
		flipperL= new Servo(8);
		flipperR= new Servo(9);
		*/
	}
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	
	public double getshooterspeed()
	{
		return shooterspeed;
	}
	
	public void runwinch(double winchspeed)
	{
		winchSC.set(winchspeed);
	}

	public void startshooter()
	{
		shooterSC.set(-0.4);
		shooterspeed=-0.4;
		flipperR.set(0.0);
		flipperL.set(1.0);
	}
	

	public void speedupshooter()
	{
		shooterspeed = shooterspeed - 0.025;
		shooterSC.set(shooterspeed);
	}
	
	public void speeddownshooter()
	{
		shooterspeed = shooterspeed + 0.025;
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
//		collectorspeed = 0.5;
//		collectorSC.set(collectorspeed);
	}
	
	
	public void collectorforward()
	{
		collectorspeed = 1.0;
		collectorSpikeRelay.set(Value.kForward);
	}
	
	public void collectorbackward()
	{
		collectorspeed = -1.0;
		collectorSpikeRelay.set(Value.kReverse);
	}
	
	public void stopcollector()
	{
		collectorspeed = 0.0;
		collectorSpikeRelay.set(Value.kOff);
	}
	
	public void setcollector(double x)
	{
		collectorspeed = x;
		if (collectorspeed >-0.1 && collectorspeed < 0.1)
		{
			collectorSpikeRelay.set(Value.kOff);			
		}
		else if (collectorspeed >= 0.1)
		{
			collectorSpikeRelay.set(Value.kForward);
			
		}
		else if (collectorspeed <= -0.1)
		{
			collectorSpikeRelay.set(Value.kReverse);
			
		}
		else
		{
			collectorSpikeRelay.set(Value.kOff);
		}
		

	}
	
	public void shoottop()
	{

		collectorforward();
		flipperR.set(1.0);
		flipperL.set(0.0);
		Timer.delay(2.0);

		stopcollector();
		flipperR.set(0.0);
		flipperL.set(1.0);
	}
	
	public void shootbot()
	{
		collectorbackward();
		Timer.delay(2.0);
		stopcollector();
	}
	
	
	
}
