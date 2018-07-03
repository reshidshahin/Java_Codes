package baglaniram;
import java.sql.*;

public class BAGLANIRAM {
    public static void main(String[] args) {
        try {
            // 1. Connection to DB
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projelerim", "root", "AA12345aa!");

            // 2. Create statement
            Statement myStmt = myConn.createStatement();

            // 1. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM world.countrylanguage;");

            // 1. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("CountryCode") + " ----- " + myRs.getString("Language")+ " ----- " + myRs.getFloat("Percentage"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
