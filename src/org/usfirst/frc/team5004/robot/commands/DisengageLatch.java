package org.usfirst.frc.team5004.robot.commands;

import org.usfirst.frc.team5004.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DisengageLatch extends Command {
	boolean done = false;

    public DisengageLatch() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.latch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.latch.drive(0.5);
    	Timer.delay(0.2);
    	Robot.latch.drive(0.0);
    	done = true;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.latch.drive(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
