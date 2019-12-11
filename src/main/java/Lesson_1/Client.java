package Lesson_1;

public class Client {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Camera camera = assistant.getCamera();
        camera.doPhoto();
    }
}
