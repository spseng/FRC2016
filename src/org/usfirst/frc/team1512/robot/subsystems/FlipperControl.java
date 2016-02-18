package org.usfirst.frc.team1512.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FlipperControl extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Compressor main;
	DoubleSolenoid flipper;
	
	FlipperControl flipper;
	
	public FlipperControl()
	{
		super();
		main = new Compressor();
		flipper = new DoubleSolenoid(2, 3);
	}

	public void Compress()
	{
		main.start();
	}
	
	public void endC()
	{
		main.stop();
	}

	public void OpenGripper()
	{
		flipper.set(Value.kForward);
	}
	
	public void CloseGripper()
	{
		flipper.set(Value.kReverse);
	}
	
	public void ResetGripper()
	{
		flipper.set(Value.kOff);
	}


	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	

}

