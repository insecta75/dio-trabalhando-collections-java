package comparators;

import java.util.*;

public class ExercicioOnze {
    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<>();
            //Adicionar elementos na lista;
            listaLivros.add(new Livro("Dom Casmurro", 150));
            listaLivros.add(new Livro("Senhora", 200));
            listaLivros.add(new Livro("Primo Basilio", 250));
            listaLivros.add(new Livro("Dom Casmurro", 160));
            listaLivros.add(new Livro("Nada de Novo no Fromt", 300));
        System.out.println("1. Lista de Livros (ordem insercao:)");
            for (Livro livro:listaLivros) {
                System.out.println(livro);
            }
        //Ordene implementando Comparator;
        System.out.println("2. Lista de Estudantes (ordem por Comparator):");
            Collections.sort(listaLivros, new LivroOrdemTituloPaginaComparator());
            for (Livro livro:listaLivros) {
                System.out.println(livro);
            }
        //Ordene implementando Comparable;
        System.out.println("3. Lista de Estudantes (ordem por Comparable):");
            Collections.sort(listaLivros);
            for (Livro livro:listaLivros) {
                System.out.println(livro);
            }
        //Ordene usando Lambda;
        System.out.println("4. Lista de Estudantes (ordem por Lambda):");
            listaLivros.sort((t1, t2) -> t1.getTitulo().compareToIgnoreCase(t2.getTitulo()));
            for (Livro livro:listaLivros) {
                System.out.println(livro);
            }
        //Ordene usando referencias de metodos e estaticos de Comparator;
        System.out.println("5. Lista de Estudantes (ordem por referencias de metodos):");
            listaLivros.sort(Comparator.comparingInt(Livro::getPaginas));
            for (Livro livro:listaLivros) {
                System.out.println(livro);
            }
    }
}
