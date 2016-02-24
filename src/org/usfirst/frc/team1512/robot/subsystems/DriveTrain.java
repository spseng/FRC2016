package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.RobotMap;
import org.usfirst.frc.team1512.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	double deadzone = 0.2;
	double expoIncre = 1;
	double upperLimit = 0.1;
	public Talon leftTalons, rightTalons;
	RobotDrive drive;
	OI oi = new OI();
	boolean flag;
	Timer time;

	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public DriveTrain(){
		leftTalons = new Talon(0);
		rightTalons = new Talon(1);
	}
		
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcade(double left, double right)
    {
    	if (Math.abs(left) <= deadzone)
			{left = 0.0;}
    	if (Math.abs(right) <= deadzone)
			{right = 0.0;}
    	
    	leftTalons.set(left);
    	rightTalons.set(right);
    }
    
    public void tank(double left, double right)
    {
    	if (Math.abs(left) <= deadzone)
    		{left = 0.0;}
    	if (Math.abs(right) <= deadzone)
    		{right = 0.0;}
    	
    	left=left*-1.0; //reverse left motor control
    	leftTalons.set(left);
    	rightTalons.set(right);
   	
    }  
   
    public void driveF(double speed)
    {
    	tank(speed,speed);
    }
    
    public void driveB(double speed)
    {
    	tank(speed,speed);
    }
        
    public void turnR(double speed)
    {
    	tank(speed,-1*speed);
    }
    
    public void turnL(double speed)
    {
    	tank(-1*speed,speed);
    }
    
    public void driveF()
    {
    	tank(1.0,-1.0);
    }
    
    public void driveB()
    {
    	tank(-1.0,1.0);
    }
        
    public void turnR()
    {
    	tank(1.0,1.0);
    }
    
    public void turnL()
    {
    	tank(-1.0,-1.0);
    }

    public void stop()
    {
    	tank(0.0,0.0);
    }
}

