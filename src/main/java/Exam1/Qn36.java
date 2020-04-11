package Exam1;

//Wrong way of declaring functional Interface. Cannot put Type parameter
/*interface Operation<T>{
    T operate(T x, T y);
}*/

interface Operation {
    int operate(int x , int y) ;
}

public class Qn36 {
    public static void main(String[] args) {
        Operation o1 = (x, y) -> x + y;
        System.out.println(o1.operate(5, 10));
    }
}

//When you put a Type parameter at first , it is denote as an Object until a specify type is being declare during implementation.