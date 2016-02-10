package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.RobotMap;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto_DriveForward extends CommandBase {
	int timer = 0;    
	double speed = 1.0; //this is set to full forward special constructor will update speed
	double timeinseconds=0.1;  //default to tenth of second
	
	public Auto_DriveForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drive);
    	
    }

	public Auto_DriveForward(double inspeed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drive);
    	speed=inspeed;
    }

	public Auto_DriveForward(double inspeed, double intimeinseconds) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drive);
    	speed=inspeed;
    	timeinseconds=intimeinseconds;
    }

	// Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(timeinseconds);
       	drive.driveF(speed);
   }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();
     }

    // Called once after isFinished returns true
    protected void end() {
    	drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
