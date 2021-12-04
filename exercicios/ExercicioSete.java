import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioSete {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
            //Adicione 5 nomes na lista;
            listaNomes.add("Juliana");
            listaNomes.add("Pedro");
            listaNomes.add("Carlos");
            listaNomes.add("Larissa");
            listaNomes.add("João");
        //Navegue na lista exibindo cada nome no console;
        System.out.println("Nomes na lista:");
            for (String nome:listaNomes) {
                System.out.println(nome);
            }
        //Substitua o nome Carlos por Roberto;
        System.out.println("Nomes na lista:");
            listaNomes.set(2, "Roberto");
            System.out.println(listaNomes);
        //Retorne o nome da posição 1;
        System.out.println("Nome na posição 1: "+listaNomes.get(1));
        //Remova o nome da posição 4;
        System.out.println("Nomes na lista:");
            listaNomes.remove(4);
            System.out.println(listaNomes);
        //Remova o nome João da lista;
        System.out.println("Nomes na lista:");
            listaNomes.remove("João");//Não será possível, pois foi removido no item anterior;
            System.out.println(listaNomes);
        //Retorne a quantidade de itens na lista;
        System.out.println("Itens na lista: "+listaNomes.size());
        //Verificar se o nome Juliano existe na lista;
        System.out.println("Juliano existe na lista: "+listaNomes.contains("Juliano"));
        //Criar uma nova lista com os nomes Ismael e Rodrigo;
        System.out.println("Nomes na lista nova:");
            List<String> listaNova = new ArrayList<>();
                listaNova.add("Ismael");
                listaNova.add("Rodrigo");
            //Adicionar todos os nomes da lista antiga na nova;
            listaNova.addAll(listaNomes);
            System.out.println(listaNova);
        //Ordenar os itens da lista alfabeticamente;
        System.out.println("Nomes na lista nova:");
            Collections.sort(listaNova);
            System.out.println(listaNova);
        //Verificar se a lista esta vazia;
        System.out.println("Lista nova vazia: "+listaNova.isEmpty());
    }
}
