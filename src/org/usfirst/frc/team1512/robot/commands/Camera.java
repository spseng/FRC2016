package org.usfirst.frc.team1512.robot.commands;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.RGBValue;
import com.ni.vision.NIVision.ROI;
import java.awt.*;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.vision.USBCamera;

/**
 *
 */
public class Camera extends CommandBase {
	int session;
	Image frame;
	USBCamera cam;
	CameraServer ser;
	int[][] rgb;
	ROI roi;
	RGBValue c;
	
    public Camera() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
//
//        // the camera name (ex "cam0") can be found through the roborio web interface
//        session = NIVision.IMAQdxOpenCamera("cam0",
//                NIVision.IMAQdxCameraControlMode.CameraControlModeController);
//        NIVision.IMAQdxConfigureGrab(session);
    	frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
    	cam = new USBCamera("cam0");
    	cam.openCamera();
    	cam.setBrightness(20);
    	ser = CameraServer.getInstance();
    	rgb = new int[NIVision.imaqGetImageSize(frame).width][NIVision.imaqGetImageSize(frame).width];
    	c = new RGBVlaue(255, 255, 80, 255);
    	NIVision.imaqSetROIColor(roi, c);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//        NIVision.IMAQdxStartAcquisition(session);
//        NIVision.IMAQdxGrab(session, frame, 1);
//        NIVision.IMAQdxStopAcquisition(session);
//                
//        CameraServer.getInstance().setImage(frame);
//        Timer.delay(0.005);
    	ser.startAutomaticCapture(cam);
    	cam.getImage(frame);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	cam.closeCamera();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
