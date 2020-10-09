
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConnectionFactory {

public static Connection getConexao(){
  String url = "jdbc:mysql://localhost:3306/VENDAS?useSSL-false";
  String user="root";
  String password="Nivaldo";
  
  try{
       
      Class .forName("com.mysql.jdbc.Driver");
      return 
      DriverManager.getConnection(url,user,password);
  } catch (SQLException e){
      e.printStackTrace();
  } catch (ClassNotFoundException ex) {
     
    }
     return null; 
}
      
      public static void fecharConexao(Connection connection){
          
         
          
          try {
             
              
              
              if (connection!=null)
                  
              connection.close();
              
              
          } 
          
          catch(SQLException e){
                      e.printStackTrace();

                      }
          }
      
      }
      
  


