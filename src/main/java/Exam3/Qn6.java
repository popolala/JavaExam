package Exam3;

public class Qn6 {

    enum TrafficLight {
        RED, YELLOW, GREEN;
    }

    public static void main(String[] args) {
        TrafficLight tl = TrafficLight.valueOf(args[1]);
        switch(tl) {
        /*    case TrafficLight.RED:
                System.out.println("STOP");
                break;
            case TrafficLight.YELLOW:
                System.out.println("SLOW");
                break;
            case TrafficLight.GREEN:
                System.out.println("GO");
                break;*/
        }
    }
}
