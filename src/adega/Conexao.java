package adega;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection getConnection()
    {
        try{
            Connection conexao = DriverManager.getConnection("jdbc:sqlite:Adega.db");
            return conexao;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte de dados: \n" + ex.getMessage());
        }
        return null;
    }
    
    
}
