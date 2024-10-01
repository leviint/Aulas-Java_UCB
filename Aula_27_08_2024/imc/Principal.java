package imc;
import calculadora.CalculadoraIMC;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args, double imc) {

        //scanner
    Scanner sc = new Scanner(System.in);
    //objeto
    CalculadoraIMC calcIMC = new CalculadoraIMC();
    //passar os dados de leitura
    System.out.println("Insira o seu peso: ");
    calcIMC.peso = sc.nextDouble(); 

    System.out.println("Insira a sua altura em cm: ");
    calcIMC.altura = sc.nextDouble();
    //calcular o IMC
    double imc = calcIMC.calcularIMC();

    //resultado
    String resultadoIMC = calcIMC.interpretarIMC(imc);

    System.out.println("IMC: " + imc);
    System.out.println("Classificacao: " + resultadoIMC);

    sc.close();
    }
}
