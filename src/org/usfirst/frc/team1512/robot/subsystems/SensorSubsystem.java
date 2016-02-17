package org.usfirst.frc.team1512.robot.subsystems;
//package edu.wpi.first.wpilibj;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.AnalogInput;
/**
 *
 * @author eyal
 */
public class SensorSubsystem extends Subsystem 
{
    
	//documentation suggests that analog-input distance-sensors 
		//	should be set up as generic analog inputs.  Here is
		//	documentation: http://wpilib.screenstepslive.com/s/4485/m/13810/l/241876-analog-inputs
		
		AnalogInput DistanceSensor1;
		int bits;
		
		

		SensorSubsystem sensors;
		
	public SensorSubsystem()
	{
		super();
		//documentation suggests that analog-input distance-sensors 
		//	should be set up as generic analog inputs.  Here is
		//	documentation: http://wpilib.screenstepslive.com/s/4485/m/13810/l/241876-analog-inputs
		
		DistanceSensor1 = new AnalogInput(0);
		DistanceSensor1.setOversampleBits(4);
		bits = DistanceSensor1.getOversampleBits();
		DistanceSensor1.setAverageBits(2);
		bits = DistanceSensor1.getAverageBits();
		DistanceSensor1.setGlobalSampleRate(62500);
	}
	
	
	
	public void displaydistance1()
	{
		int raw;
		double volts;
		int averageRaw;
		double averageVolts;
		
		raw = DistanceSensor1.getValue();
		volts = DistanceSensor1.getVoltage();
		averageRaw = DistanceSensor1.getAverageValue();
		averageVolts = DistanceSensor1.getAverageVoltage();	
		
		SmartDashboard.putString("DB/String 0", "raw" + raw);
		SmartDashboard.putString("DB/String 1", "volts" + volts);
		
	}
 	
	public void Encoder(int port1, int port2) 
	{
 

	}
    public double get() 
    {
        return 0;
    }

	
    public void start() 
    {
    }

	
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public void reset() {

    }
}
