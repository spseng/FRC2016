package org.usfirst.frc.team1512.robot.commands;


import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.CommandGroup;
//import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1512.robot.subsystems.DipSwitchSystem;
import org.usfirst.frc.team1512.robot.subsystems.DistanceSensor;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class AutonomousMode extends CommandGroup
{
	
	AnalogInput InputDial;
	
	public  AutonomousMode()  
	{
		
		InputDial = new AnalogInput(1);
        int i=0;
        
 /*       if (dipswitches.auto1.get()==false)
     SmartDashboard.putNumber("Autonomous InputDial=", InputDial.getVoltage());	
     if (InputDial.getVoltage()>0.5)
        {
		for( i = 0; i <= 10; i++) 
			{
				double speed=((double) i)/10.0;
				addSequential(new Auto_DriveForward(speed, 0.5));
				
			}
		
	     }
        else
        {
    		for( i = 0; i <= 5; i++) 
    		{
    			double speed=((double) i)/10.0;
    			addSequential(new Auto_DriveBackward(speed, 0.5));
    			
    		}
     
        	
        }
		addSequential(new Auto_Stop());
		*/

	}
}
