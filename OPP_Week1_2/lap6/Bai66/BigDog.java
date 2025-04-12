package Bai66;

public class BigDog extends Dog{

    public BigDog() {
    }

    public BigDog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BigDog[" + super.toString() + ']';
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}