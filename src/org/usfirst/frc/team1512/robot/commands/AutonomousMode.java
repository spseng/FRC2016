package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.subsystems.DipSwitch;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team1512.robot.subsystems.SensorSubsystem;
import org.usfirst.frc.team1512.robot.subsystems.ShooterControl;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class AutonomousMode extends CommandGroup
{
	DigitalInput auto1;
	DigitalInput auto2;
	DigitalInput auto3;
	
	public  AutonomousMode()  
	{
		
		auto1 = new DigitalInput(4);
		auto2 = new DigitalInput(5);
		auto2 = new DigitalInput(6);
		
		int dipNum = 0;
		
		if(auto1.get())
		{
			dipNum = dipNum + 1;
			
		}else if(auto2.get())
		{
			dipNum = dipNum + 2;
			
		}else if(auto3.get())
		{
			dipNum = dipNum + 4;
			
		}else{
			
			dipNum = dipNum; 
			
		}
		
		double speed=0.3;
 
		SmartDashboard.putNumber("Dipswitch 1 set to: ", booltoint(auto1.get()))
		SmartDashboard.putNumber("Dipswitch 2 set to: ", booltoint(auto3.get()))
		SmartDashboard.putNumber("Dipswitch 2 set to: ", booltoint(auto3.get()))


		if (dipNum = 1) //if auto1 on and auto2 on
		{
			SmartDashboard.putNumber("Set to run program ", 1);
			// drive forward through an obstacle and be infront of the goal, and shoot the low goal
			
			while (sensors.getdistance()> 12.0)
			{	
				addSequential(new Auto_DriveForward(speed, 0.5));
			}
			
			for (int i = 2; i >= 0; i--) 
			{
				double speed=((double) i)/10.0;
				addSequential(new Auto_DriveForward(speed, 0.5));
			
			}
			addSequential(new Auto_Stop());
			
			ShooterControl.shootbot();
			
		}
		else if (dipNum = 2) //if auto1 on and auto2 off
		{
			SmartDashboard.putNumber("Set to run program ", 2);
			// drive forward through an obstacle and be infront of the goal, and shoot the high goal
			
			while (sensors.getdistance()> 12.0)
			{	
				addSequential(new Auto_DriveForward(speed, 0.5));
			}
			
			for (int i = 2; i >= 0; i--) 
			{
				double speed=((double) i)/10.0;
				addSequential(new Auto_DriveForward(speed, 0.5));
			
			}
			addSequential(new Auto_Stop());
			
        	ShooterControl.shoottop();
			
		}
		else if (dipNum = 3) //if auto1 off and auto2 on
		{
			SmartDashboard.putNumber("Set to run program ", 3);
			//just drive forward and stop but don't shoot

			while (sensors.getdistance()> 12.0)
			{	
				addSequential(new Auto_DriveForward(speed, 0.5));
			}
			
			for (int i = 2; i >= 0; i--) 
			{
				double speed=((double) i)/10.0;
				addSequential(new Auto_DriveForward(speed, 0.5));
			
			}
			addSequential(new Auto_Stop());
			
		}
		else if (dipNum = 4) //if auto1 off and auto2 off
		{
			SmartDashboard.putNumber("Set to run program ", 4);
			//
			// code for program 4 here:

		
		}
		else if (dipNum = 5) //if auto1 off and auto2 off
		{
			SmartDashboard.putNumber("Set to run program ", 5);
			//
			// code for program 4 here:
		}
		else if (dipNum = 6) //if auto1 off and auto2 off
		{
			SmartDashboard.putNumber("Set to run program ", 6);
			//
			// code for program 4 here:
		}
		else if (dipNum = 7) //if auto1 off and auto2 off
		{
			SmartDashboard.putNumber("Set to run program ", 7);
			//
			// code for program 4 here:
		}
		else  //if NO dipswitch on do this
		{
			//do nothing
			
		}

       
        
    }
}
