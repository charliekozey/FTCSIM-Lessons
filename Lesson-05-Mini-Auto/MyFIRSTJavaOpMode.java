// ===================
// LESSON 5: MINI AUTO
// ===================

public class MyFIRSTJavaOpMode extends LinearOpMode {

    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;
    DcMotor backLeftDrive;
    DcMotor backRightDrive;
    DcMotor shootwheel;
    Servo artifactstopper;

    double forward;
    double turn;
    double strafe;

    public void processDriveInputs(){
        frontLeftDrive.setPower(forward + turn + strafe);
        frontRightDrive.setPower((forward - turn) - strafe);
        backLeftDrive.setPower((forward + turn) - strafe);
        backRightDrive.setPower((forward - turn) + strafe);
    }

    public void stopDriving(){
        forward = 0;
        turn = 0;
        strafe = 0;
        processDriveInputs();
    }

    public void driveForward(int time){
        forward = 1;
        processDriveInputs();
        sleep(time);
        stopDriving();
    }

    public void driveBackward(int time){
        forward = -1;
        processDriveInputs();
        sleep(time);
        stopDriving();
    }

    public void turnRight(int time){
        turn = 1;
        processDriveInputs();
        sleep(time);
        stopDriving();
    }

    public void turnLeft(int time){
        turn = -1;
        processDriveInputs();
        sleep(time);
        stopDriving();
    }

    public void strafeRight(int time){
        strafe = 1;
        processDriveInputs();
        sleep(time);
        stopDriving();
    }

    public void strafeLeft(int time){
        strafe = -1;
        processDriveInputs();
        sleep(time);
        stopDriving();
    }

    public void shoot(double power){
        sleep(500);
        artifactstopper.setPosition(0);
        shootwheel.setPower(power);
        sleep(250);
        artifactstopper.setPosition(0.2);
        shootwheel.setPower(0);
    }

    public void runOpMode(){
        frontLeftDrive = hardwareMap.get(DcMotor.class,"frontLeftDrive");
        frontRightDrive = hardwareMap.get(DcMotor.class,"frontRightDrive");
        backLeftDrive = hardwareMap.get(DcMotor.class,"backLeftDrive");
        backRightDrive = hardwareMap.get(DcMotor.class,"backRightDrive");
        shootwheel = hardwareMap.get(DcMotor.class,"shootwheel");
        artifactstopper = hardwareMap.get(Servo.class,"artifactstopper");

        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        // FINAL MINI MISSION
        // Complete the autonomous routine.
        // STEPS:
        // 1 Drive forward until the robot is in the large scoring zone
        // 2 Stop
        // 3 Manually aim at a goal
        // 4 Fire the shooter

        // YOUR CODE BELOW:

    }
}