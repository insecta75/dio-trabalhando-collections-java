import java.util.TreeSet;

public class ExercicioNove {
    public static void main(String[] args) {
        TreeSet<Integer> numerosTree = new TreeSet<>();
            //Adiciona numeros inteiros;
            numerosTree.add(3);
            numerosTree.add(88);
            numerosTree.add(20);
            numerosTree.add(44);
            numerosTree.add(3);
        //Navega o Set no console;
        System.out.println("TreeSet no console:");
            for (Integer numero:numerosTree) {
                System.out.println(numero);
            }
        //Remoção do primeiro item;
        System.out.println("Primeiro número: "+numerosTree.pollFirst());
        System.out.println("TreeSet após a remoção:");
            System.out.println(numerosTree);
        System.out.println("TreeSet após a adição:");
            //Adiciona novo número no Set;
            numerosTree.add(23);
            System.out.println(numerosTree);
        //Tamanho do TreeSet;
        System.out.println("Tamanho do TreeSet: "+numerosTree.size());
        //Verifica se o TreeSet está vazio;
        System.out.println("TreeSet vazio: "+numerosTree.isEmpty());
    }
}
