// ========================
// LESSON 2: TURN IN PLACE 
// ========================

public class MyFIRSTJavaOpMode extends LinearOpMode {

    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;
    DcMotor backLeftDrive;
    DcMotor backRightDrive;

    double forward;
    double turn;
    double strafe;

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

        waitForStart();

        // ======================================================
        // LESSON GOAL: Make the robot spin in place to the RIGHT
        // for 1 second.
        // ======================================================

        // Set the variable "turn" to 1.
        // Then call processDriveInputs().

        // Now, how can you specify how long the robot should spin for?
        // Hint: You can tell the robot to wait before processing another input.
        // Hint 2: Check lesson 1 if you're stuck!
    }
}