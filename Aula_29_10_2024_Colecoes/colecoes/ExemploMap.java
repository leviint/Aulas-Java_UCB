import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> idades = new HashMap<>(); //Semelhante aos dicionários em python
        Map<Integer, String> nomes = new HashMap<>();

        //adicionar
        idades.put("Alice", 25);
        idades.put("Bob", 20);
        idades.put("Alice", 26);
       
        //visualizar
        System.out.println("Nomes: " + idades);

        //remover
        idades.remove("Bob");
        System.out.println("Nomes: " + idades);

        //adicionar
        nomes.put(1, "Alice");
        nomes.put(2, "Bob");
        System.out.println("Nomes: " + nomes);

        //remover
        nomes.remove(1);
        System.out.println("Nomes: " + nomes);

        //buscar um elemento
        if (nomes.containsKey(1)) {
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }
}
