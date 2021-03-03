// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestSubsystem2 extends SubsystemBase {
  /** Creates a new TestSubsystem2. */
  private TalonSRX testMotor2;
  private boolean isOn;

  public TestSubsystem2() {
    testMotor2 = new TalonSRX(Constants.testMotorID2);
    isOn = false;
  }

  public void turn(double speed){
    if(isOn){
      testMotor2.set(ControlMode.PercentOutput, 0);
    }else{
      testMotor2.set(ControlMode.PercentOutput, speed);
    }
    isOn = !isOn;
  }
}
