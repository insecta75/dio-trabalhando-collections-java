import java.util.*;

class exercicioCinco {
    public static void main(String[] args) {
        //Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> popEstados = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);            
        }};
        //Exiba todos os estados e suas populações na ordem que foi informado;
        for (Map.Entry<String, Integer> popEstado : popEstados.entrySet()) {
            System.out.println("Estado: "+popEstado.getKey()+" - População: "+popEstado.getValue());
        }
        System.out.println("-----");
        //Substitua a População do estado do RN;
        popEstados.put("RN", 3534165);
        for (Map.Entry<String, Integer> popEstado : popEstados.entrySet()) {
            System.out.println("Estado: "+popEstado.getKey()+" - População: "+popEstado.getValue());
        }
        System.out.println("-----");
        //Confere se o estado PB esta no dicionario;
        Integer num = 0;
        for (Map.Entry<String, Integer> popEstado : popEstados.entrySet()) {
            if(popEstado.getKey().equals("PB")) {                
                num = 1;
            }
        }
        if(num == 0) {//Caso não estiver, adiciona PB;
            popEstados.put("PB", 4039277);
        }
        System.out.println("-----");
        //Exibe a população PE;
        for (Map.Entry<String, Integer> popEstado : popEstados.entrySet()) {
            if(popEstado.getKey().equals("PE")) {                
                System.out.println("Estado: "+popEstado.getKey()+" - População: "+popEstado.getValue());
            }
        }
        System.out.println("-----");
        //Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> popEstadosA = new TreeMap<>(popEstados);
        for (Map.Entry<String, Integer> popEstadoA : popEstadosA.entrySet()) {
            System.out.println("Estado: "+popEstadoA.getKey()+" - População: "+popEstadoA.getValue());
        }
        System.out.println("-----");
        Integer menorValor = Collections.min(popEstados.values());//Obtem o menor valor;
        Integer maiorValor = Collections.max(popEstados.values());//Obtem o maior valor;        
        for (Map.Entry<String, Integer> popEstado : popEstados.entrySet()) {
            //Exibe o estado com menor População;
            if(popEstado.getValue().equals(menorValor)) {
                System.out.println("Estado menos populoso: "+popEstado.getKey());
            }
            //Exibe o estado com maior população;
            if(popEstado.getValue().equals(maiorValor)) {
                System.out.println("Estado mais populoso: "+popEstado.getKey());
            }
        }
        System.out.println("-----");
        Iterator<Integer> iterator = popEstados.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        //Exibe a soma da população desses Estados;
        System.out.println("Soma: "+soma);
        //Exibe a média da população desses Estados;
        System.out.printf("Média: %.1f\n", soma/popEstados.size());
        System.out.println("-----");
        Iterator<Integer> iteratorR = popEstados.values().iterator();
        //Remove os estados com a população menor que 4000000;
        while(iteratorR.hasNext()) {
            if(iteratorR.next() < 4000000) {
                iteratorR.remove();
            }
        }
        for (Map.Entry<String, Integer> popEstado : popEstados.entrySet()) {
            System.out.println("Estado: "+popEstado.getKey()+" - População: "+popEstado.getValue());
        }
        System.out.println("-----");
        popEstados.clear();//Apaga o dicionário de estados;
        System.out.println("Dicionário vazio: "+popEstados.isEmpty());
    }
}