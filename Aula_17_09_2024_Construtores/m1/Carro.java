package m1;

public class Carro {

    public String modelo; //Esse atributo pode ser chamado em outros pacotes por ser público
    private double preco; //Só acessa dentro do mesmo pacote
    double quilometragem; //Pode acessar dentro do mesmo pacote

    public Carro(String modelo, double preco, double quilometragem){
        this.modelo = modelo;
        this.preco = preco;
        this.quilometragem = quilometragem;
    }

    public void exibirPreco(){
        System.out.println("Preco do carro: " + preco);
    }

    public void exibirModelo(){
        System.out.println("Modelo: " + modelo);
    }

}
