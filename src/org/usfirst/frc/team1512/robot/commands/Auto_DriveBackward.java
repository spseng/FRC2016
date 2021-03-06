package org.usfirst.frc.team1512.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto_DriveBackward extends CommandBase {

	boolean finished = false;
	double speed = 1.0; //this is the default speed.  Second constructor can set speed
	
    public Auto_DriveBackward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drive);
    }

    public Auto_DriveBackward(double inspeed) {
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
    	drive.driveB(speed);
    	Timer.delay(0.1);
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       if (finished = true)
       {
    	   return false;
       }
       return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
