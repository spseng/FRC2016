package org.usfirst.frc.team1512.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team1512.robot.subsystems.DipSwitchSystem;
import org.usfirst.frc.team1512.robot.subsystems.DistanceSensor;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class testcommand extends CommandGroup {

    public testcommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	SmartDashboard.putNumber("Into autonomous test program", 1);	
        for(int i = 0; i <= 10; i++) 
		{
        	
			double speed=((double) i)/10.0;
			addSequential(new Auto_DriveForward(speed, 0.5));
			
		} 
    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//        
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//        return false;
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    }
}
