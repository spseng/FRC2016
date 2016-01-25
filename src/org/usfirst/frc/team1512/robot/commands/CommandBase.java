package org.usfirst.frc.team1512.robot.commands;

import java.awt.geom.Area;

import org.usfirst.frc.team1512.robot.subsystems.ArmSystem;
import org.usfirst.frc.team1512.robot.subsystems.DipSwitch;
import org.usfirst.frc.team1512.robot.subsystems.DriveSystem;
import org.usfirst.frc.team1512.robot.subsystems.TowerSystem;
import org.usfirst.frc.team1512.robot.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {

	public static OI oi;
	 static DriveSystem drive = new DriveSystem();
	 static ArmSystem arm = new ArmSystem();
	 static TowerSystem tower= new TowerSystem();
	
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
