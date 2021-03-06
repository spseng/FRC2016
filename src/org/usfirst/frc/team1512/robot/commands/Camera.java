package org.usfirst.frc.team1512.robot.commands;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.*;
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
	RectangleDescriptor recDes;
	CurveOptions curOp;
	RangeFloat[] angleRange = new RangeFloat[2];
	RangeFloat aR1 = new RangeFloat(30, 150);
	RangeFloat aR2 = new RangeFloat(210, 330);
	RangeFloat scaleRange;
	ShapeDetectionOptions shapeOp;
	
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
    	roi = NIVision.imaqCreateROI();
    	cam = new USBCamera("cam0");
    	cam.openCamera();
    	cam.setBrightness(20);
    	ser = CameraServer.getInstance();
    	c = new NIVision.RGBValue(255, 255, 80, 255);
    	NIVision.imaqSetROIColor(roi, c);
    	recDes = new RectangleDescriptor(10, 150, 20, 300);
    	curOp = new CurveOptions(NIVision.ExtractionMode.UNIFORM_REGIONS, 1, NIVision.EdgeFilterSize.NORMAL, 10, 10, 10, 1000, 1, 1);
    	angleRange[0] = aR1;
    	angleRange[1] = aR2;
    	scaleRange = new RangeFloat(1, 1000);
    	shapeOp = new ShapeDetectionOptions(1, angleRange, scaleRange, 10);
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
    	
    	frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
    	rgb = new int[NIVision.imaqGetImageSize(frame).width][NIVision.imaqGetImageSize(frame).width];
    	try
    	{
    		NIVision.imaqDetectRectangles(frame, recDes, curOp, shapeOp, roi);
    	}
    	catch(com.ni.vision.VisionException e)
    	{
    		System.out.println("eh");
    	}
    	
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
