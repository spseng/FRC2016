package org.usfirst.frc.team1512.robot.commands;

import java.awt.geom.Area;

//import org.usfirst.frc.team1512.robot.subsystems.DipSwitchSystem;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1512.robot.subsystems.ShooterSystem;
import org.usfirst.frc.team1512.robot.subsystems.Pneumatics;
import org.usfirst.frc.team1512.robot.subsystems.WinchSystem;
import org.usfirst.frc.team1512.robot.subsystems.DistanceSensor;
import org.usfirst.frc.team1512.robot.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {

	public static OI oi;
	static DriveTrain drive = new DriveTrain();
	static ShooterSystem shooter = new ShooterSystem();
	static Pneumatics pneumatics = new Pneumatics();
	static WinchSystem winch = new WinchSystem();
//	static DipSwitch dipswitches = new DipSwitch();
//	static DipSwitchSystem dipswitches;
//	static DistanceSensor distance = new DistanceSensor();
	
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
