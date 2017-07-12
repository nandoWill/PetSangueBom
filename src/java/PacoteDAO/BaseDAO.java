package PacoteDAO;

import java.sql.Connection;
 
import java.sql.DriverManager;
 
import java.sql.SQLException;

/**
 *
 * @author biscoito
 */
public final class BaseDAO {

    private static BaseDAO instance;
    public static BaseDAO getInstance() {
        return instance == null ? instance = new BaseDAO() : instance;
    }
     
    public static java.sql.Connection getConexaoMySQL() {
 
        Connection connection = null;          
 
    try {
 
        String driverName = "com.mysql.jdbc.Driver";                        
 
        Class.forName(driverName);
            String serverName = "localhost:3306/PetSangueBom";    //caminho do servidor do BD  
            String url = "jdbc:mysql://" + serverName; 
            String username = "root";        //nome de um usuário de seu BD 
            String password = "12345";      //sua senha de acesso 
            connection = DriverManager.getConnection(url, username, password);
            
        return connection; 
        } catch (ClassNotFoundException e) {  //Driver não encontrado 
            System.out.println("O driver expecificado nao foi encontrado."); 
            return null; 
        } catch (SQLException e) { 
            System.out.println("Nao foi possivel conectar ao Banco de Dados."); 
            return null;
         } 
    }
        public static boolean FecharConexao() { 
        try { 
            BaseDAO.getConexaoMySQL().close(); 
            return true; 
        } catch (SQLException e) { 
            return false;
        } 
    }
        
        public static java.sql.Connection ReiniciarConexao(){
           BaseDAO.FecharConexao();
           return BaseDAO.getConexaoMySQL();
        }
}    
    

