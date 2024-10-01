package imc;

public class CalculadoraIMC {
    
    //atributos
    double altura;
    double peso;

    //métodos
    
    //calcular o imc
    public double calcularIMC(){
        return peso / (altura * altura);
    }
    
    //interpretar
    public String interpretarIMC(double imc){
        if(imc < 18.5){
            return "Abaixo do peso ideal";
        }else if(imc < 24.9){
            return "Peso normal";
        }else if(imc < 29.9){
            return "Sobrepeso";
        }else{
            return "Obesidade";
        }
    }

}
