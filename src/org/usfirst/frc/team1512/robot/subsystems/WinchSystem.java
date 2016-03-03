package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.commands.WinchAction;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class WinchSystem extends Subsystem {
    
	public Jaguar winchJag;
	OI oi = new OI();
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public WinchSystem(){
		winchJag = new Jaguar(3);
	}
		
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void run()
    {
    	winchJag.set(-1.0);
    }
    
    public void stop()
    {
    	winchJag.set(0.0);
    }
}

