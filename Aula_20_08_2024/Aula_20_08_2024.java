
import java.util.Scanner;

public class Aula_20_08_2024{
    public static void main(String[] args) {
        //scanner
        //joptionpane
        //impressao
        //operadores

        Scanner sc = new Scanner(System.in);
        //entrada dos dados

        System.out.println("Informe um texto: ");
        String texto = sc.next();

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        System.out.println("Informe um caractere: ");
        char letra = sc.next().charAt(0); //mesmo método de indexação de outras linguagens

        System.out.println(texto);
        System.out.println(numero);
        System.out.println(letra);

        String nome1, nome2, nome3;

        nome1 = sc.nextLine();
        nome2 = sc.nextLine();
        nome3 = sc.nextLine();

        System.out.println("Nomes digitados: ");
        System.out.printf("O seu nome é %s", nome1);
        System.out.printf(nome2);
        System.out.printf(nome3);
    }
}