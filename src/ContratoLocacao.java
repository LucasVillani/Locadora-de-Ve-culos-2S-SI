import org.joda.time.*;
import java.util.Date;
public class ContratoLocacao {
	public LocalDate dataPedido;
	public Days periodoLocacao;
	public int id;
	public Veiculo veiculo;
	public double valor;
	public Cliente cliente;
        public LocalDate dataFinalLocacao;
        public LocalDate dataInicioLocacao;
        public Pagamento pagamento;
        
        public ContratoLocacao(LocalDate data,int id,Veiculo veiculo, Cliente cliente, LocalDate dataInicioLocacao, LocalDate dataFinalLocacao){ 
        this.dataPedido = data;
        this.dataInicioLocacao = dataInicioLocacao ;
        this.dataFinalLocacao = dataFinalLocacao;
        this.periodoLocacao = Days.daysBetween(dataInicioLocacao,dataFinalLocacao);
        this.id = id;
        this.veiculo = veiculo;
        this.valor = periodoLocacao.getDays() * veiculo.getValorDiaria();
        this.cliente = cliente;
        
        }
        
        public boolean validarData(LocalDate dataFinal){
        int i = dataInicioLocacao.compareTo(dataFinal);
        int j = dataInicioLocacao.compareTo(LocalDate.now());
        if (i==-1 && j!=-1){return true;}
        return false;
        }
        
        public String getLoginCliente(){
        return cliente.getLogin();
        }
        public String getDatas(){
        return "\n>Data do inicio da locação: "+dataInicioLocacao.getDayOfMonth()+"/"+dataInicioLocacao.getMonthOfYear()+"/"+dataInicioLocacao.getYear()+
                      "\n>Data do fim da locação: "+dataFinalLocacao.getDayOfMonth()+"/"+dataFinalLocacao.getMonthOfYear()+"/"+dataFinalLocacao.getYear();
        }
        public double getValor(){return valor;}
        
        public String infoLocacao(){
        String info = "<html><br>\nData do pedido: "+ dataPedido.getDayOfMonth()+"/"+dataPedido.getMonthOfYear()+"/"+dataPedido.getYear()+ 
                      "<br>\nData do inicio da locação: "+dataInicioLocacao.getDayOfMonth()+"/"+dataInicioLocacao.getMonthOfYear()+"/"+dataInicioLocacao.getYear()+
                      "<br>\nData do fim da locação: "+dataFinalLocacao.getDayOfMonth()+"/"+dataFinalLocacao.getMonthOfYear()+"/"+dataFinalLocacao.getYear()+
                      "<br>\nPeriodo da locação: "+periodoLocacao.getDays()+" dia(s)"+
                      "<br>\nId do pedido: "+id+
                      "<br>\nModelo do veículo: "+veiculo.getModelo()+ "| Id: "+ veiculo.getId()+
                      "<br><br>\n\n>Informações do cliente: "+cliente.infoCliente()+
                      "<br><br>\n>Informações do pagamento: "+pagamento.infoPagamento()+
                      "\nValor: "+ valor;
                
                         return info;       
        }
        
        public void addPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
        }
}
