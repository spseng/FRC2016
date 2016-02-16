package org.usfirst.frc.team1512.robot.subsystems;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.*;
import java.awt.*;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.vision.USBCamera;

//package edu.wpi.first.wpilibj;

/**
 *
 * @author eyal
 */
public class CameraSystem {

	USBCamera cam;
	CameraServer server;
	NIVision.Image img;
	int[] R;
	int[] G;
	int[] B;
	
    public CameraSystem() {
    	img = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
    	cam = new USBCamera("cam0");
    	cam.openCamera();
    	cam.setBrightness(20);
    	server = CameraServer.getInstance();
//    	cam.startCapture();
//    	NIVision.IMAQdxOpenCamera("cam0", NIVision.IMAQdxCameraControlMode);
    }
    
    public void initDefaultCommand()
    {
    	
    }
        
    public void captureImage()
    {
    	cam.getImage(img);
    	server.getInstance().setImage(img);
    }
    
}