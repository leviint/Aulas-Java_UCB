import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> pedidos = new LinkedList<>();

        //adicionar elemento
        pedidos.add("Pedido 1");
        pedidos.offer("Pedido 2");

        //visualizar os elementos
        System.out.println("Primeiro: " + pedidos.element()); //Retorna o primeiro elemento dessa fila
    }
}
