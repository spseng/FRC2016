package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.networktables2.type.NumberArray;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Network extends Subsystem {
    

	NetworkTable tab = NetworkTable.getTable("");
	
	double fps;
	
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
		try
		{
			double[] empty = new double[2];
			double[] corner = tab.getNumberArray("LINE_CORNER", empty);
			
			SmartDashboard.putDouble("TEST", corner[1]);
			SmartDashboard.putBoolean("retrieve status", true);
		}
		catch(edu.wpi.first.wpilibj.networktables.NetworkTableKeyNotDefined e)
		{
			SmartDashboard.putBoolean("retrieve status", false);
		}
	
    }

}

