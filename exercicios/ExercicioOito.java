import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioOito {
    public static void main(String[] args) {
        Queue<String> filaNomes = new LinkedList<>();
            //Adiciona nomes;
            filaNomes.add("Juliana");
            filaNomes.add("Pedro");
            filaNomes.add("Carlos");
            filaNomes.add("Larissa");
            filaNomes.add("João");
        //Exibe cada nome no console;
        System.out.println("Itens na fila:");
            Iterator<String> iterator = filaNomes.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        System.out.println("Primeiro item da fila: "+filaNomes.peek());
        //Remove o item;
        System.out.println("Remove o primeiro item da fila: "+filaNomes.poll());
        System.out.println("Itens na fila após remoção:");
            System.out.println(filaNomes);
        //Adiciona nome;
        System.out.println("Itens na fila após adição:");
            filaNomes.add("Daniel");
            System.out.println(filaNomes);
            //Posição após a adição;
            int count = 0;
            for (String nome:filaNomes) {
                if(nome.contains("Daniel")) {
                    break;
                } else {
                    count++;
                }
            }
        System.out.println("Posição do nome Daniel na fila: "+count);
        System.out.println("Tananho da fila: "+filaNomes.size());
        System.out.println("Fila vazia: "+filaNomes.isEmpty());
        System.out.println("Existe Carlos na fila: "+filaNomes.contains("Carlos"));
    }
}
