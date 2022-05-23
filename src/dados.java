public class dados {
    
    static Cliente usuarioLogado;
    static CarrinhoCompras carrinhoCliente;
    static ItemCarrinhoCompras itemCliente;
    
    public static Cliente[] clientes = new Cliente[50];
    public static int numClientes = 1;
    
    public static Pedido_do_Cliente[] pedidosCliente = new Pedido_do_Cliente[50];
    public static int numPedidosCliente = 0;
    
    public static Produto[] produtos = new Produto[50];
    public static int numProdutos = 5;
    

public dados(){

        clientes[0] = new Cliente("admin","admin","admin","admin","admin","admin");
        produtos[0] = new Produto(0, "Nescau", 10, 5.0, "Achocolatado");
        produtos[1] = new Produto(1, "Coca-Cola 2L", 6, 10, "Refrigerante");
        produtos[2] = new Produto(2, "Molho de tomate", 0, 10, "Molho");
        produtos[3] = new Produto(3, "Saco Feijão 1kg", 6, 2, "Feijão");
        produtos[4] = new Produto(4, "Saco arroz 1 kg", 10, 5, "Arroz");

}


}