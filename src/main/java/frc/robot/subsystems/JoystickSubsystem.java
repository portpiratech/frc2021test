// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class JoystickSubsystem extends SubsystemBase {
  /** Creates a new JoystickSubsystem. */
  private TalonSRX bob;
  public JoystickSubsystem() {
    bob = new TalonSRX(Constants.testMotorID2);
  }

  public void motorTurn(){
    double y = RobotContainer.driverController.getY(Hand.kLeft);
    bob.set(ControlMode.PercentOutput, y*0.4);
  }
}
