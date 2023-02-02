package com.digitalhouse.floresta.factory;

import com.digitalhouse.floresta.model.Arvore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArvoreFactory {
    static Map<String, Arvore> TIPO_ARVORES = new HashMap<>();

    public static Arvore getArvorePorTipo(String tipo, int largura, String cor, int altura){

        Arvore arvore = TIPO_ARVORES.get(tipo);
        //String id = tipo+cor;

       if(Objects.isNull(arvore)){
            arvore = new Arvore(tipo, altura, largura, cor);
            TIPO_ARVORES.put(tipo, arvore);
       }
        return arvore;
    }

    // Exemplo de caso fosse criada a instancia sem pesquisar se ja existia a arvore

//    public static Arvore getArvorePorTipo(String tipo, int largura, String cor, int altura){
//
//      // Arvore arvore = TIPO_ARVORES.get(tipo);
//
//      //  if(Objects.isNull(arvore)){
//        Arvore arvore = new Arvore(tipo, altura, largura, cor);
//        TIPO_ARVORES.put(tipo, arvore);
//      //  }
//        return arvore;
//    }
}
