import java.sql.*;
class EmployeeDB {
    public static void main(String[] args) {
        try {
            // 1. Load Driver (MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company", "root", "password"
            );
            System.out.println("Connected to Database!");
            // 3. Insert Data
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO employee(name, salary) VALUES('John', 50000)");
            // 4. Fetch Data
            ResultSet rs = st.executeQuery("SELECT * FROM employee");
            System.out.println("ID\tName\tSalary");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getDouble("salary")
                );
            }
            // 5. Close Connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


