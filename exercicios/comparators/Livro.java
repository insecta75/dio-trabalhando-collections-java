package comparators;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private Integer paginas;

    public Livro(String titulo, Integer paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
    public String getTitulo() { return this.titulo; }
    public Integer getPaginas() { return this.paginas; }
    @Override
    public String toString() {
        return "Livro{"+"titulo='"+this.getTitulo()+'\''+", paginas=" + this.getPaginas()+'}';
    }
    @Override
    public int compareTo(Livro livro) {//Ordena pelo titulo ordem alfabetica ou numero de paginas;
        int titulo = this.getTitulo().compareToIgnoreCase(livro.getTitulo());
        if(titulo !=0) return titulo;//Se o titulos sao diferentes, ordem pelo titulo;
        return Integer.compare(this.getPaginas(), livro.getPaginas());
    }
}
