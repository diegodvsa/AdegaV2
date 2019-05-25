package Models;

public class Usuario {
    
    private int id_usuario;
    private String login;
    private String senha;
    
    public Usuario(){}
    
    public Usuario(int id, String login, String senha){
        this.id_usuario = id;
        this.login = login;
        this.senha = senha;
    }
    
    
    public int getId(){
        return id_usuario;
    }
    
    public void setId(int id){
        id_usuario = id;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
}
