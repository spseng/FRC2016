package org.usfirst.frc.team1512.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 */
public class RotationSensor extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
<<<<<<< HEAD
	
	int port1=0;
	int port2=1;

	public RotationSensor() 
	{
    }

	public RotationSensor(int inport1, int inport2) 
	{
		port1=inport1;
		port2=inport2;
    }

	
    public double get() 
    {
        return 0.0;
    }

=======



	
	public RotationSensor()
	{
		super();


	}
		
>>>>>>> origin/master
	
    public void start() 
    {
    }


	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

