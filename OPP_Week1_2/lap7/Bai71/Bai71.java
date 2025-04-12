package Bai71;

import java.util.Date;

public class Bai71 {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        customer.setMember(true);
        customer.setMemberType("premium");

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);

        System.out.println("Customer: " + visit.getName());
        System.out.println("Total Expense: " + visit.getTotalExpense());
    }
}
