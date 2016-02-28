package org.usfirst.frc.team1512.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto_DriveBackward extends CommandBase {

	boolean finished = false;
	double speed = 1.0; //this is the default speed.  Second constructor can set speed
	double timeinseconds=0.1;
	
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

	public Auto_DriveBackward(double inspeed, double intimeinseconds) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drive);
    	speed=inspeed;
    	timeinseconds=intimeinseconds;
    }
   // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(timeinseconds);
    	drive.driveB(speed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	drive.driveB(speed);
    	Timer.delay(0.1);
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {

       return  isTimedOut();
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
