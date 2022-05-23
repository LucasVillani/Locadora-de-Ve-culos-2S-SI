public class Cliente {
	public String nome;
	public String cpf;
	public String endereco;
	public String email;
	public String login;
	public String senha;
        
        public Cliente(String nome, String cpf, String endereco, String email, String login, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.login = login;
        this.senha = senha;
        }
        
        public boolean logar(String login, String senha){
        if (this.login.equals(login) && this.senha.equals(senha)){
        return true;
        }
        else{return false;}
        }
        
        public String getLogin(){
        return login;
        }
        
        public String infoCliente(){
        String info = "<html><br>\nNome: "+nome+"<br>\ncpf: "+cpf+"<br>\nEndereco: "+ endereco+"<br>\nEmail: "+ email;
        return info;
        }
        
        public String getNome(){
        return nome;
        }
} 

