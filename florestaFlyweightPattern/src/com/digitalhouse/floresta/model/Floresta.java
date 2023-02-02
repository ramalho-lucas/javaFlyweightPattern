package com.digitalhouse.floresta.model;

import com.digitalhouse.floresta.factory.ArvoreFactory;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
    private static List<Arvore> FLORESTA = new ArrayList<>();

    public void plantarArvore(String tipo, int altura, int largura, String cor){
        Arvore arvore = ArvoreFactory.getArvorePorTipo(tipo, altura, cor, largura);

        this.FLORESTA.add(arvore);
    }

    public static List<Arvore> getFLORESTA() {
        return FLORESTA;
    }
}
