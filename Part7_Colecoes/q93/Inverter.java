package Part7_Colecoes.q93;

import java.util.LinkedList;

public class Inverter {
    public static void main(String[] args) {
        LinkedList<Character> lista = new LinkedList<>();
        LinkedList<Character> listaInversa = new LinkedList<>();
        lista.add('a');
        lista.add('b');
        lista.add('c');
        lista.add('d');
        lista.add('e');
        lista.add('f');
        lista.add('g');
        lista.add('h');
        lista.add('i');
        lista.add('j');

        for (int i = lista.size()-1; i>=0; i--) {
            listaInversa.add(lista.get(i));
        }
        System.out.println(listaInversa);
    }
}
