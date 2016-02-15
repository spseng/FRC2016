package org.usfirst.frc.team1512.robot.commands;


import org.usfirst.frc.team1512.robot.subsystems.DipSwitch;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class AutonomousMode extends CommandGroup
{
	
//	DipSwitch dip = new DipSwitch();
	
	
	public  AutonomousMode()  
	{
	
        int i=0;
        
		for( i = 0; i <= 5; i++) 
		{
			double speed=((double) i)/10.0;
			addSequential(new Auto_DriveForward(speed, 0.5));
			
		}
		
		for( i = 5; i >= 0; i--) 
		{
			double speed=((double) i)/10.0;
			addSequential(new Auto_DriveForward(speed, 0.5));
			
		}
	}
}

		/*		
//		for(int i = 0; i <= 10; i++) {
//			addSequential(new Auto_Timer(0.1));  //I hope this will keep it driving for 1 sec
//			
//		}
		
		
		
		for( i=10; i>=0; i--)  //slow down to stop
		{
			double speed=((double) i)/10.0;
			addSequential(new Auto_DriveForward(speed));
			addSequential(new SensorsAction());
		}		
//		for(int i=0; i<=10; i++)
//		{
//			addSequential(new Auto_Stop())
//		}		
		for( i=10; i<=10; i++)
		{
			double speed=((double) i)/10.0;
			addSequential(new Auto_DriveBackward(speed));
					}		
		for( i=10; i>=0; i--)  //slow down to stop
		{
			double speed=((double) i)/10.0;
			addSequential(new Auto_DriveBackward(speed));
		}		
		for( i=0; i<=10; i++)
		{
			addSequential(new Auto_DriveBackward());
			autonomousPeriodic();
		}		
	}
*/
//		for(int i = 0; i<= 30; i++) {
//			addSequential(new Auto_RaiseTower());
//			System.out.println("Lifting");
//		}
//		for(int i = 0; i <= 30; i++) {
//			addSequential(new Auto_DriveForward());
//			System.out.println("Driving");
//		}
//		for(int i = 0; i<= 30; i++) {
//			addSequential(new Auto_LowerTower());
//			System.out.println("Lowering");
//		}
		
//		addSequential(new Auto_DriveForward());
//		System.out.println("Driving");
//		Timer.delay(0.5);
//		addSequential(new Auto_MotorStop());
//		System.out.println("Stop");
//		addSequential(new Auto_RaiseTower());
//		System.out.println("Lifting");
//		Timer.delay(1);
//		addSequential(new Auto_TowerStop());
//		System.out.println("Stop");
//		addSequential(new Auto_OpenGripper());
//		System.out.println("YAY");
		
		
//		if	(dip.auto1()&&!dip.auto2()&&!dip.auto3()&&!dip.auto4())
//		{
//			SmartDashboard.putNumber("Dipswitch activated #1", 1);
//			System.out.println("Dip#1");
//			addSequential(new Auto_DriveForward());
//			System.out.println("Driving");
//			Timer.delay(0.5);
//			addSequential(new Auto_MotorStop());
//			System.out.println("Stop");
//			addSequential(new Auto_RaiseTower());
//			System.out.println("Lifting");
//			Timer.delay(1);
//			addSequential(new Auto_TowerStop());
//			System.out.println("Stop");
//			addSequential(new Auto_OpenGripper());
//			System.out.println("YAY");
//		}
//		
//		else if (!dip.auto1()&&dip.auto2()&&!dip.auto3()&&!dip.auto4())
//		{
//			SmartDashboard.putNumber("Dipswitch activated #", 2);
//			System.out.println("Dip#2");
//			addSequential(new Auto_OpenGripper());
//    	}
//    	 
//		else if (!dip.auto1()&&!dip.auto2()&&dip.auto3()&&!dip.auto4())
//		{
//	    	SmartDashboard.putNumber("Dipswitch activated #", 3);
//	   		System.out.println("Dip#3");
//	   		addSequential(new Auto_RaiseTower());
//	  		end();
//		}
//    	 
//		else if (!dip.auto1()&&!dip.auto2()&&!dip.auto3()&&dip.auto4())
//		{
//			 SmartDashboard.putNumber("Dipswitch activated #", 4);
//			 System.out.println("Dip#4");
//			 end();
//    	}
//    	 
//		else 
//		{
//    		 //nah
//    		 String message = "Or there are too many!";
//    		 SmartDashboard.putString("There are currently no dipswitches activated", message);
//    		 System.out.println("Dip XD");
//    	 }
//    	 
 

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    


