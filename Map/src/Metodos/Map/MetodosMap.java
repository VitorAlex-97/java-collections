package Metodos.Map;

/*
* Modelos dos carros e seus respectivos consumos na estrada, faça:
*
* Modelo= gol - consumo = 14km/l
* Modelo= uno - consumo = 15.6km/l
* Modelo= mobi - consumo = 16.1km/l
* Modelo= hb20 - consumo = 14.5km/l
* Modelo= kwid - consumo = 15.6km/l
*
* */

import java.util.*;

public class MetodosMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione modelos e consumos");
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("gol", 14.4);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os Modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(consumos);
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> iterador : entries) {
            if (iterador.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = iterador.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente + "km/l");
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> iterador: carrosPopulares.entrySet()) {
            if (iterador.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = iterador.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente + "km/l");
            }
        }

        Double soma = 0d;
        for (Map.Entry<String, Double> iterador : carrosPopulares.entrySet()){
            soma += iterador.getValue();
        }
        System.out.println("Exiba a soma dos consumos: " + soma + "km/l");

        System.out.println("A média dos consumos: " + soma/carrosPopulares.size() + "km/l");

        System.out.println("Remova os modelos com consumo < 15.0km/l :");
        List<String> consumosAbaixoPadrao = new ArrayList<>();
        for (Map.Entry<String, Double> iterador : carrosPopulares.entrySet()) {
            if (iterador.getValue() < 15d) {
                consumosAbaixoPadrao.add(iterador.getKey());
            }
        }
        for (String iterador : consumosAbaixoPadrao) {
            carrosPopulares.remove(iterador);
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na mesma ordem de inserção:");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>();
        carrosPopulares2.put("gol", 14.4);
        carrosPopulares2.put("uno", 15.6);
        carrosPopulares2.put("mobi", 16.1);
        carrosPopulares2.put("hb20", 14.5);
        carrosPopulares2.put("kwid", 15.6);
        System.out.println(carrosPopulares2);

        System.out.println("Exiba o dicionário ordenado pela chave:");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);

        System.out.println("Apague o dicionário de carros:");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Verificar se está vazio o dicionario: " + carrosPopulares.isEmpty());



    }
}
