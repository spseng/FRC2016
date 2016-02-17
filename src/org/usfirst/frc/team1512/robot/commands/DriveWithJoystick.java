package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoystick extends CommandBase {	
	
    public DriveWithJoystick() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
   // 	drive.arcade((-.75)*(oi.leftDrive.getRawAxis(1)), (.75)*(oi.rightDrive.getRawAxis(1)));
    //	drive.tank((-.75)*(oi.leftDrive.getRawAxis(1)), (.75)*(oi.rightDrive.getRawAxis(1)));

   //This is an experiment, but I don't see why this won't work.  It uses the DriveTrain class,
   //	where the tank function already has a more sophisticated system of driving
   //	- including a deadzone around 0:
    	drive.tank(oi.leftDrive.getRawAxis(1), oi.rightDrive.getRawAxis(1));
    	drive.shoot(oi.xbox.getRawAxis(1));
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
