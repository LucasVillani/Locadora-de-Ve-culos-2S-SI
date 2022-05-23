import org.joda.time.*;
public class ChamadoAjuda {
	public LocalDate data;
	public boolean status;
	public int id;
	public String descricaoProblema;
        public Cliente cliente;
        
        public ChamadoAjuda(LocalDate data, boolean status, int id, String descricaoProblema, Cliente cliente){
        this.data = data;
        this.status = status;
        this.id = id;
        this.descricaoProblema = descricaoProblema;
        this.cliente = cliente;
        }
        
        public String infoChamado(){
        String info = "\n>Data do chamado: "+ data.dayOfMonth()+"/"+data.monthOfYear()+"/"+data.year()+"\n>Id do chamado: "+ id+ "\n>Descrição do problema: "+descricaoProblema;
        if (!status){info+="\n>Status: Disponivel";}
        else{info+="\n>Status: Indisponivel";}
        info+="\n>Informações do cliente: "+cliente.infoCliente();
        return info;
        }
        
        public String changeStatus(){
        if (status == true){
        status = false;
        return "O status do veículo foi atualizado, e consta como INDISPONÍVEL";
        }
        else{status = true;}
        return "O status do veículo foi atualizado, e consta como DISPONÍVEL";
        }
}

