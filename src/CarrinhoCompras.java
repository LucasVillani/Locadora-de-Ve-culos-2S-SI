
import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CarrinhoCompras {
	public double valor;
        public ItemCarrinhoCompras [] itens = new ItemCarrinhoCompras[30];
        public int numItens;
        public String cep;
        
        public CarrinhoCompras(){
        valor = 0;
        numItens = 0;
        }
        
        
        
	public void addItem(ItemCarrinhoCompras item) {
        int idItemExistente=0;
        boolean itemExistente = false;
        if(numItens==0){
            itens[numItens] = item;
            numItens++;
        }
        else{
        for (int i=0; i<numItens; i++){
            if(itens[i].getId()== item.getId()){
                itemExistente = true;
                idItemExistente=i;
	}
        }
        
        if(itemExistente){
            itens[idItemExistente].addQuantidade(item.getQuantidade());
        }
        else{
            itens[numItens] = item;
            numItens++;
        }
        }
        for (int i=0; i<numItens; i++){
            this.valor+=itens[i].getValor();
        }
        }
        
        public String infoCarrinho(){
            String info="";
            for(int i=0; i<numItens; i++){
                info+=itens[i].infoItemCarrinho();
            }
            return info;
        }
        
	public double getValorTotal() {
            double valorTotal = 0;
            for(int i=0; i<numItens; i++){
                valorTotal+=itens[i].getValor();
            }
            return valorTotal;
	}
	
        public boolean validarEndereco(String cep){
            ViaCEP viaCEP = new ViaCEP();
            try {
                viaCEP.buscar(cep);
                if(viaCEP.getLocalidade().equals("São Paulo")){
                    this.cep = cep;
                    return true;
                } 
                else{
                    return false;
                }
            }catch (ViaCEPException ex) {
                Logger.getLogger(CarrinhoCompras.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            }
        
        public String getCep(){
        return cep;
        }
        
        public int getNumItens(){
        return numItens;
        }
        
        }
	

