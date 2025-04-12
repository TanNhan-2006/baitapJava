package Bai46;

public class Animal {
    private String name;

    public Animal() {
    }


    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[" + "name=" + name + ']';
    }


}
