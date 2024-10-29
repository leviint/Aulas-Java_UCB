import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args){

        ArrayList<String> nomes = new ArrayList<>();

        //adicionar
        nomes.add("Alice");
        nomes.add("Bob");

        //visualizar
        System.out.println("Nomes: " + nomes);

        //tamanho
        System.out.println("Nomes: " + nomes.size());

        //remover
        nomes.remove("Bob");
        System.out.println("Nomes: " + nomes);
        System.out.println("Tamanho: " + nomes.size());

        //verificar algum item da lista
        if(nomes.contains("Bob")){
            System.out.println("Encontrou!");
        } else {
            System.out.println("Não encontrou!");
        }

        //zerar a lista
        nomes.clear();
        System.out.println("Nomes: " + nomes);
        System.out.println("Lista vazia? " + nomes.isEmpty());
    }
} 
