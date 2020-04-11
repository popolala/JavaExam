package Exam1;

class Parent {
    public void eat() throws Exception{
        System.out.println("Eating");
    }
}

class Child extends Parent{
    public void eat(){
        System.out.println("Eating mee");
    }

    public void drink(){
        System.out.println("Drinking");
    }
}


public class Inheritance {

    public static void main(String[] args) {
        Parent p = new Child(); //wrong as Parent referencing has a exception
       //p.eat();

        Child c = new Child(); // nothing wrong as child referencing has no exception
        c.eat();
    }
}
