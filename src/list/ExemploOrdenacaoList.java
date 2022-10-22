package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/
        //Criação dos objetos gatos
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        //Imprime os gatos por ordem de inserção
        System.out.println("Imprime por ordem de Inserção: ");
        System.out.println(meusGatos);

        //Imprime de forma aleatória, bagunça o array
        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //sort do collections compara e organiza de acordo com o comprable
        System.out.println("Ordem natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //sort usando a classe comparator
        System.out.println("Ordem idade: ");
        Collections.sort(meusGatos, new ComparatorIdade());
        //usando comparator do list
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        //método da classe ComparatorCor
        System.out.println("Ordem por cor: ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        //Ordenar por nome, cor e idade
        System.out.println("Ordem por nome/idade/cor: ");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    }
}

//Classe gato simples
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        //int porque compara Strings
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        //int porque compara Strings
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0 ) return cor;

        //Integer porque compara inteiros
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}