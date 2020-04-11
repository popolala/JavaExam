package Exam1;

//Type Parameter hence should follow the naming convention (Uppercase single character) for type parameter. But in this case, although it does not follow, it still works.
class Printer<String> {
    private String t;
    Printer(String t){
        this.t = t;
    }
}

public class Qn16 {
    public static void main(String[] args) {
        Printer<Integer> obj = new Printer<>(100);
        System.out.println(obj);
    }
}
