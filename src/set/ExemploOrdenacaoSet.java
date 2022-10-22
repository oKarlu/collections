package set;
/* Dadas as seguintes informações sobre minhas séries favoritas,
        crie um conjunto e ordene este conjunto exibindo:
        (nome - genero - tempo de episódio);

        Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
        Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
        */


import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        //Imprimir em ordem aleatoria - HashSet
        System.out.println("--\tOrdem aleatoria\t");
        //criando a coleção
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());


        //Imprimir na ordem de inserção dos elementos - LinkedHashSet
        System.out.println("\n--\tOrdem de inserção\t");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};

        for(Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "
        + serie.getGenero() + " - " + serie.getTempoEpisodio());

        //imprimir de acordo com a ordem natural (tempo Episodio) - TreeSet
        System.out.println("\n--\tOrdem natural\t");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);

        for(Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());


        //Imprimir ordenando de acordo com nome, gênero e tempo de episódio
        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        //Recebe uma collection e organiza ela do jeto que está implementado do comparator
        minhasSeries3.addAll(minhasSeries);

        for(Serie serie : minhasSeries3) System.out.println(serie.getNome()
        + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        //ordenar por gênero

        //ordenar por episódio

    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        if (nome != 0 ) return nome;

        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if (genero != 0 ) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}