// ================
// LESSON 4: SHOOT
// ================

public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor shootwheel;
    Servo artifactstopper;

    double shootPower = 0.8;

    public void shoot(){
        artifactstopper.setPosition(0);
        shootwheel.setPower(shootPower);
        sleep(250);
        artifactstopper.setPosition(0.2);
        shootwheel.setPower(0);
    }

    public void runOpMode(){
        shootwheel = hardwareMap.get(DcMotor.class,"shootwheel");
        artifactstopper = hardwareMap.get(Servo.class,"artifactstopper");

        waitForStart();

        // ======================================================
        // LESSON GOAL: Fire one artifact.
        // Hint 1: Which function do we need to call?
        // Hint 2: You may need to give the robot some time...
        // Now, think and discuss: Why might that be?
        // ======================================================
    }
}