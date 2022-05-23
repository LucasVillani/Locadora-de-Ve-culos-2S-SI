
import org.joda.time.LocalDate;

public class dados {
    
        static Cliente loginUser;
        public static int numClientes = 0;
         public static Cliente[] clientes = new Cliente[50]; 
         
         static ContratoLocacao contratoConfirmar;
   
       public static int numVeiculos = 5;
       public static Veiculo[] veiculos = new Veiculo[50];
       public static String veiculosCatalogo = "";
       
       public static int numContratos = 0;
       public static ContratoLocacao[] contratos = new ContratoLocacao[50];
       
       public dados(){
        veiculos[0] = new Veiculo("Ferrari", new LocalDate(2019,1,1) ,"SuperCarro modelo novo", 15000, true, 0, 1000);
        veiculos[1] = new Veiculo("Mercedes", new LocalDate(2015,7,10) ,"Modelo raro", 100000, true, 1, 1000);
        veiculos[2] = new Veiculo("Porsche", new LocalDate(2017,6,30) ,"Carro estiloso", 10000, false, 2, 500);
        veiculos[3] = new Veiculo("Ferrari", new LocalDate(2013,5,2) ,"SuperCarro modelo novo", 2000, true, 3, 200);
        veiculos[4] = new Veiculo("Ferrari", new LocalDate(2012,2,12) ,"Carro super rapido", 99000, true, 4, 700);
       }
}
