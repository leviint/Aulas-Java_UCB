public class Principal {
    public static void main(String[] args) {
        
        RadioRelogio r = new RadioRelogio();

        r.ligar();
        //r.desligar();

        System.out.println("Hora: " + r.horas());

        //coloca uma estação para o rádio
        r.estacao(101.5);
        System.out.println("Estação: " + r.obterEstacaoAtual());

        System.out.println();
        r.desligar();
    }
}
