package comparators;

import java.util.Comparator;

public class LivroOrdemTituloPaginaComparator implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {//Ordena pelo titulo ordem alfabetica ou numero de paginas;
        int titulo = l1.getTitulo().compareToIgnoreCase(l2.getTitulo());
        if(titulo != 0) return titulo;//Se o titulos sao diferentes, ordem pelo titulo;
        return Integer.compare(l1.getPaginas(), l2.getPaginas());
    }
}
