package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.RobotMap;
import org.usfirst.frc.team1512.robot.commands.ShooterAction;

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
public class ShooterSystem extends Subsystem {
    
	public Jaguar shooterJag;
	RobotDrive drive;
	OI oi = new OI();
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public ShooterSystem(){
		shooterJag = new Jaguar(2);
	}
		
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shoot(double speed)
    {
    	shooterJag.set(speed);
    }
}

