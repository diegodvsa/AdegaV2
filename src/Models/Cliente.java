package Models;

import java.util.Date;
import DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    
    private int id_cliente;
    private String nome;    
    private int idade;
    private String cep;
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    
    public Cliente(){}
    
    public Cliente(int id, String nome, int idade, String cep, 
            String logradouro, int numero, String bairro, String cidade, String estado){
        
        this.id_cliente = id;
        this.nome = nome;        
        this.idade = idade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;        
    }
    
    public Cliente(int id, String nome, int idade){
        this.id_cliente = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id_cliente;
    }

    public void setId(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setData_nascimento(int idade) {
        this.idade = idade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void inserir(){        
        new ClienteDAO().inserir(this);
    }
    
    public void alterar(){
        
        new ClienteDAO().alterar(this);
    }    
    
    public void deletar(){        
        new ClienteDAO().deletar(this.getId());
    }
    
    public List<Cliente> retornarLista(){        
        return new ClienteDAO().retornarLista();        
    }
    
    public Cliente retornar(int id){
        
        return new ClienteDAO().retornar(id);
    }
            
}
