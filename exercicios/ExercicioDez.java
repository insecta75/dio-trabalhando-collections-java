import java.util.Map;
import java.util.TreeMap;

public class ExercicioDez {
    public static void main(String[] args) {
        TreeMap<String, String> estadosBrasil = new TreeMap<>();
            //Adicionar chave/valor (sigla/estado);
            estadosBrasil.put("SP", "Sao Paulo");
            estadosBrasil.put("MG", "Minas Gerais");
            estadosBrasil.put("GO", "Goias");
            estadosBrasil.put("BA", "Bahia");
            estadosBrasil.put("RJ", "Rio de Janeiro");
            estadosBrasil.put("AC", "Acre");
            estadosBrasil.put("SC", "Santa Catarina");
            estadosBrasil.put("MA", "Maranhao");
            estadosBrasil.put("MS", "Mato Grosso do Sul");
        System.out.println("Estados do Brasil:");
            System.out.println(estadosBrasil);
        System.out.println("Estados do Brasil:");
            //Remover o estado de MG;
            estadosBrasil.remove("MG");
            //Adicionar o estado de DF;
            estadosBrasil.put("DF", "Distrito Federal");
            System.out.println(estadosBrasil);
        //Verificar o tamanho do mapa;
        System.out.println("Estados no mapa: "+estadosBrasil.size());
        System.out.println("Estados do Brasil após remover MS pelo nome:");
            //Remover estado do MS pelo nome;
            estadosBrasil.remove("MS", "Mato Grosso do Sul");
            System.out.println(estadosBrasil);
        //Navegar os registros do mapa como: NOME (SIGLA);
        System.out.println("Estados do Brasil:");
            for (Map.Entry<String, String> estado: estadosBrasil.entrySet()) {
                System.out.println(estado.getValue()+" ("+estado.getKey()+")");
            }
        //Verifica pela sigla se Santa Catarina existe no mapa;
        System.out.println("O estado de Santa Catarina existe no mapa: "+estadosBrasil.containsKey("SC"));
        //Verifica pelo nome se Maranhao existe no mapa;
        System.out.println("O estado de Maranhao existe no mapa: "+estadosBrasil.containsValue("Maranhao"));
    }
}
