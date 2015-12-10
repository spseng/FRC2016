package org.usfirst.frc.team1512.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1512.robot.subsystems.ArmControl;
import org.usfirst.frc.team1512.robot.subsystems.TowerControl;


/**
 *
 */
public class Auto_CloseGripper extends CommandBase {

	int finisher = 0;
    public Auto_CloseGripper() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	arm.CloseGripper();
    	finisher = 1;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(finisher == 1) {
        	return true;
        }
        else {
        	return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    	arm.ResetGripper();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
