package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.RobotMap;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto_DriveForward extends CommandBase {
	int timer = 0;    
	double speed = 1.0; //this is set to full forward special constructor will update speed
	
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

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	drive.driveF(speed);
    	Timer.delay(0.1);
    	timer = 1;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(timer == 1) {
        	return true;
        }
        else {
        	return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    	drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
