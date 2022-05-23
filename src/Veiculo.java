import org.joda.time.*;

public class Veiculo {
	public String modelo;
	public LocalDate anoFabricacao;
	public String descricao;
	public int kilometragem;
	public boolean status;
	public int id;
	public double valorDiaria;
        public String problemaVeiculo;
        
        
        public Veiculo(String modelo, LocalDate anoFabricacao, String descricao, int kilometragem, boolean status, int id, double valorDiaria){
        
        this.modelo = modelo;
	this.anoFabricacao = anoFabricacao;
	this.descricao = descricao;
	this.kilometragem = kilometragem;
	this.status = status;
	this.id = id;
	this.valorDiaria = valorDiaria;
        problemaVeiculo = "";
        
        }
        
        public String infoVeiculo(){
        String info = "\n>Modelo: "+modelo+"\n>Ano de fabricacao: "+ anoFabricacao.getDayOfMonth()+"/"+anoFabricacao.getMonthOfYear()+"/"+anoFabricacao.getYear() + "\n>Descricao: "+descricao+"\n>Kilometragem: "+kilometragem+"\nValor da diaria: R$"+valorDiaria+"\nId: "+id; 
        if (status){info+="\n>Status: Disponivel";}
        else{info+="\n>Status: Indisponivel";}
        return info;
        }
        
        public Boolean getStatus(){
        return status;
        }
        
        public String getModelo(){
        return modelo;
        }
        public int getId(){
        return id;
        }
        
        public double getValorDiaria(){
        return valorDiaria;
        }
        
        public String changeStatus(){
        if (status == true){
        status = false;
        return "O status do veículo foi atualizado, e consta como INDISPONÍVEL";
        }
        else{status = true;}
        return "O status do veículo foi atualizado, e consta como DISPONÍVEL";
        }
        
        public String infoVeiculoCat(){
        String info =  "<html>\n>Modelo: "+modelo+"<br>\n>Ano de fabricacao: "+anoFabricacao.getYear() + "<br>\n>Descricao: "+descricao+"<br>\n>Kilometragem: "+kilometragem+"<br>\nValor da diaria: R$"+valorDiaria;
        if (status){info+="<br>\n>Status: Disponivel<br><br>";}
        else{info+="<br>\n>Status: Indisponivel<br><br>";}
        return info;
        
        }
}
