package org.usfirst.frc.team1512.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmControl extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Compressor main;
	DoubleSolenoid contract;
	DoubleSolenoid gripper1;
	DoubleSolenoid gripper2;
	
	ArmControl arm;
	
	public ArmControl()
	{
		super();
		main = new Compressor();
//		contract = new DoubleSolenoid(0, 1);
		gripper1 = new DoubleSolenoid(0, 1);
		gripper2 = new DoubleSolenoid(4, 5);
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
		gripper1.set(Value.kForward);
		gripper2.set(Value.kForward);
	}
	
	public void CloseGripper()
	{
		gripper1.set(Value.kReverse);
		gripper2.set(Value.kReverse);
	}
	
	public void ResetGripper()
	{
		gripper1.set(Value.kOff);
		gripper2.set(Value.kOff);
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	

}

