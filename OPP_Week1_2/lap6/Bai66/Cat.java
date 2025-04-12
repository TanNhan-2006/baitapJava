package Bai66;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() +']';
    }



    @Override
    public void greets() {
        System.out.println("Meow");
    }

}