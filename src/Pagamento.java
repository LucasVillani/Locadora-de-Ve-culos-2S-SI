public class Pagamento {
    
    String nome;
    int numCartao;
    int codSeguranca;
    String cpf;
    String endereco;
    
    public Pagamento(String nome, int numCartao, int codSeguranca, String cpf, String endereco){
    this.nome = nome;
    this.numCartao = numCartao;
    this.codSeguranca = codSeguranca;
    this.cpf = cpf;
    this.endereco = endereco;
    }
    
    public String infoPagamento(){
    String info = "<html><br>\nNome: "+nome+"<br>\nNúmero do cartão: "+numCartao+"<br>\nCódigo de segurança: "+codSeguranca+"<br>\nCPF: "+cpf+"<br>\nEndereço: "+endereco+"<br>\n";
    return info;
    }
}
