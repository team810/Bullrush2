// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc810.RecycleRushRobot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//public static DigitalInput elevatorWarningSwitch;
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveSystemBackLeft;
    public static SpeedController driveSystemFrontright;
    public static SpeedController driveSystemFrontLeft;
    public static SpeedController driveSystemBackRight;
    public static RobotDrive driveSystemDrive;
    public static AnalogAccelerometer driveSystemAnalogAccelerometer1;
    public static Gyro driveSystemGyro1;
    public static DigitalInput elevatorLowSwitch;
    public static DigitalInput elevatorHighSwitch;
    public static SpeedController elevatorElevatorSpeedController1;
    public static AnalogInput elevatorAnalogPotentiometer1;
    public static Compressor gripperCompressor1;
    public static Solenoid gripperSolenoid1;
    public static BuiltInAccelerometer accelerometer;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    
    public static void init() {
    	
    	driveSystemBackLeft = new CANTalon(4);
        //LiveWindow.addActuator("Drive System", "Back Left", (TalonSRX) driveSystemBackLeft);
        
        driveSystemFrontright = new CANTalon(2);
      //  LiveWindow.addActuator("Drive System", "Front right ", (TalonSRX) driveSystemFrontright);
        
        driveSystemFrontLeft = new CANTalon(3);
      //  LiveWindow.addActuator("Drive System", "Front Left", (TalonSRX) driveSystemFrontLeft);
        
        driveSystemBackRight = new CANTalon(5);    
       // LiveWindow.addActuator("Drive System", "Back Right", (TalonSRX) driveSystemBackRight);
        
        driveSystemDrive = new RobotDrive(driveSystemFrontLeft, driveSystemBackLeft,
              driveSystemFrontright, driveSystemBackRight);
        
        driveSystemDrive.setInvertedMotor(MotorType.kFrontRight, true);	// invert the left side motors
    	driveSystemDrive.setInvertedMotor(MotorType.kRearRight, true);	
    	
    	//elevatorWarningSwitch = new DigitalInput(7);
    	//LiveWindow.addSensor("Elevator", "Warning Switch", elevatorWarningSwitch);
       
       
     // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
      
        
        driveSystemDrive.setSafetyEnabled(true);
        driveSystemDrive.setExpiration(0.1);
        driveSystemDrive.setSensitivity(0.5);
        driveSystemDrive.setMaxOutput(1.0);

        //driveSystemAnalogAccelerometer1 = new AnalogAccelerometer(2);
        //LiveWindow.addSensor("Drive System", "AnalogAccelerometer 1", driveSystemAnalogAccelerometer1);
        //driveSystemAnalogAccelerometer1.setSensitivity(0.0);
        //driveSystemAnalogAccelerometer1.setZero(2.5);
        driveSystemGyro1 = new Gyro(0);
        LiveWindow.addSensor("Drive System", "Gyro 1", driveSystemGyro1);
        driveSystemGyro1.setSensitivity(0.007);
        elevatorLowSwitch = new DigitalInput(9);
        LiveWindow.addSensor("Elevator", "Low Switch", elevatorLowSwitch);
        
        
        elevatorHighSwitch = new DigitalInput(8);
        LiveWindow.addSensor("Elevator", "High Switch", elevatorHighSwitch);
        
        elevatorElevatorSpeedController1 = new Talon(2);
        LiveWindow.addActuator("Elevator", "Elevator Speed Controller 1", (Talon) elevatorElevatorSpeedController1);
        
        //elevatorAnalogPotentiometer1 = new AnalogInput(1);
        //LiveWindow.addSensor("Elevator", "Analog Potentiometer 1", elevatorAnalogPotentiometer1);
        
        gripperCompressor1 = new Compressor(0);
        
        
        gripperSolenoid1 = new Solenoid(0, 0);
        LiveWindow.addActuator("Gripper", "Solenoid 1", gripperSolenoid1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        accelerometer= new BuiltInAccelerometer();
        LiveWindow.addSensor("Accelerometer", "Built in Accelerometer", accelerometer);
    }
}
