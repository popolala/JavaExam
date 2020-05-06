package Exam3;

public class Qn18 {

    private static boolean isDirection(int ch) {
        switch(ch) {
            case 'N':
            case 'E':
            case 'W':
            case 'S':
                return true;
        }
        return false;
    }


    public static void main(String[] args) {

        char b = 'W';

        switch(b) {
            case 'N':

            case 'E':
                System.out.println("pp");
            case 'W':

            case 'S':
                System.out.println("te");

            default:
                System.out.println("o");
        }
    }

}
