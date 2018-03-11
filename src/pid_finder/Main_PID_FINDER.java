package pid_finder;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team5263.robot.subsystems.*;
import org.usfirst.frc.team5263.robot.commands.*;

public class Main_PID_FINDER extends CommandGroup{
	public Main_PID_FINDER() {
		addSequential(new DriveTo(2, .4, 0, 5));
		double target = target();
		double encoderInches = (getLeftEncoderInch() + getRightEncoderInch()) / 2;
		
		double diff = target - encoderInches;
		
		if(diff >= 0) {
			//POSITIVE
		}else if(diff < 0) {
			//NEGITIVE
		}
	}
	
	public static double target() {
    	//Where we want to be - DriveTo
    	return DriveTo.encoderGet();
    }
    
    public double getLeftEncoderInch(){
    	//What the value is of the leftEncoder
    	return DriveTrain.sharedInstance().getLeftEncoderInches();
    }
    
    public double getRightEncoderInch() {
    	//What the value is of the rightEncoder
    	return DriveTrain.sharedInstance().getRightEncoderInches();
    }
    
    public double getLeftOffset() {
    	return DriveTo.leftCorrectionOffset;
    }
    
    public double getRightOffset() {
    	return DriveTo.rightCorrectionOffset;
    }
}
