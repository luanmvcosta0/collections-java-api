package org.example.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {

    private List<Livro> livroList;

    public CatalogosLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalosAnos.add(l);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogosLivros catalogosLivros = new CatalogosLivros();
        catalogosLivros.adicionarLivro("Livro 1", "Luan Costa", 2018);
        catalogosLivros.adicionarLivro("Livro 2", "Leticia Buled", 2019);
        catalogosLivros.adicionarLivro("Livro 3", "Lucca Real", 2020);
        catalogosLivros.adicionarLivro("Livro 4", "Mario Gomes", 2023);
        catalogosLivros.adicionarLivro("Livro 5", "Kalina Torres", 2025);

        System.out.println(catalogosLivros.pesquisarPorAutor("Luan Costa"));
        System.out.println(catalogosLivros.pesquisarPorIntervalosAnos(2019, 2023));
        System.out.println(catalogosLivros.pesquisaPorTitulo("Livro 5"));
    }

}
