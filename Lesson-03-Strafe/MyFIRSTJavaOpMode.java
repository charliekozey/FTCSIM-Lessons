// ================
// LESSON 3: STRAFE
// ================

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
        // LESSON GOAL: Make the robot strafe to the LEFT for 2
        // seconds.
        // ======================================================

        // Remember our steps:
        // 1. Set the new value for "strafe" and process drive inputs
        // 2. Tell the program to wait
        // 3. Set the new value to zero and process inputs again
        // Check previous lessons if stuck!

    }
}