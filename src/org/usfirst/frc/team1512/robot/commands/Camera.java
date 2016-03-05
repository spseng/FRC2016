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
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
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
	DetectRectanglesResult result;
	double[] val = new double[2];

	
    public Camera() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(net);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
//
//        // the camera name (ex "cam0") can be found through the roborio web interface

//        session = NIVision.IMAQdxOpenCamera("cam0", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
//        NIVision.IMAQdxConfigureGrab(session);
//    	roi = NIVision.imaqCreateROI();
    	cam = new USBCamera("cam0");
    	ser = CameraServer.getInstance();
    	cam.openCamera();
    	cam.setBrightness(10);
    	ser.startAutomaticCapture(cam);
    	
//    	ser = CameraServer.getInstance();
//    	cam.openCamera();
//    	cam.setBrightness(20);
//    	session = NIVision.IMAQdxOpenCamera("cam0", NIVision.IMAQdxCameraControlMode.CameraControlModeController);

//    	c = new NIVision.RGBValue(255, 255, 80, 255);
//    	NIVision.imaqSetROIColor(roi, c);
//    	recDes = new RectangleDescriptor(10, 150, 20, 300);
//    	curOp = new CurveOptions(NIVision.ExtractionMode.UNIFORM_REGIONS, 1, NIVision.EdgeFilterSize.NORMAL, 10, 10, 10, 1000, 1, 1);
//    	angleRange[0] = aR1;
//    	angleRange[1] = aR2;
//    	scaleRange = new RangeFloat(1, 1000);
//    	shapeOp = new ShapeDetectionOptions(1, angleRange, scaleRange, 10);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//        NIVision.IMAQdxStartAcquisition(session);
//        NIVision.IMAQdxGrab(session, frame, 1);
//        NIVision.IMAQdxStopAcquisition(session);
//                
//        CameraServer.getInstance().setImage(frame);
//        Timer.delay(0.005);

//    	frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
//        NIVision.IMAQdxConfigureGrab(session);
//    	NIVision.IMAQdxStartAcquisition(session);
//    	NIVision.IMAQdxGrab(session, frame, 0);
//    	ser.setImage(frame);
//    	NIVision.IMAQdxStopAcquisition(session);
//    	cam.getImage(frame);
//    	rgb = new int[NIVision.imaqGetImageSize(frame).width][NIVision.imaqGetImageSize(frame).width];
//    	result = NIVision.imaqDetectRectangles(frame, recDes, null, null, roi);
//    	RectangleMatch rec = result.array[0];
//    	System.out.println(rec.height + ", "+ rec.width);
    	
//    	ser.startAutomaticCapture(cam);
    	//git test
    	net.retrieveVal();
//    	val = net.returnVal(val);
//    	SmartDashboard.putNumber("POINT 1", val[0]);
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
//    	cam.closeCamera();
    }
}
