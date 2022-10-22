package map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2022 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2022 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1,
//                "hb20", 14.5, "kwid", 15.6);


        //Dicionario de carros e consumo
        System.out.println("Dicionario que relaciona os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            //Método de adicionar no Map é put
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);
        System.out.println(carrosPopulares.toString());

        //subistituindo valores
        System.out.println("Subistituindo o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        //Conferindo se existe determinado valor
        System.out.println("Conferindo se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        //Passando uma chave para retornar um valor
        System.out.println("Consumo do uno: " + carrosPopulares.get("uno"));

        //Exibir um objeto passando indice
        //não tem uma método para isso
        //System.out.println("Terceiro modelo adicionado: ");

        //Exibindo as chaves - modelo
        System.out.println("Mostre os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //Exivindo os valores das chaves
        System.out.println("Consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        //Buscando a chave com o maior valor
        System.out.println("Modelo mais econômico e seu consumo: ");
        Double maiorValor = Collections.max(carrosPopulares.values());
        //Retorna um set que pode manipular chaves e valores separadamente
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String chaveComMaiorValor = "";
        //Lógica para percorrer o set e guardar o maior valor
        for(Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(maiorValor)){
                chaveComMaiorValor = entry.getKey();
                //Chave com maior valor
                System.out.println("Modelos econômicos: " + chaveComMaiorValor + " - " + maiorValor);
            }
        }

        //Buscando a chave com o menor valor
        System.out.println("Modelo menos econômico e seu consumo: ");
        //Busca apenas o menor valor
        Double menorValor = Collections.min(carrosPopulares.values());
        String chaveComMenorValor = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(menorValor)){
                chaveComMenorValor = entry.getKey();
                System.out.println("Modelos menos econômico: " + chaveComMenorValor + " - " + menorValor);
            };
        }

        //Somando valores
        System.out.println("Soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //Pegando o tamanho do conjunto
        System.out.println("Media dos consumos desse dicionário de carros: " + (soma/carrosPopulares.size()));

        //Removendo com condição
        System.out.println("Removendo modelos com consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        //Exibir na ordem que foi informado - LinkedHashMap
        System.out.println("Exibir todos os carros na ordem em que foram informados:");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        //Ordenar elementos pela chave - modelo
        System.out.println("Dicionário ordenado pelo modelo do carro: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        //Apagar todos elementos
        System.out.println("Apagar dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares.toString());

        //Verifica se o dicionário está sem nenhum valor
        System.out.println("Cofenrindo se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
}
