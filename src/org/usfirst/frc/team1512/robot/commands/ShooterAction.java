package org.usfirst.frc.team1512.robot.commands;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.subsystems.ShooterControl;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
    protected void execute() 
    {
    	
    	shooter.setcollector(oi.xbox.getRawAxis(1));
    	
    	if(oi.RBumper.get())
    	{
    		shooter.shoottop();
    	}
    	else if(oi.LBumper.get())
    	{
    		shooter.shootbot();
    	}
    	else if(oi.BButton.get())
    	{
    		shooter.speedupshooter();
    	}
    	else if(oi.AButton.get())
    	{
    		shooter.speeddownshooter();
    	}
    	else if(oi.YButton.get())
    	{
    		shooter.startshooter();
    	}
    	else if(oi.XButton.get())
    	{
    		shooter.stopshooter();
    	}
    		
        SmartDashboard.putNumber("Y start X stop A slower B faster Shooter Spped:", shooter.getshooterspeed());	
   }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	shooter.stopshooter();
    	shooter.stopcollector();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
