import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDAO {
    public void addOrder(int customerId) {
        String query = "INSERT INTO Orders (customer_id) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, customerId);
            stmt.executeUpdate();
            System.out.println("Đã thêm đơn hàng cho khách hàng ID: " + customerId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getOrderHistory(int customerId) {
        String query = """
            SELECT o.id AS Order_ID, o.order_date, SUM(p.price * oi.quantity) AS Total_Price
            FROM Orders o
            JOIN Order_Items oi ON o.id = oi.order_id
            JOIN Products p ON oi.product_id = p.id
            WHERE o.customer_id = ?
            GROUP BY o.id, o.order_date;
        """;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            System.out.println("Lịch sử đơn hàng của khách hàng ID: " + customerId);
            while (rs.next()) {
                System.out.println("🛒 Đơn hàng #" + rs.getInt("Order_ID") +
                        " | Ngày: " + rs.getTimestamp("order_date") +
                        " | Tổng tiền: " + rs.getDouble("Total_Price") + " VND");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
