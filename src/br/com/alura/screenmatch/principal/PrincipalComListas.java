package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println("Nome: " +item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

        List<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Mu540");
        buscaPorArtistas.add("Veigh");
        buscaPorArtistas.add("Kyan");
        System.out.println(buscaPorArtistas);
        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDoLancamento));
    }
}
