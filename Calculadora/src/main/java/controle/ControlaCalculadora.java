package controle;
import dominio.Calculadora;
import java.util.Scanner;

public class ControlaCalculadora {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int valor1 = leia.nextInt();
        System.out.print("Digite o segundo valor : ");
        int valor2 = leia.nextInt();
        leia.close();
        
        Calculadora calc = new Calculadora(valor1, valor2);
        
        System.out.println("RESULTADOS");
        System.out.println("Soma :" + calc.soma());
        System.out.println("Subtração: " + calc.subtracao());
        System.out.println("Multiplicação: " + calc.multiplicacao());
        System.out.println("Divisão: " + calc.divisao());
    }
}
