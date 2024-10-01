package veiculo;

public class Principal {
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro(); //objeto
        Carro meuCarro2 = new Carro(); 

        meuCarro.modelo = "SUV";
        meuCarro.cor = "Azul";
        meuCarro.ano = 2021;
        meuCarro.placa = "AAA-2304";

        meuCarro2.modelo = "Sedan";
        meuCarro2.cor = "Vermelho";
        meuCarro2.ano = 2020;
        meuCarro2.placa = "ABC-1234";

        meuCarro.exibirInformacoes();
        meuCarro2.exibirInformacoes();


    }
}
