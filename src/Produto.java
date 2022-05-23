public class Produto {
	public int idProduto;
	public int quantidade;
	public double preco;
	public String descricao;
        public String nome;

        public Produto(int idProduto,String nome, int quantidade, double preco, String descricao){
            this.idProduto = idProduto;
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
            this.descricao = descricao;
        }
        
        public int getQuantidade(){
        return quantidade;
        }
        
        public String infoProduto(){
        String info = "<html>>Id: "+idProduto+"<br>>Nome: "+nome+"<br>>Quantidade disponível: "+quantidade+"<br>>Preço: R$"+preco+"<br>>Descrição: "+descricao+"<br><br>";
        return info;
        }
        
        public String infoProdutoCat(){
        String info = "<html>>Nome: "+nome+"<br>>Preço: R$"+preco+"<br>>Descrição: "+descricao+"<br>>Quantidade disponível: "+quantidade+"<br><br>";
        return info;
        }
        
        public String getNome(){
        return nome;
        }
        
        public double getPreco(){
        return preco;
        }
        
        public void atualizarQtd(int i){
        quantidade+=i;
        }
        
        public int getId(){
        return idProduto;
        }
}
