package org.usfirst.frc.team1512.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto_LowerTower extends CommandBase {
	int fin = 0;
    public Auto_LowerTower() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(tower);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	tower.DropTower();
    	Timer.delay(0.1);
    	fin = 1;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(fin == 1) {
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
