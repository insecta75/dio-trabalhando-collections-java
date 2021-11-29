import java.util.*;

class exercicioQuatro {
    public static void main(String[] args) {
        Set<Cor> minhasCores = new LinkedHashSet<>() {{//a. Exibe cores na ordem de Insercao;
            add(new Cor("Violeta"));
            add(new Cor("Anil"));
            add(new Cor("Azul"));
            add(new Cor("Verde"));
            add(new Cor("Amarelo"));
            add(new Cor("Laranja"));
            add(new Cor("Vermelho"));
        }};
        for(Cor cor : minhasCores) {
            System.out.println(cor);
        }
        System.out.printf("Numero de cores: %d\n", minhasCores.size());//b. Quantidade de cores;
        System.out.println("-----");
        Set<Cor> minhasCoresC = new TreeSet<>(new ComparaCor());//c.Ordem Natural, por Nome da cor;
        minhasCoresC.addAll(minhasCores);
        for (Cor corC : minhasCoresC) {
            System.out.println(corC);
        }
        System.out.println("-----");
        TreeSet<String> minhasCoresD = new TreeSet<String>();
            minhasCoresD.add("Violeta");
            minhasCoresD.add("Anil");
            minhasCoresD.add("Azul");
            minhasCoresD.add("Verde");
            minhasCoresD.add("Amarelo");
            minhasCoresD.add("Laranja");
            minhasCoresD.add("Vermelho");   
        NavigableSet<String> minhasCoresR = minhasCoresD.descendingSet();//d. Ordem Inversa;
        for (String corD : minhasCoresR) {
            System.out.println(corD);            
        }
        System.out.println("-----");
        for (String corE : minhasCoresD) {            
            if(String.valueOf(corE.charAt(0)).equalsIgnoreCase("V")) {//e. Exiba cores que iniciam com letra "v";
                System.out.println(corE);
            }
        }
        System.out.println("-----");
        TreeSet<String> minhasCoresF = new TreeSet<String>();
        for (String corF : minhasCoresD) {            
            if(String.valueOf(corF.charAt(0)).equalsIgnoreCase("V")) {//f. Remova cores que nao iniciam com letra "v";
                minhasCoresF.add(corF);
            }
        }
        System.out.println(minhasCoresF);
        minhasCoresD.clear();//g. Limpe o conjunto;
        System.out.println(minhasCoresD.isEmpty());//h. confere se o conjunto esta vazio;
    }
}

class Cor {
    private String cor;

    public Cor(String cor) {
        this.cor = cor;
    }

    public String getCor() {return this.cor;}
    @Override
    public String toString() {
        return "{Cor: "+this.getCor()+"}";
    }
}

class ComparaCor implements Comparator<Cor> {
    @Override
    public int compare(Cor c1, Cor c2) {
        return c1.getCor().compareTo(c2.getCor());
    }
}