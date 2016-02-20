package org.usfirst.frc.team1512.robot.commands;


import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class AutonomousMode extends CommandGroup
{
	
	DigitalInput auto1;
	DigitalInput auto2;
	
	
	public  AutonomousMode()  
	{
	
		auto1 = new DigitalInput(4);
		auto2 = new DigitalInput(5);
		
	
		SmartDashboard.putNumber("Dipswitch 1 set to: ", booltoint(auto1.get()));
		SmartDashboard.putNumber("Dipswitch 2 set to: ", booltoint(auto2.get()));

		if (auto1.get() && auto2.get() ) //if auto1 on and auto2 on
		{
			SmartDashboard.putNumber("Set to run program ", 1);
			//
			// code for program 1 here:
			
		}
		else if (!auto1.get() && auto2.get()) //if auto1 on and auto2 off
		{
			SmartDashboard.putNumber("Set to run program ", 2);
			//
			// code for program 2 here:
			
		}
		else if (auto1.get() && !auto2.get()) //if auto1 off and auto2 on
		{
			SmartDashboard.putNumber("Set to run program ", 3);
			//
			// code for program 3 here:
			
		}
		else if (!auto1.get() && !auto2.get()) //if auto1 off and auto2 off
		{
			SmartDashboard.putNumber("Set to run program ", 4);
			//
			// code for program 4 here:
			
		}
		else  //if NO dipswitch on do this
		{
			SmartDashboard.putNumber("Set to run program ", 0);
			//
			// code for program 0 here:
			
		}

		/*
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
		*/
	}
	
	public int booltoint(boolean switchvalue)
	{	
		if (switchvalue==true)
		{
			return 1;
		}
		else
		{
			return 0;
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
			addSequential(new Auto_Stop());
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
    


