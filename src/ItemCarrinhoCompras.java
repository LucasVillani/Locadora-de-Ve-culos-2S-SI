public class ItemCarrinhoCompras {
	public int quantidade;
	public double valorTotal;
        public Produto produto;
        
        public ItemCarrinhoCompras(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
        valorTotal = this.quantidade * this.produto.getPreco();

        
        }
        
	public void addQuantidade(int qtd) {
            this.quantidade+=qtd;
            valorTotal = this.quantidade * this.produto.getPreco();
	}
	
        public int getQuantidade(){
        return quantidade;
        }
        
        public double getValor(){
            return valorTotal;
        }
        
        public String infoItemCarrinho(){
            String info = "<html>>"+produto.getNome()+"<br>Quantidade: "+quantidade+"<br>Valor: R$"+valorTotal+"<br><br>";
            return info;
        }
        
        public int getId(){
        return produto.getId();
        }
	public void remover() {
	}
}
