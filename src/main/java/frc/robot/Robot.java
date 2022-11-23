package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
// import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.commands.CharacterizeDrivetrainCommand;
// import frc.robot.commands.ZeroClimberCommand;
// import frc.robot.commands.ZeroHoodCommand;
import frc.robot.util.DriverReadout;

public class Robot extends TimedRobot {
    private final RobotContainer robotContainer = new RobotContainer();

    @SuppressWarnings("unused")
    private final CharacterizeDrivetrainCommand characterizeCommand = new CharacterizeDrivetrainCommand(
            robotContainer.getDrivetrain());

    @SuppressWarnings("unused")
    private final DriverReadout driverReadout = new DriverReadout(robotContainer);

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {
        // robotContainer.getShooter().setHoodBrakeMode(false);
    }

    @Override
    public void disabledExit() {
        // robotContainer.getShooter().setHoodBrakeMode(false);
    }

    @Override
    public void teleopInit() {
        // if (!robotContainer.getClimber().isClimberZeroed()) {
        //     new ZeroClimberCommand(robotContainer.getClimber()).schedule();
        // }
        // if (!robotContainer.getShooter().isHoodZeroed()) {
        //     new ZeroHoodCommand(robotContainer.getShooter(), true).schedule();
        // }
    }

    @Override
    public void testInit() {
        // new InstantCommand(robotContainer.getShooter()::disableFlywheel);
    }

    @Override
    public void autonomousInit() {
        robotContainer.getAutonomousChooser().getCommand(robotContainer).schedule();
        // characterizeCommand.schedule();
    }
}
