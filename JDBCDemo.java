import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "your_password"; // apna actual MySQL password likho

        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Step 5: Process Result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + "  " + name + "  " + age);
            }

            // Step 6: Close Connections
            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver not found. Please add mysql-connector-j.jar to your classpath.");
        } catch (SQLException e) {
            System.out.println("❌ Database connection or query failed.");
            e.printStackTrace();
        }
    }
}
