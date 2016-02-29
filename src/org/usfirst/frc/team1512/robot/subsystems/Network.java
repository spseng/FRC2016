package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Network extends Subsystem {
    

	NetworkTable tab = NetworkTable.getTable("SmartDashboard");
	double[] corner = new double[2];
	double[] empty = new double[2];
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Network(){
		
	}
		
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void retrieveVal()
    {
    	empty[0] = 999;
		try
		{
			corner = tab.getNumberArray("LINE_CORNER", empty);
			SmartDashboard.putBoolean("retrieve status", true);
		}
		catch(edu.wpi.first.wpilibj.networktables.NetworkTableKeyNotDefined e)
		{
			SmartDashboard.putBoolean("retrieve status", false);
		}
	
    }
    
    public double[] returnVal(double[] a)
    {
    	a = corner;
    	return a;
    }

}

