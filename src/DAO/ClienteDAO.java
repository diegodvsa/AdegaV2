
package DAO;

import adega.Conexao;
import Models.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author ddevesa
 */
public class ClienteDAO {
    
    public void inserir(Cliente cliente){
        String sql = "INSERT INTO cliente " +
                "(nome, data_nascimento, cep, logradouro, numero, bairro, cidade, estado) " +
                "VALUES (?,?,?,?,?,?,?,?)";
        
        try(Connection con = new Conexao().getConnection();PreparedStatement stmt = con.prepareStatement(sql);){
            
            stmt.setString(1, cliente.getNome());
            stmt.setDate(2, (Date) cliente.getData_nascimento());
            stmt.setString(3,cliente.getCep());
            stmt.setString(4, cliente.getLogradouro());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getBairro());
            stmt.setString(7,cliente.getCidade());
            stmt.setString(8, cliente.getEstado());
            
            stmt.execute(); 
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados: \n" + ex,"ERRO",JOptionPane.ERROR_MESSAGE);            
        }
    }
    
    public void alterar(Cliente cliente){
        String sql = "UPDATE cliente SET " +
                      "nome = ?, data_nascimento = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ? " +
                      "WHERE id_cliente = ?";
        
        try(Connection con = new Conexao().getConnection();PreparedStatement stmt = con.prepareStatement(sql);){
            
            stmt.setString(1, cliente.getNome());
            stmt.setDate(2, (Date) cliente.getData_nascimento());
            stmt.setString(3,cliente.getCep());
            stmt.setString(4, cliente.getLogradouro());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getBairro());
            stmt.setString(7,cliente.getCidade());
            stmt.setString(8, cliente.getEstado());
            stmt.setInt(9,cliente.getId());
            
            stmt.execute(); 
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados: \n" + ex,"ERRO",JOptionPane.ERROR_MESSAGE);            
        }       
    }
    
    public void deletar(int id){
        String sql = "DELETE FROM cliente WHERE id_cliente  = ? ";
        
        try(Connection con = new Conexao().getConnection();PreparedStatement stmt = con.prepareStatement(sql);)
        {
            //atribuição dos parametros da consulta sql 
            stmt.setInt(1, id);
            
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso!");             
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ao deletar dados: \n" + ex.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }        
    }
            
    public List<Cliente> retornarLista(){
        String sql = "SELECT id_cliente, nome, data_nascimento FROM cliente";        
       
        List<Cliente> clientes = new ArrayList<>();        
        
        try(Connection con = new Conexao().getConnection(); PreparedStatement stmt = con.prepareStatement(sql)){
            
            try(ResultSet rs = stmt.executeQuery()){
            
                while(rs.next())
                {
                    Cliente cliente = new Cliente(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getDate(3)                        
                    );
                    clientes.add(cliente);                
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao coletar dados: \n" + ex.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        return clientes;
    }
    
    public Cliente retornar(int id){
        
        Cliente cliente = null; 
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        
        try(Connection con = new Conexao().getConnection(); PreparedStatement stmt = con.prepareStatement(sql);){
                        
            stmt.setInt(1, id);           
            
            try (ResultSet rs = stmt.executeQuery()) {
                
                while(rs.next())
                {
                    cliente = new Cliente(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getDate(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6),
                            rs.getString(7),                             
                            rs.getString(8),
                            rs.getString(9)
                    );
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao coletar dados: \n" + ex, "ERRO",JOptionPane.ERROR_MESSAGE);
        }
        return cliente;
    }
}
