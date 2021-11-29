import java.util.*;

class exercicioTres {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>() {{//a.Ordem de Insercao
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("PHP", 1995, "PHPStorm"));
            add(new LinguagemFavorita("JavaScript", 1995, "Eclipse"));
            add(new LinguagemFavorita("Flutter", 2017, "VSCode"));
        }};
        for(LinguagemFavorita linguagem : minhasLinguagens) {
            System.out.println(linguagem);
        }
        System.out.println("-----");
        Set<LinguagemFavorita> minhasLinguagensB = new TreeSet<>(new ComparaNome());//b.Ordem Natural, por Nome;
        minhasLinguagensB.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagemB : minhasLinguagensB) {
            System.out.println(linguagemB);
        }
        System.out.println("-----");
        Set<LinguagemFavorita> minhasLinguagensC = new TreeSet<>(new ComparaIde());//c.Ordem Natural, por IDE;
        minhasLinguagensC.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagemC : minhasLinguagensC) {
            System.out.println(linguagemC);
        }
        System.out.println("-----");
        Set<LinguagemFavorita> minhasLinguagensD = new TreeSet<>(new ComparaCriacaoNome());//d.Ordem Natural, por Ano de Criacao e Nome;
        minhasLinguagensD.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagemD : minhasLinguagensD) {
            System.out.println(linguagemD);
        }
        System.out.println("-----");
        Set<LinguagemFavorita> minhasLinguagensE = new TreeSet<>(new ComparaNomeCriacaoIde());//e.Ordem Natural, por Nome, Ano de Criacao e IDE;
        minhasLinguagensE.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagemE : minhasLinguagensE) {
            System.out.println(linguagemE);
        }
    }
}

class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {return this.nome;}
    public Integer getAnoDeCriacao() {return this.anoDeCriacao;}
    public String getIde() {return this.ide;}
    @Override
    public String toString() {
        return "{Nome: "+this.getNome()+", Ano de Criacao: "+this.getAnoDeCriacao()+", IDE: "+this.getIde()+"}";
    }
}

class ComparaNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2) {
        return f1.getNome().compareTo(f2.getNome());
    }
}
class ComparaIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2) {
        return f1.getIde().compareTo(f2.getIde());
    }
}
class ComparaCriacaoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2) {
        int criacao = Integer.compare(f1.getAnoDeCriacao(), f2.getAnoDeCriacao());
        if(criacao != 0) return criacao; 
        return f1.getNome().compareTo(f2.getNome());
    }
}
class ComparaNomeCriacaoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2) {
        int nome = f1.getNome().compareTo(f2.getNome());
        if(nome != 0) return nome;         
        int criacao = Integer.compare(f1.getAnoDeCriacao(), f2.getAnoDeCriacao());
        if(criacao != 0) return criacao; 
        return f1.getIde().compareTo(f2.getIde());
    }
}