package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.commands.ShooterAction;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class ShooterSystem extends Subsystem {
    
	public Jaguar shooter, collector;
	OI oi = new OI();
	public Servo servoL, servoR;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public ShooterSystem(){
		shooter = new Jaguar(2);
		collector = new Jaguar(4);
		servoL= new Servo(8);
		servoR= new Servo(9);
	}
		
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shoot(double speed)
    {
    	shooter.set(speed);
    }
    
    public void lifterup()
    {
    	servoL.set(0.0);
    	servoR.set(1.0);
    }

    public void lifterdown()
    {
    	servoL.set(1.0);
    	servoR.set(0.0);
    }
    
    public void fire(boolean firevalue)
    {
    	if (firevalue)
    	{
    		lifterup();
    	//	Timer.delay(0.5);
    	}
    	else
    	{
    		lifterdown();
    		
    	}
    }

    public void collect(double speed)
    {
    	collector.set(speed);
    }
}

