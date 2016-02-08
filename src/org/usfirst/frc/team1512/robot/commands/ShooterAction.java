package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.TowerControl;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterAction extends CommandBase {
	
    public ShooterAction() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	ShooterControl.setcollector(oi.driveStick.getRawAxis(1));
    	
    	if(oi.RBumper.get())
    	{
    		ShooterControl.shoottop();
    	}
    	else if(oi.LBumper.get())
    	{
    		ShooterControl.shootbot();
    	}
    	else if(oi.BButton.get())
    	{
    		ShooterControl.speedupshooter;
    	}
    	else if(oi.ABumper.get())
    	{
    		ShooterControl.speeddownshooter;
    	}
    	else if(oi.YButton.get())
    	{
    		ShooterControl.startshooter;
    	}
    	else if(oi.XButton.get())
    	{
    		ShooterControl.stopshooter;
    	}
    		
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
