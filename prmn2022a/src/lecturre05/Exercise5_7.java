package lecturre05;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect[] fly = new Insect[4];
        fly[0] = new Insect();
        fly[1] = new Locust();
        fly[2] = new Butterfly();
        fly[3] = new SwallowtailButterfly();
        for (Insect insect : fly) {
            insect.move();
        }
    }
}
