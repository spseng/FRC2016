
package org.usfirst.frc.team1512.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team1512.robot.RobotMap;
import org.usfirst.frc.team1512.robot.commands.Accelerometer;
import org.usfirst.frc.team1512.robot.commands.AutonomousMode;
import org.usfirst.frc.team1512.robot.commands.Camera;
import org.usfirst.frc.team1512.robot.commands.Compress;
import org.usfirst.frc.team1512.robot.commands.DriveWithJoystick;
import org.usfirst.frc.team1512.robot.commands.GripperAction;
import org.usfirst.frc.team1512.robot.commands.Reset;
import org.usfirst.frc.team1512.robot.commands.TowerAction;
import org.usfirst.frc.team1512.robot.commands.SensorsAction;
import org.usfirst.frc.team1512.robot.commands.CommandBase;
import org.usfirst.frc.team1512.robot.commands.testCompressor;
import org.usfirst.frc.team1512.robot.subsystems.DipSwitch;
import org.usfirst.frc.team1512.robot.subsystems.DistanceSensor;
import org.usfirst.frc.team1512.robot.subsystems.RotationSensor;
import org.usfirst.frc.team1512.robot.subsystems.DriveTrain;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
		
    double counter = 0.0;
	Command autonomousCommand;
    OI oi = new OI();
    DigitalInput limit;
    DriveWithJoystick drive = new DriveWithJoystick(); 
    Compress compress = new Compress();
    TowerAction tower = new TowerAction();
    SensorsAction sensors = new SensorsAction();
    GripperAction gripper = new GripperAction();
    testCompressor test = new testCompressor();
    Camera camera = new Camera();
    AutonomousMode auto = new AutonomousMode();
    Reset reset = new Reset();
    //DistanceSensor distance = new DistanceSensor();//distance sensor connected to analog port 0.

//    TowerOp towerOp = new TowerOp();
    
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    	CommandBase.init();
    	System.out.println("robo Initiated");
        // instantiate the command used for the autonomous period
    	sensors.start();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
    	System.out.println("auto Initiated");
    	compress.start();
    	auto.start();
    			
		
        SmartDashboard.putNumber("Counter", counter++);	
    	//if (autonomousCommand != null) autonomousCommand.start();
    }


    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Counter2", counter++);

        SmartDashboard.putNumber("Counter", counter++);	
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
    	CommandBase.init();
    	System.out.println("teleop Initiated");
    	drive.start();
    	compress.start();
    	tower.start();
    	gripper.start();
    	sensors.start();
    	camera.start();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	reset.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        oi.testBack.whenPressed(test);
        SmartDashboard.putNumber("Counter", counter++);
        }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
