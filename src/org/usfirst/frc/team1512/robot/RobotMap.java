package org.usfirst.frc.team1512.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
     public static int distancesensoranalogPort = 0;
    // public static int rangefinderModule = 1;
	public static int diorotation1 = 0;
	public static int diorotation2 = 1;
	public static int diodipswitch1 = 6;
	public static int diodipswitch2 = 7;
	public static int diodipswitch3 = 8;
	public static int diodipswitch4 = 9;
	public static int winchRelay = 0;
	public static int relay2 = 5;
	public static double autoSpeed = 0.5;
	
}
