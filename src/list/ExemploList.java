package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
 // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//        List notas = new ArrayList(); //antes do java 5
//        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
//        ArrayList<Double> notas = new ArrayList<>();
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
          /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
          notas.add(10d);
          System.out.println(notas);*/
          /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
          notas.add(1d);
          notas.remove(5d);
          System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());

        //Imprimir qual a posição do valor no array
        System.out.println("Posição da nota 5.0: " + notas.indexOf(5.0));

        //Adicionar na posição escolhida
        System.out.println("Adicionar na lista nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        //Substituir valor
        System.out.println("Subistituindo nota 5 pela nota 6.0: ");
        //indexOf para passar a posição que a nota 5.0 está
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //Conferindo se o valor existe na lista
        System.out.println("Nota 5.0 está na lista?: " + notas.contains(5d));

        //imprimir na ordem que foi adicionado a lista
        System.out.println("Exibindo todas as notas na ordem que foram informadas: ");
        for(Double nota: notas)System.out.println(nota);

        //Pasando uma posição e retornando um elemento
        System.out.println("Terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //Buscar o menor valor na lista
        System.out.println("Menor nota: " + Collections.min(notas));

        //Busca o maior valor na lista
        System.out.println("Maior nota: " + Collections.max(notas));

        //Soma de valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma dos valores: " + soma);

        //Fazendo a média com o tamanho da lista
        System.out.println("Media das notas: " + soma/notas.size());

        //Removendo um valor da lista
        System.out.println("Removendo o valor 0 da lista: ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Removendo da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        //Removendo com condição
        System.out.println("Remover notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //Apagar toda lista
        /*System.out.println("Apagando toda lista");
        notas.clear();
        System.out.println(notas);*/

        //Conferindo se a lista está vazia
        System.out.println("Está vazia?: " + notas.isEmpty());

    }
}