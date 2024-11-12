import javax.swing.*;

public class MinhaJanela extends JFrame{

    public MinhaJanela() {

        //Tela
        setSize(500, 400); //tamanho
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); //posição
        setResizable(false); //redimensionamento de janela
        setLayout(null); //Deixa o layout vazio para posicionar livremente os componentes

        //Botão
        JButton jButton = new JButton("Botão 1"); //Criação de botão novo
        jButton.setBounds(30, 50, 200, 50); //Proporções e posição do botão
        add(jButton); //Adiciona botão

        //Evento para botão
        jButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Seja bem-vindo!");
        });

        //criar um método
        public void inicializarComponentes
    }
}
