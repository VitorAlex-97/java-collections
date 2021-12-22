package Ordenar.Set;

/*
* Dadas as seguintes informaçoes sobre minhas series favoritas,
* crie im conjunto e ordene este conjunto exibindo:
* (nome - genero - tempo de episodio);
*
* Serie 1 = Nome: The Boys, genero: fantasia, tempoEpisodio: 60;
* Serie 2 = Nome: How I met your mother, genero: comédia, tempoEpisodio: 22;
* Serie 3 = Nome: Dragon Ball Super, genero: Anime, tempoEpisodio: 20;
* */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenarSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie("The Boys","fantasia", 60));
        minhasSeries.add(new Serie("How I met your mother","comédia", 22));
        minhasSeries.add(new Serie("Dragon Ball Super","Anime", 20));
        for (Serie iterador : minhasSeries) {
            System.out.println(iterador);
        }

        System.out.println("--\tOrdem de insersão\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>();
        minhasSeries2.add(new Serie("The Boys","fantasia", 60));
        minhasSeries2.add(new Serie("How I met your mother","comédia", 22));
        minhasSeries2.add(new Serie("Dragon Ball Super","Anime", 20));
        for (Serie iterador : minhasSeries2) {
            System.out.println(iterador);
        }

        System.out.println("--\tOrdem natural (Tempo de Episodio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        System.out.println(minhasSeries3);


    }
}

