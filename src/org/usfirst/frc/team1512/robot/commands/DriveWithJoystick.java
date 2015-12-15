package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
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
   // 	 	drive.shift((.75)*(oi.driveStick.getRawAxis(0)), (-.75)*oi.driveStick.getRawAxis(1), (.75)*(oi.driveStick.getRawAxis(4)));

    	/* 12/15/15
    	 * changed DriveWithJoystick:  Replaced 3rd parameter of execute(), which controls mecanum-drive spin.  
    	 * Instead of axis 4 (XBOX controller 2nd joystick) 
    	   we used axis 2, which is the LogitechAttack3 joystick throttle lever on back rear of joystick.
 */
    	drive.shift((.75)*(oi.driveStick.getRawAxis(0)), (-.75)*oi.driveStick.getRawAxis(1), (.75)*(oi.driveStick.getRawAxis(2)));
    	 	
    	
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
