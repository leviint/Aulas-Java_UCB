package construtor;

public class Principal {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ana";
        pessoa1.idade = 20;
        pessoa1.time = "Corinthians";

        Pessoa pessoa2 = new Pessoa("João", 25, "São Paulo");

        Pessoa pessoa3 = new Pessoa("Pedro");

        pessoa1.exibirInformacoes();
        System.out.println("");
        pessoa2.exibirInformacoes();
        System.out.println("");
        pessoa3.exibirInformacoes();


    }

        

}
