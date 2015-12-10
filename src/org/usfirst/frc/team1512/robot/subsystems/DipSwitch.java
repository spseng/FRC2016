package org.usfirst.frc.team1512.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DipSwitch extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	DigitalInput auto1;
	DigitalInput auto2;
	DigitalInput auto3;
	DigitalInput auto4;

	boolean switch1;
	boolean switch2;
	boolean switch3;
	boolean switch4;
	
	public DipSwitch()
	{
		super();
		auto1 = new DigitalInput(6);
		auto2 = new DigitalInput(7);
		auto3 = new DigitalInput(8);
		auto4 = new DigitalInput(9);
		
		switch1 = auto1.get();
		switch2 = auto2.get();
		switch3 = auto3.get();
		switch4 = auto4.get();
	}
	
	public boolean auto1()
	{
		return switch1;
	}
	
	public boolean auto2()
	{
		return switch2;
	}
	
	public boolean auto3()
	{
		return switch3;
	}
	
	public boolean auto4()
	{
		return switch4;
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

