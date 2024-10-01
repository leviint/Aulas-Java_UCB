package m2;

import m1.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", 10000, 20);

        meuCarro.exibirModelo();
        meuCarro.exibirPreco();

    }
}
