package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.commands.ShooterAction;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team1512.robot.subsystems.DistanceSensor;

/**
 *
 */
public class ShooterSystem extends Subsystem {

	DoubleSolenoid flipper;
	public Jaguar shooter, collector;
	OI oi = new OI();
	
	DistanceSensor distance;

	double shooterspeed = 0.0;
   	double collectorspeed=4.7;
   	boolean collectoron=false;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public ShooterSystem(){
		flipper = new DoubleSolenoid(4, 5);
		shooter = new Jaguar(2);
		collector = new Jaguar(4);
		
		distance = new DistanceSensor();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void collect(double speed)
    {
    	if (speed<-0.61) speed=-0.61;
    	if (speed>0.61) speed=0.61;
    	collector.set(-1.0*speed);
	    SmartDashboard.putNumber("Collector Speed", speed);	
	    distance.DisplayDistance();	
   }

    public void testcollect(double speed)  //not used.  Didn't work, collectorspeed changed but speed of wheel didn't
    {
    	if (!collectoron && speed > 0.8) collectoron=true; //start collector off but push forward to turn on
    	if (collectoron && speed>0.8) collectorspeed = collectorspeed + 0.01;
       	if (collectoron && speed<-0.8) collectorspeed = collectorspeed - 0.01;
        if (collectoron)
        	{
        	collector.set(-1.0*collectorspeed);
        	}
        else
        {
        	collector.set(0.0);
        	        	
        }
	    SmartDashboard.putNumber("Collector Speed", collectorspeed);	
	    distance.DisplayDistance();	
   }

    public void startshooter()
	{
		shooter.set(shooterspeed);
	}

	public void speedupshooter()
	{
		shooterspeed = shooterspeed - 0.025;
		shooter.set(shooterspeed);
	}

	public void speeddownshooter()
	{
		shooterspeed = shooterspeed + 0.025;
		shooter.set(shooterspeed);
	}

	public void stopshooter()
	{
		shooter.set(0);
	}

	public void takeshot()
	{
		flipper.set(Value.kForward);
		Timer.delay(0.25);
		flipper.set(Value.kReverse);
	}

	public void shoot(double speed)
	{

			shooterspeed =  speed;
			if (speed<-0.75) speed=-0.75;
	    	if (speed>0.75) speed=0.75;
	    	shooter.set(-1.0*speed);
		    SmartDashboard.putNumber("Shooter Speed", speed);	
		       
	}


	public void shoottest(double speed)
	{
		if (shooterspeed + (speed/10) < 1 && shooterspeed + (speed/10) > 0)
		{
			shooterspeed = shooterspeed + (speed/10);
			shooter.set(shooterspeed);
		}
		else if (shooterspeed < 1 && shooterspeed > 0)
		{
			if (speed > 0)
			{
				shooterspeed = 1;
			}
			else if (speed < 0)
			{
				shooterspeed = 0;
			}
		}
	}
}
