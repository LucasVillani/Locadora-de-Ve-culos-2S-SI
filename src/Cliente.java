public class Cliente {
	public String nome;
	public String cpf;
        public String email;
	public String endereco;
	public String login;
	public String senha;
	
        public Cliente(String nome,String email, String cpf, String endereco, String login, String senha){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
        }
        
        public boolean validarLogin(String login, String senha){
            if(this.login.equals(login)&& this.senha.equals(senha)){
            return true;
            }
            else{return false;}
        }
        
        public String getLogin(){
            return login;
        }
        
        public String getNome(){
            return nome;
        }
        
        public String infoCliente(){
        return "<html>Nome: "+nome+"<br>E-mail: "+email+"<br>CPF: "+cpf+"<br>Endereço: "+endereco+"<br>Login: "+login;
        }
}
