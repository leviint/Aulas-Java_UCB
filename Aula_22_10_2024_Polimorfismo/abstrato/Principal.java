//package abstrato;

public class Principal {
    public static void main(String[] args) {
        //Jogo jogo = new Jogo("Uno", 4); classe abstrata

        Jogo jogo1 = new JogoCartas("Uno", 4, "Padrão");

        jogo1.iniciar();
        jogo1.regras();

        Jogo jogo2 = new JogoTabuleiro("Xadrez", 2, "Quadriculado");

        jogo2.iniciar();
        jogo2.regras();
    }
}
