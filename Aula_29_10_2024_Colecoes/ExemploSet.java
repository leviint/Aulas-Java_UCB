import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>(); //não ordenada, não permite elemento

        frutas.add("maça");
        frutas.add("uva");
        frutas.add("banana");
        frutas.add("uva");

        System.out.println("Frutas: " + frutas);

        frutas.remove("maça");

    }
}
