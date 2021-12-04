import java.util.*;

public class ExercicioDois {
    public static void main(String[] argv) {
        List<Pergunta> perguntas = new ArrayList<>();
            perguntas.add(new Pergunta("Nao", "Nao", "Nao", "Nao", "Nao"));
            perguntas.add(new Pergunta("Nao", "Nao", "Sim", "Nao", "Nao"));
            perguntas.add(new Pergunta("Sim", "Nao", "Nao", "Nao", "Sim"));
            perguntas.add(new Pergunta("Sim", "Nao", "Sim", "Sim", "Sim"));
            perguntas.add(new Pergunta("Sim", "Sim", "Sim", "Nao", "Sim"));
            perguntas.add(new Pergunta("Sim", "Sim", "Sim", "Sim", "Sim"));
        //System.out.println(perguntas);

        Integer sum = 0;
        for (Pergunta pergunta : perguntas) {
            if(pergunta.getQuestaoUm() == "Sim") sum++;            
            if(pergunta.getQuestaoDois() == "Sim") sum++;
            if(pergunta.getQuestaoTres() == "Sim") sum++;
            if(pergunta.getQuestaoQuatro() == "Sim") sum++;
            if(pergunta.getQuestaoCinco() == "Sim") sum++;
            if(sum == 2) System.out.println("Suspeita");
            else if(sum == 3 || sum == 4) System.out.println("Cumplice");
            else if(sum == 5) System.out.println("Assassina");
            else System.out.println("Inocente");
            sum = 0;
        }
    }
}

class Pergunta {
    private String questaoUm;
    private String questaoDois;
    private String questaoTres;
    private String questaoQuatro;
    private String questaoCinco;

    public Pergunta(String questaoUm, String questaoDois, String questaoTres, String questaoQuatro, String questaoCinco) {
        this.questaoUm = questaoUm;
        this.questaoDois = questaoDois;
        this.questaoTres = questaoTres;
        this.questaoQuatro = questaoQuatro;
        this.questaoCinco = questaoCinco;
    }

    public String getQuestaoUm() {return this.questaoUm;}
    public String getQuestaoDois() {return this.questaoDois;}
    public String getQuestaoTres() {return this.questaoTres;}
    public String getQuestaoQuatro() {return this.questaoQuatro;}
    public String getQuestaoCinco() {return this.questaoCinco;}
    @Override   
    public String toString() {
        return "{Q1: "+this.getQuestaoUm()+
               ", Q2: "+this.getQuestaoDois()+
               ", Q3: "+this.getQuestaoTres()+
               ", Q4: "+this.getQuestaoQuatro()+
               ", Q5: "+this.getQuestaoCinco()+"}";
    }
}