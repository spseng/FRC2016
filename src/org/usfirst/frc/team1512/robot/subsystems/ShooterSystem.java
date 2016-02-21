package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.commands.ShooterAction;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterSystem extends Subsystem {
    
	public Jaguar shooterJag;
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

