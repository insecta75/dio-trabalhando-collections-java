import java.util.*;

public class exercicioSeis {
    public static void main(String[] args) {
        List<Dado> meusLances = new ArrayList<>() {{//Cria lista para armazenar os valores;
            for(int i=0; i<100; i++) {//Lance 100 vezes o dado;
                Random lance = new Random();//Gera numeros randomicos;        
                add(new Dado(lance.nextInt(6)+1));//Armazena na lista os numeros de 1 a 6;  
            } 
        }};
        int valorUm=0, valorDois=0, valorTres=0, valorQuatro=0, valorCinco=0, valorSeis=0;
        for (Dado meuLance : meusLances) {//Verifica, classifica e conta cada valor armazenado na lista; 
            if(meuLance.getResultado() == 1) {
                valorUm++;
            } else if(meuLance.getResultado() == 2) {
                valorDois++;
            } else if(meuLance.getResultado() == 3) {
                valorTres++;
            } else if(meuLance.getResultado() == 4) {
                valorQuatro++;
            } else if(meuLance.getResultado() == 5) {
                valorCinco++;
            } else {
                valorSeis++;
            }
        }
        System.out.println("Resultados: \n"+meusLances);//Exibe os valores armazenados na lista;
        System.out.println("\nFace 1: "+valorUm+"\nFace 2: "+valorDois+
                           "\nFace 3: "+valorTres+"\nFace 4: "+valorQuatro+
                           "\nFace 5: "+valorCinco+"\nFace 6: "+valorSeis);//Exibe cada classe de valor existente na lista; 
    }
}

class Dado {
    private Integer resultado;

    public Dado(Integer resultado) {
        this.resultado = resultado;
    }
    public Integer getResultado() {
        return this.resultado;
    }
    @Override
    public String toString() {
        return this.getResultado()+"";
    }
}