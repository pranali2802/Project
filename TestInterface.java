interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Animal a;
        a = new Dog(); // polymorphism
        a.sound();
        a = new Cat(); // polymorphism
        a.sound();
    }
}
