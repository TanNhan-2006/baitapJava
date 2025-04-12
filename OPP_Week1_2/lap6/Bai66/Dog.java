package Bai66;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() +']';
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

}
