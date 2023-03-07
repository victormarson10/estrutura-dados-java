package com.listaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args){

        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<String>();

        minhaListaEncadeada.addElemento("c1");
        minhaListaEncadeada.addElemento("c2");
        minhaListaEncadeada.addElemento("c3");
        minhaListaEncadeada.addElemento("c4");
        minhaListaEncadeada.addElemento("c5");
        minhaListaEncadeada.addElemento("c6");
        minhaListaEncadeada.addElemento("c7");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);
        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.addPosicaoElemento(3, "99");
        System.out.println(minhaListaEncadeada);

    }
}
