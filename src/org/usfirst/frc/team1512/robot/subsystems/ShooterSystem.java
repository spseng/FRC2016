package org.usfirst.frc.team1512.robot.subsystems;

import org.usfirst.frc.team1512.robot.OI;
import org.usfirst.frc.team1512.robot.commands.ShooterAction;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterSystem extends Subsystem {

	public Jaguar shooter, collector;
	OI oi = new OI();

	double shooterspeed = 0.0;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public ShooterSystem(){
		shooter = new Jaguar(2);
		collector = new Jaguar(4);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void collect(double speed)
    {
    	collector.set(speed);
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

	public void shoot(double speed)
	{
		if (shooterspeed + (speed/100) < 1 && shooterspeed + (speed/100) > 0)
		{
			shooterspeed = shooterspeed + (speed/100);
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
