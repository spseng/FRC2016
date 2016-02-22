package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.RobotMap;

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
	DoubleSolenoid flipperSolenoid;
	
	FlipperControl Flipper;
	
	public FlipperControl()
	{
		super();
		main = new Compressor();
		flipperSolenoid = new DoubleSolenoid(2, 3);
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
		flipperSolenoid.set(Value.kForward);
	}
	
	public void CloseGripper()
	{
		flipperSolenoid.set(Value.kReverse);
	}
	
	public void ResetGripper()
	{
		flipperSolenoid.set(Value.kOff);
	}


	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	

}

