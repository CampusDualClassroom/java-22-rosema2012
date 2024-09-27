package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> lista = new ArrayList<>();
        lista.add("GKFFD");
        lista.add("TNANA");
        lista.add("MPMSL");
        lista.add("PSWME");
        lista.add("LZMLF");
        lista.add("JYEBV");
        lista.add("YELNT");
        lista.add("JSNKR");
        lista.add("JFESF");
        lista.add("TMJLL");
        return lista;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        int tamAntiguo = customList.size();
        customList.add(element);
        int tamNuevo = customList.size();
        if(tamAntiguo<tamNuevo){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> coleccion = createArrayList();
        printElementsAndIndex(coleccion);

        addElementToList(coleccion,"AAAAA");

    }
}
