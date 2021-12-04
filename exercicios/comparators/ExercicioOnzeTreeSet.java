package comparators;

import java.util.*;

public class ExercicioOnzeTreeSet {
    public static void main(String[] args) {
        Set<Livro> listaLivrosT = new TreeSet<>(new LivroOrdemTituloPaginaComparator());
            //Adicionar elementos no TreeSet;
            listaLivrosT.add(new Livro("Dom Casmurro", 150));
            listaLivrosT.add(new Livro("Senhora", 200));
            listaLivrosT.add(new Livro("Primo Basilio", 250));
            listaLivrosT.add(new Livro("Dom Casmurro", 160));
            listaLivrosT.add(new Livro("Nada de Novo no Fromt", 300));
        //Ordene implementando Comparator;
        System.out.println("TreeSet de Livros (ordem por Comparator):");
            for (Livro livroT : listaLivrosT) {
                System.out.println(livroT);
            }
    }
}
