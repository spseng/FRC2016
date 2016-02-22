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
public class ScissorSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Compressor main;
	DoubleSolenoid contract;
	DoubleSolenoid gripper1;
	DoubleSolenoid gripper2;
	
	ScissorSubsystem cut;
	
	public ScissorSubsystem()
	{
		super();
		main = new Compressor();
//		contract = new DoubleSolenoid(0, 1);
		scissor1 = new DoubleSolenoid(0, 1);
	}

	public void Compress()
	{
		main.start();
	}
	
	public void endC()
	{
		main.stop();
	}

	public void RaiseScissor())
	{
		scissor1.set(Value.kForward);
	}
	
	public void LowerScissor()
	{
		scissor1.set(Value.kReverse);
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	

}

