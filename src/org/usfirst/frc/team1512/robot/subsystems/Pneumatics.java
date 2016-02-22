package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.commands.PneumaticsAction;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Pneumatics extends Subsystem {
    
	Compressor main;
	DoubleSolenoid sissorlift;
	DoubleSolenoid hopper;
	OI oi = new OI();

	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Pneumatics(){
		main = new Compressor();
		sissorlift = new DoubleSolenoid(2, 3);
		hopper = new DoubleSolenoid(0, 1);
	}
	
	public void startCompressor()
	{
		main.start();
	}
	
	public void stopCompressor()
	{
		main.stop();
	}
	
	public void hopperDown()
	{
		hopper.set(Value.kForward);
	}
	
	public void hopperUp()
	{
		hopper.set(Value.kReverse);
	}
	
	public void sissorDown()
	{
		sissorlift.set(Value.kForward);
	}
	
	public void sissorUp()
	{
		sissorlift.set(Value.kReverse);
	}
		
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
}

