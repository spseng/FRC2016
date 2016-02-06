package org.usfirst.frc.team1512.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
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

	
	public DipSwitch()
	{
		super();
		auto1 = new DigitalInput(6);
		auto2 = new DigitalInput(7);
		auto3 = new DigitalInput(8);
		auto4 = new DigitalInput(9);
		
	}
	
	SmartDashboard.putNumber("Dipswitch activated #1", 1);
	
	public boolean getswitch(int switchnumber)
	{
		switch (switchnumber)
		{	
			case 1: return auto1.get();
			case 2: return auto2.get();
			case 3: return auto3.get();
			case 4: return auto4.get();
		}
	}

	public void displayswitches()
	{
		SmartDashboard.putNumber("Dipswitch 1 set to: ", auto1.get());
		SmartDashboard.putNumber("Dipswitch 2 set to: ", auto2.get());
		SmartDashboard.putNumber("Dipswitch 3 set to: ", auto3.get());
		SmartDashboard.putNumber("Dipswitch 4 set to: ", auto4.get());
	}

	public boolean auto1()
	{
		return auto1.get();
	}
	
	public boolean auto2()
	{
		return auto2.get();
	}
	
	public boolean auto3()
	{
		return auto3.get();
	}
	
	public boolean auto4()
	{
		return auto4.get();
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

