package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.FlipperControl;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FlipperAction extends CommandBase {
	
    public FlipperAction() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(flipper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(oi.RBumper.get())
    	{
    		flipper.OpenGripper();
    	}
    	else if(oi.LBumper.get())
    	{
    		flipper.CloseGripper();
    	}
    	else if (oi.testStart.get())
    	{
    		flipper.Compress();
    	}
    	else if (oi.testBack.get())
    	{
    		flipper.endC();
    	}
    	
    	SmartDashboard.putNumber("LBumper close, RBumper open, start start, back stop", 0);	

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	flipper.endC();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
