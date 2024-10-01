package calculadora;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //chamar o objeto
        Calculadora calc = new Calculadora();

        System.out.println("Num 1: ");
        calc.num1 = sc.nextDouble();

        System.out.println("Num 2: ");
        calc.num2 = sc.nextDouble();

        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtracao: " + calc.subtrair());
        System.out.println("Divisao: " + calc.divisao());
        System.out.println("Multiplicacao: " + calc.multiplicacao());

        sc.close();

    }

}
