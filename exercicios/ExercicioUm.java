import java.util.*;

public class ExercicioUm {
    public static void main(String[] argv) {

        List<Temperatura> temperaturas = new ArrayList<>();
        temperaturas.add(new Temperatura("Janeiro", 30.5));
        temperaturas.add(new Temperatura("Fevereiro", 29.5));
        temperaturas.add(new Temperatura("Marco", 28.0));
        temperaturas.add(new Temperatura("Abril", 27.5));
        temperaturas.add(new Temperatura("Maio", 26.0));
        temperaturas.add(new Temperatura("Junho", 24.5));
        //System.out.println(temperaturas);

        Double soma = 0.0;
        for(int i=0; i < temperaturas.size(); i++) {
            soma += temperaturas.get(i).getMedia();
        }
        Double mediaSem = soma/temperaturas.size();
        System.out.printf("Media Semestral: %.1fC\n", mediaSem);

        for(Temperatura temperatura : temperaturas) {
            if(temperatura.getMedia() > mediaSem) {
                System.out.println(temperatura.getMes());
            }            
        }
    }
}

class Temperatura {
    private String mes;
    private Double media;

    public Temperatura(String mes, Double media) {
        this.mes = mes;
        this.media = media;
    }

    public String getMes() {return this.mes;}
    public Double getMedia() {return this.media;}
    @Override   
    public String toString() {
        return "{Mes: "+this.getMes()+", Media: "+this.getMedia()+"}";
    }
}