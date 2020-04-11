package Exam1;


public class Qn21_ {
    public interface I1 {
        void m1() throws java.io.IOException;
    }

    public class c1 implements I1 {
        public void m1() {}
    }

    public class c2 implements I1 {
        public void m1() throws java.io.FileNotFoundException{}
    }

    public class c3 implements I1 {
        public void m1() throws java.io.IOException{}
    }

    //wrong implementation
    /*public class c4 implements I1 {
        public void m1() throws Exception{}
    }*/
}

/*
According to overriding rules, if super class / interface method declares to throw a checked exception, then overriding method of sub class / implementer class has following options:

1. May not declare to throw any checked exception,
2. May declare to throw the same checked exception thrown by super class / interface method,
3. May declare to throw the sub class of the exception thrown by super class / interface method,
4. Cannot declare to throw the super class of the exception thrown by super class / interface method.
 */