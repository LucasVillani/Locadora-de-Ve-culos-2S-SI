
import org.joda.time.LocalDate;

public class Pedido_do_Cliente {
	public int idPedido;
        public Cliente cliente;
	public double valor;
	public boolean statusEntrega;
        public Pagamento pagamento;
        public LocalDate dataPedido;
        public CarrinhoCompras produtosCarrinho;
        public String enderecoEntrega;
        public String cepEntrega;
        
        public Pedido_do_Cliente(int idPedido, CarrinhoCompras produtosCarrinho, Cliente cliente){
            this.idPedido = idPedido;
            this.valor = produtosCarrinho.getValorTotal();
            statusEntrega = false;
            dataPedido = LocalDate.now();
            this.produtosCarrinho= produtosCarrinho;
            this.cliente = cliente;
            cepEntrega = produtosCarrinho.getCep();
            
        
        }
        
	public void setPagamento(Pagamento pagamento) {
            this.pagamento = pagamento;
	}
	
	public void atualizarStatus() {
            if(statusEntrega){
            statusEntrega=false;
            }
            else{
            statusEntrega=true;
            }
	}
        
        public String infoPedido(){
        return "<html><br>>Dados pessoais<br>"+cliente.infoCliente()+"<br><br><br>>Dados produtos<br> "+produtosCarrinho.infoCarrinho()+"<br>>Infomações pagamento<br>"+pagamento.infoPagamento()+">Dados da entrega <br>Endereço: "+enderecoEntrega+"<br>CEP: "+cepEntrega+"<br>";
        }
        
        public String getLoginCliente(){
        return cliente.getLogin();
        }
        
        public void setEndereco(String endereco){
        enderecoEntrega = endereco;
        }
}
