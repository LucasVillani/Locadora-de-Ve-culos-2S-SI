public class Pedido_para_Fornecedor {
	public int idPedido;
	public double valor;
	public boolean situacao_Pagamento;
	public String forma_de_Pagamento;

        public Pedido_para_Fornecedor(int idPedido, double valor, String forma_de_Pagamento){
            this.idPedido = idPedido;
            this.valor = valor;
            this.forma_de_Pagamento = forma_de_Pagamento;
        
        }
        
	public void selecionar() {
	}
	
	public void exibir() {
	}
}
