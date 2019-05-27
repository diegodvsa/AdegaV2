 
package Models;

import java.util.Date;
import DAO.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    
    private int id_produto;
    private String nome;
    private String descricao;
    private String alcoolico;
    private double teor;
    private double litragem;
    private String unidade;
    private double preco;
    
    public Produto(){}
    
    public Produto(int id, String nome, String descricao, String alcoolico,
                    double teor, double litragem, String unidade, double preco){
        
        this.id_produto = id;
        this.nome = nome;
        this.descricao = descricao;
        this.alcoolico = alcoolico;
        this.teor = teor;
        this.litragem = litragem;
        this.unidade = unidade;
        this.preco = preco;
    }
    
    public Produto(int id, String nome, double preco){
        this.id_produto = id;
        this.nome = nome;
        this.preco = preco;
    }
        
    public int getId() {
        return id_produto;
    }

    public void setId(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAlcoolico() {
        return alcoolico;
    }

    public void setAlcoolico(String alcoolico) {
        this.alcoolico = alcoolico;
    }

    public double getTeor() {
        return teor;
    }

    public void setTeor(double teor) {
        this.teor = teor;
    }

    public double getLitragem() {
        return litragem;
    }

    public void setLitragem(double litragem) {
        this.litragem = litragem;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void inserir(){
        new ProdutoDAO().inserir(this);        
    }
    
    public void alterar(){
        new ProdutoDAO().alterar(this);
    }
    
    public void deletar(){        
        new ProdutoDAO().deletar(this.getId());
    }
    
    public List<Produto> retornarLista(){
        return new ProdutoDAO().retornarLista();
    }
    
    public Produto retornar(int id){
        return new ProdutoDAO().retornar(id);
    }
}
