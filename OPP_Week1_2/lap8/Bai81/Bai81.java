package Bai81;

public class Bai81 {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);

        for (int i = 1; i <= 6; i++) {
            boolean result = stack.push(i);
            System.out.println("Push " + i + ": " + (result ? "Success" : "Failed (Stack Full)"));
        }

        stack.ensureCapacity();
        System.out.println("Capacity increased.");

        stack.push(6);
        System.out.println("Push 6: Success");

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}