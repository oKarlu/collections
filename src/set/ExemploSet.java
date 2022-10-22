package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//        Set notas = new HashSet(); //antes do java 5
//        HashSet<Double> notas = new HashSet<>();
          /*Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
          notas.add(1d);
          notas.remove(5d);
          System.out.println(notas);*/


        System.out.println("Criando conjunto e adicionando notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //Imprimindo todos os valores em set
        System.out.println(notas.toString());

        //Não tem o método indexOf para mostrar a posição
        //System.out.println("Exibindo a posição da nota 5.0");

        //Não tem como fazer essa operação também, porque não tem indice no set
        //System.out.println("Adicionando na lista a nota 8.0 na posição 4:");

        //Não tem como fazer essa operação porque não tem o método set
        //System.out.println("Subistitua a nota 5.0 pela nota 6.0: ");

        //Método para saber se contém determinado valor na coleção
        System.out.println("Tem a nota 5.0 no conjunto?: " + notas.contains(5d));

        //Não é possivel, porque não tem o método get para passar o indice e retornar a nota
        //System.out.println("Exibindo a terceira nota adicionada: ");

        //Menor valor da coleção
        System.out.println("Menor nota: " + Collections.min(notas));

        //Maior valor da coleção
        System.out.println("Maior nota: " + Collections.max(notas));

        //Soma dos elementos
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //Quantidade de elementos na coleção
        System.out.println("Média dos valors: " + (soma/notas.size()));

        //removendo elemento
        System.out.println("Removendo a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //Não tem como remover por por indice/posição
        //System.out.println("Remover nota da posição 0: ");

        //Removendo com condição
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        //não tem como com a implementação do HashSet, so LinkedHashSet or TreeSet
        System.out.println("Imprimir os numeros na ordem que foram adicionados:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        //Não é possivel adiconar o mesmo valor
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        //Apenas a TreeSet consegue adicionar os elementos em ordem crescente
        System.out.println("Imprimir todas as notas em ordem crescente: ");
        //notas2 é passado como argumento porque é uma lista Set
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        //Apagar todos elementos do conjunto
        System.out.println("Apagando todos os elementos: ");
        notas.clear();
        System.out.println(notas);

        //Verifica se o conjunto está vazio
        System.out.println("Conjuntos elementos: " + notas.isEmpty());
    }
}
