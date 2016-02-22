package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.commands.ShooterAction;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterSystem extends Subsystem {
    
	public Jaguar shooter;
	public Relay collector;
	OI oi = new OI();
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public ShooterSystem(){
		shooter = new Jaguar(2);
		collector = new Relay(0);
	}
		
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shoot(double speed)
    {
    	shooter.set(speed);
    }
    
    public void collectorOn()
    {
    	collector.set(Value.kForward);
    }
    
    public void collectorOff()
    {
    	collector.set(Value.kOff);
    }
}

