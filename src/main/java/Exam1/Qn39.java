package Exam1;

public class Qn39 {

        private int num1 = 100;

        class N {
            private int num2 = 200;
        }

        public static void main(String[] args) {
            Qn39 outer = new Qn39();
            Qn39.N inner = outer.new N();

            System.out.println(outer.num1 + inner.num2);
        }


}
