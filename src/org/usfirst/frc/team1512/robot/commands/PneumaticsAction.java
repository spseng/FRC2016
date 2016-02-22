package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PneumaticsAction extends CommandBase {	
	
    public PneumaticsAction() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	pneumatics.startCompressor();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
