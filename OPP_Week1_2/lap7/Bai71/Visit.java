package Bai71;
import java.util.Date;
class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        String memberType = customer.getMemberType();
        double serviceDiscount = DiscountRate.getServiceDiscountRate(memberType);
        double productDiscount = DiscountRate.getProductDiscountRate(memberType);
        double discountedServiceExpense = serviceExpense * (1 - serviceDiscount);
        double discountedProductExpense = productExpense * (1 - productDiscount);
        return discountedServiceExpense + discountedProductExpense;
    }

    @Override
    public String toString() {
        return "Visit{customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + "}";
    }
}
