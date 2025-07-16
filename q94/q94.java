package q94;

import java.util.TreeMap;

public class q94 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String entrada = "HELLO THERE";

        for (Character aux : entrada.toCharArray()) {
            if (Character.isLetter(aux)) {
                if(map.containsKey(aux)) {
                    map.put(aux, map.get(aux) + 1);
                } else {
                    map.put(aux, 1);
                }
            }       
        }
        for (Character aux : map.keySet()) {
            System.out.println(aux + ": " + map.get(aux));
        }
    }
}
