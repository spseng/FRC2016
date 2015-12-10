package org.usfirst.frc.team1512.robot.commands;

import java.awt.geom.Area;

import org.usfirst.frc.team1512.robot.subsystems.ArmControl;
import org.usfirst.frc.team1512.robot.subsystems.DipSwitch;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1512.robot.subsystems.TowerControl;
import org.usfirst.frc.team1512.robot.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {

	public static OI oi;
	 static DriveTrain drive = new DriveTrain();
	 static ArmControl arm = new ArmControl();
	 static TowerControl tower= new TowerControl();
	
    public static void init(){
    	oi = new OI();
    }
    
    public CommandBase(String name){
    	super(name);
    }
    
    public CommandBase(){
    	super();
    }
}
