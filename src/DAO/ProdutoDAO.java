package DAO;

import adega.Conexao;
import Models.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProdutoDAO {
    
    public void inserir(Produto produto){
        String sql = "INSERT INTO produto (nome,descricao,alcoolico,teor,litragem,unidade,preco) " +
                    "VALUES (?,?,?,?,?,?,?)";
        
        try(Connection con = new Conexao().getConnection();PreparedStatement stmt = con.prepareStatement(sql);){
            
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3,produto.getAlcoolico());
            stmt.setDouble(4, produto.getTeor());
            stmt.setDouble(5,produto.getLitragem());
            stmt.setString(6,produto.getUnidade());
            stmt.setDouble(7,produto.getPreco());         
            
            stmt.execute(); 
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados: \n" + ex,"ERRO",JOptionPane.ERROR_MESSAGE);            
        }
    }
    
    public void alterar(Produto produto){
        String sql = "UPDATE produto SET " +
                      "nome = ?, descricao = ?, alcoolico = ?, teor = ?, litragem = ?, unidade = ?, preco = ? " +
                      "WHERE id_produto = ?";
        
        try(Connection con = new Conexao().getConnection();PreparedStatement stmt = con.prepareStatement(sql);){
            
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3,produto.getAlcoolico());
            stmt.setDouble(4, produto.getTeor());
            stmt.setDouble(5,produto.getLitragem());
            stmt.setString(6,produto.getUnidade());
            stmt.setDouble(7,produto.getPreco()); 
            stmt.setInt(8,produto.getId());
            
            stmt.execute(); 
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados: \n" + ex,"ERRO",JOptionPane.ERROR_MESSAGE);            
        }       
    }
    
    public void deletar(int id){
        String sql = "DELETE FROM produto WHERE id_produto  = ? ";
        
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
    
    public List<Produto> retornarLista(){
        String sql = "SELECT id_produto, nome, preco FROM produto";        
       
        List<Produto> produtos = new ArrayList<>();        
        
        try(Connection con = new Conexao().getConnection(); PreparedStatement stmt = con.prepareStatement(sql)){
            
            try(ResultSet rs = stmt.executeQuery()){
            
                while(rs.next())
                {
                    Produto produto = new Produto(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getDouble(3)                        
                    );
                    produtos.add(produto);                
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao coletar dados: \n" + ex.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        return produtos;
    }
    
    public Produto retornar(int id){
        
        Produto produto = null; 
        String sql = "SELECT * FROM produto WHERE id_produto = ?";
        
        try(Connection con = new Conexao().getConnection(); PreparedStatement stmt = con.prepareStatement(sql);){
                        
            stmt.setInt(1, id);           
            
            try (ResultSet rs = stmt.executeQuery()) {
                
                while(rs.next())
                {
                    produto = new Produto(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),                            
                            rs.getDouble(5),
                            rs.getDouble(6),                             
                            rs.getString(7),
                            rs.getDouble(8)
                    );
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao coletar dados: \n" + ex, "ERRO",JOptionPane.ERROR_MESSAGE);
        }
        return produto;
    }
}
