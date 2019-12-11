package Lesson_1;

public class Camera {
    private ICameraRoll cameraRoll;

    public void setCameraRoll(ICameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhoto () {
        System.out.println("click");
        cameraRoll.processing();
    }
}
