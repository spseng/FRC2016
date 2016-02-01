package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.subsystems.DipSwitch;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.networktables2.util.List;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.AnalogInput;

public class AutonomousMode extends CommandGroup{

	//  documentation suggests that analog-input distance-sensors 
	//	should be set up as generic analog inputs.  Here is
	//	documentation: http://wpilib.screenstepslive.com/s/4485/m/13810/l/241876-analog-inputs
	
	AnalogInput exampleAnalog = new AnalogInput(0);
	int bits;

	DigitalInput = hitLS;
	
	public  AutonomousMode()  
	{
		
		SmartDashboard.putString("HI autonomous is on");
		
		exampleAnalog.setOversampleBits(4);
		bits = exampleAnalog.getOversampleBits();
		exampleAnalog.setAverageBits(2);
		bits = exampleAnalog.getAverageBits();
		AnalogInput.setGlobalSampleRate(62500);
		int raw;
		double volts;
		int averageRaw;
		double averageVolts;
		int distance;
		boolean ObstacleCrossed = false;
		
		//1. drive and hit something
		if (dip.auto1()&&!dip.auto2()&&!dip.auto3()&&!dip.auto4())
		{
			SmartDashboard.putNumber("Dipswitch activated #1", 1);
			System.out.println("Dip#1");
			
			//repeat function 100 times to make sure it has hit something
			for(int i = 0; i<= 100; i++) {
			addSequential(new Auto_DriveForward());
			}
			
			System.out.println("Driving to hit something");
		}
		
		//2. figure out how to drive through obstacles
		 else if (!dip.auto1()&&dip.auto2()&&!dip.auto3()&&!dip.auto4())
		{
			 SmartDashboard.putNumber("Dipswitch activated #", 2);
			 System.out.println("Dip#2");
			
		//if distance is shorter than the supposed value of 100 inches, get distance repeatedly
			 while(distance<100 && !ObstacleCrossed)
			 {
				 //variables for the distance sensor
				 raw = exampleAnalog.getValue();
				 volts = exampleAnalog.getVoltage();
				 averageRaw = exampleAnalog.getAverageValue();
				 averageVolts = exampleAnalog.getAverageVoltage();	
				 SmartDashboard.putString("DB/String 0", "raw" + raw);
				 SmartDashboard.putString("DB/String 1", "volts" + volts);
				 distance=volts*100;
			 
				 //100 inches is only a guess
				 //if the distance sensor does not sense an opening, move left/right		
				 addSequential(new Auto_DriveLeft());
				 //if the distance sensor senses an opening which it can pass though an obstacle
				 //move forward
				 if(distance>100)
				 {	
					addSequential(new Auto_DriveForward());
					System.out.println("Driving to an obtacle");
					ObstacleCrossed = true;
				 }
			 }
		}
		
		//3. shoot the low goal
		
		else if (!dip.auto1()&&!dip.auto2()&&dip.auto3()&&!dip.auto4())
		{
			SmartDashboard.putNumber("Dipswitch activated #", 3);
	   		System.out.println("Dip#3");
			
		}
		
		//4. shoot the high goal
		
		else if (!dip.auto1()&&!dip.auto2()&&!dip.auto3()&&dip.auto4())
		{
			SmartDashboard.putNumber("Dipswitch activated #", 4);
			System.out.println("Dip#4");
		}
		
		else 
		{
			String message = "Or there are too many!";
   		 	SmartDashboard.putString("There are currently no dipswitches activated", message);
   		 	System.out.println("Dip XD");
		}
	}
		
}
	
	
	
	
	
	
	
	
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
    
}
