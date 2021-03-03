// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.TestCommand;
import frc.robot.subsystems.TestSubsystem;
import frc.robot.subsystems.TestSubsystem2;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static TestSubsystem testSubsystem = new TestSubsystem();
  public static TestSubsystem2 testSubsystem2 = new TestSubsystem2();
  
  public static XboxController driverController;
  public static XboxController operatorController;
  public static JoystickButton backButtonDriver;
  public static JoystickButton yButtonDriver;
  public static JoystickButton rightBumperDriver;
  public static JoystickButton yButtonOperator;
  public static JoystickButton xButtonOperator;
  public static JoystickButton aButtonOperator;
  public static JoystickButton bButtonOperator;
  public static JoystickButton backButtonOperator;
  public static JoystickButton startButtonOperator;
  public static JoystickButton leftBumperOperator;
  public static JoystickButton rightBumperOperator;
  public static JoystickButton aButtonDriver;
  public static JoystickButton bButtonDriver;
  public static JoystickButton xButtonDriver;
  public static JoystickButton startButtonDriver;
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    aButtonDriver.whenPressed(new TestCommand());
    // bButtonDriver.whenPressed(new TestCommand2());
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    driverController = new XboxController(Constants.driverControllerId);
    operatorController = new XboxController(Constants.operatorControllerId);

    // name buttons to include which controller
    backButtonDriver = new JoystickButton(driverController, 7);
    yButtonDriver = new JoystickButton(driverController, 4);
    rightBumperDriver = new JoystickButton(driverController, 6);
    yButtonOperator = new JoystickButton(operatorController, 4);
    xButtonOperator = new JoystickButton(operatorController, 3);
    aButtonOperator = new JoystickButton(operatorController, 1);
    bButtonOperator = new JoystickButton(operatorController, 2);
    backButtonOperator = new JoystickButton(operatorController, 7);
    startButtonOperator = new JoystickButton(operatorController, 8);
    leftBumperOperator = new JoystickButton(operatorController, 5);
    rightBumperOperator = new JoystickButton(operatorController, 6);
    aButtonDriver = new JoystickButton(driverController, 1);
    bButtonDriver = new JoystickButton(driverController, 2);
    xButtonDriver = new JoystickButton(driverController, 3);
    startButtonDriver = new JoystickButton(driverController, 8);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
