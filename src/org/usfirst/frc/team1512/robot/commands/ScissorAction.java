package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.ScissorSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ScissorAction extends CommandBase {
	
    public ScissorAction() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(scissor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    
    	double collectvalue=oi.xbox.getRawAxis(3);
    	
    	if (collectvalue>0.5)
    	{
    		cut.RaiseScissor();
    	}
    	
    	else if (collectvalue<-0.5)
    	{
    		cut.LowerScissor();
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
