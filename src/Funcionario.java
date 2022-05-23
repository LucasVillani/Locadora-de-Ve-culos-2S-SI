public class Funcionario {
	public String nome;
	public String cargo;
        
        public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
        }
        
        public String getNome(){
        return nome;
        }
        
        public String getCargo(){
        return cargo;
        }
   
        public String infoFuncionario(){
        String info = "\n>Nome: "+nome+"\n>Cargo: "+cargo;
        return info;
        }
        
        
}


