import java.util.*;
import java.util.stream.Collectors;

public class ExercicioDoze {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        //A. Transforme cada estudante em uma string com os atributos do objeto;
            estudantes.add(new Estudante("Wanessa", 15));
            estudantes.add(new Estudante("Bianca", 13));
            estudantes.add(new Estudante("Adriano", 26));
            estudantes.add(new Estudante("Priscila", 19));
            estudantes.add(new Estudante("Gilberto", 27));
            estudantes.add(new Estudante("Mario", 14));
        //B. Contagem de estudantes na coleção;
            System.out.println("Quantos estudantes: "+estudantes.stream().count());
        //C. Filtre estudantes pela idade (igual ou maior que 18 anos);
            System.out.println("Estudantes igual ou maior que 18 anos:");
            System.out.println(estudantes.stream().filter((Estudante estudante) -> estudante.getIdade() >= 17).collect(Collectors.toList()));
        //D. Exiba cada elemento no console;
            System.out.println("Lista dos estudantes, um por linha:");
            estudantes.stream().forEach(System.out::println);
        //E. Retorne estudantes com nome que possui a letra B;
            System.out.println("Estudantes com a letra B no nome:");
            System.out.println(estudantes.stream().filter((Estudante estudante) -> estudante.getNome().contains("B")).collect(Collectors.toList()));
        //F. Retorne se existe estudante com a letra D no nome;
            System.out.println("Existe estudante com a letra D no nome:");
            System.out.println(estudantes.stream().anyMatch((Estudante estudante) -> estudante.getNome().contains("D")));
        //G. Retorne os estudantes mais velho e mais novo;
            //orElseThrow: envia uma aviso se um valor for inexistente;
            System.out.println("Estudante mais velho:");
            System.out.println(estudantes.stream().max(Comparator.comparing(Estudante::getIdade)).orElseThrow(NoSuchElementException::new));
            System.out.println("Estudante mais novo:");
            System.out.println(estudantes.stream().min(Comparator.comparing(Estudante::getIdade)).orElseThrow(NoSuchElementException::new));
    }
}

class Estudante {
    private String nome;
    private Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() { return nome; }
    public Integer getIdade() { return idade; }
    @Override
    public String toString() {
        return "{nome: "+this.getNome()+"; idade: "+this.getIdade()+"}";
    }
}
