package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.*;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto_RaiseTower extends CommandBase {
	
	int timer = 0;
	
    public Auto_RaiseTower() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(tower);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	tower.LiftTower();
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
    	tower.ResetTower();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
