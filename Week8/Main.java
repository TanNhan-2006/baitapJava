import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerDAO customerDAO = new CustomerDAO();
        OrderDAO orderDAO = new OrderDAO();

        while (true) {
            System.out.println("\n=== HỆ THỐNG QUẢN LÝ ĐƠN HÀNG ===");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Xem danh sách khách hàng");
            System.out.println("3. Thêm đơn hàng");
            System.out.println("4. Xem lịch sử đơn hàng của khách hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String name = scanner.nextLine();
                    customerDAO.addCustomer(name);
                    break;
                case 2:
                    customerDAO.listCustomers();
                    break;
                case 3:
                    System.out.print("Nhập ID khách hàng: ");
                    int customerId = scanner.nextInt();
                    orderDAO.addOrder(customerId);
                    break;
                case 4:
                    System.out.print("Nhập ID khách hàng: ");
                    int historyId = scanner.nextInt();
                    orderDAO.getOrderHistory(historyId);
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
