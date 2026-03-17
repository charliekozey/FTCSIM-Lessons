// ========================
// LESSON 1: DRIVE FORWARD
// ========================

public class MyFIRSTJavaOpMode extends LinearOpMode {

    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;
    DcMotor backLeftDrive;
    DcMotor backRightDrive;

    double forward;
    double turn;
    double strafe;
    double maxDrivePower;


    public void processDriveInputs(){
        frontLeftDrive.setPower(forward + turn + strafe);
        frontRightDrive.setPower((forward - turn) - strafe);
        backLeftDrive.setPower((forward + turn) - strafe);
        backRightDrive.setPower((forward - turn) + strafe);
    }

    public void runOpMode(){

        frontLeftDrive = hardwareMap.get(DcMotor.class,"frontLeftDrive");
        frontRightDrive = hardwareMap.get(DcMotor.class,"frontRightDrive");
        backLeftDrive = hardwareMap.get(DcMotor.class,"backLeftDrive");
        backRightDrive = hardwareMap.get(DcMotor.class,"backRightDrive");

        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);

        maxDrivePower = 1;

        waitForStart();

        // ==========================================
        // LESSON GOAL: Make the robot drive forward 
        // for 2 seconds.
        // ==========================================

        // Set the variable "forward" to 1 and call processDriveInputs().

        
        // Use sleep() to make the program wait for 2 seconds.


        // Set the variable "forward" 0 to make it stop and call processDriveInputs() again.
    }
}