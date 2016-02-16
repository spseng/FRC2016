package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.SensorSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SensorsAction extends CommandBase {
	
	
    public SensorsAction() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
//    	requires(sensors);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	sensors.displaydistance1();  //hopefully this will display distance info
    	
/*    	if(oi.AButton.get()&&tower.getTLS()&&tower.getTLS2())
    	{
        	tower.LiftTower();
    	}
    	else if(oi.BButton.get()&&tower.getBLS())
    	{
    		tower.DropTower();
    	}
    	else tower.ResetTower();
*/
    	
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
