package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository {
    private String JdbURL="jdbc:mysql://localhost:3306/computer_sales";
    private String username="root";
    private String password="root";
    private Connection connection=null;
    protected Statement statment=null;

    public Repository(){
        try{
            connection= DriverManager.getConnection(JdbURL,username,password);
            statment=connection.createStatement();
        }catch (SQLException e){
            System.out.println("eroare conectare baza de date");
        }
    }
    public  void executeStatement(String execute){
        try{
            statment.execute(execute);
        }catch (SQLException exec){
            System.out.println("Nu am reusit"+execute);
            System.out.println(execute);
        }
    }

}
