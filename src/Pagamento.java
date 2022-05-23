public class Pagamento {
	public String nome;
	public int numCartao;
	public int codSeguranca;
        public String email;
        public String cpf;
        public double valor;

        public Pagamento(String nome, int numCartao, int codSeguranca, String email, String cpf, double valor){
        this.nome = nome;
        this.valor = valor;
        this.numCartao = numCartao;
        this.codSeguranca = codSeguranca;
        this.email = email;
        this.cpf = cpf;
        }
        
	public void efetuarPagamento() {
	}
        
        public String infoPagamento(){
        return "<html>Nome: "+ nome +"<br>Número do cartão: "+numCartao+"<br>Código de segurança: "+codSeguranca+"<br>CPF: "+cpf+"<br>E-mail: "+email+"<br>Valor total: R$"+valor+"<br><br>";
        }
}
