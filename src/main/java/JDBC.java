
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {
    public static void main(String[] args) throws SQLException {

        try (Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDoList",
                "postgres","Marty.950")){
            if(conn != null){
                System.out.println("Connected to the database!");
            }else{
                System.out.println("Faild to make connection!");
            }






        }

    }
}
