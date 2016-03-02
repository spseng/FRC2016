package org.usfirst.frc.team1512.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 *
 */
public class testcommand2 extends CommandGroup {

    public testcommand2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	SmartDashboard.putNumber("Into autonomous test program", 2);	
        for(int i = 0; i <= 5; i++) 
		{
        	
			double speed=((double) i)/10.0;
			addSequential(new Auto_DriveBackward(speed, 0.5));
			
		} 
    }
}
