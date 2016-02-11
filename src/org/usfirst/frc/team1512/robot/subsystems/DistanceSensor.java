package org.usfirst.frc.team1512.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 */
public class DistanceSensor extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	AnalogInput AnalogPin;
	int bits;
	int raw;
	double volts;
	int averageRaw;
	double averageVolts;

	
	public DistanceSensor()
	{
		super();
		
		AnalogPin = new AnalogInput(0);
		
		AnalogPin.setOversampleBits(4);
		bits = AnalogPin.getOversampleBits();
		AnalogPin.setAverageBits(2);
		bits = AnalogPin.getAverageBits();
		AnalogPin.setGlobalSampleRate(62500);
	}
		
	public DistanceSensor(int AnalogInputPin)
	{
		super();
		
		AnalogPin = new AnalogInput(AnalogInputPin);
		
		AnalogPin.setOversampleBits(4);
		bits = AnalogPin.getOversampleBits();
		AnalogPin.setAverageBits(2);
		bits = AnalogPin.getAverageBits();
		AnalogPin.setGlobalSampleRate(62500);
}
		

	public void DisplayDistance()
	{
		raw = AnalogPin.getValue();
		volts = AnalogPin.getVoltage();
		averageRaw = AnalogPin.getAverageValue();
		averageVolts = AnalogPin.getAverageVoltage();	
		
		SmartDashboard.putString("DB/String 0", "raw" + raw);
		SmartDashboard.putString("DB/String 1", "volts" + volts);
	}

	public double getDistance()
	{
		volts = AnalogPin.getVoltage();
		Return (volts * 10.0);	//tests suggest distance in inches = volts value * 10
	}

	
	public void displayswitches()
	{
		SmartDashboard.putNumber("Dipswitch 1 set to: ", booltoint(1));
		SmartDashboard.putNumber("Dipswitch 2 set to: ", booltoint(2));
		SmartDashboard.putNumber("Dipswitch 3 set to: ", booltoint(3));
		SmartDashboard.putNumber("Dipswitch 4 set to: ", booltoint(4));
	}


	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}



