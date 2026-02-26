import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    int Numero1;
    String Operador= "+,-,*,/";
    int Numero2;



        Scanner Sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        Numero1 = Sc.nextInt();

        System.out.println("Digite um operador");
        Operador = Sc.next();

        System.out.println("Digite outro numero");
        Numero2 = Sc.nextInt();

        if( Operador.equals("+"))
        { double resutaldo = Numero1 + Numero2;
        System.out.println("Resultado: " + resutaldo);}

        if(Operador.equals("-"));
        { double resultado = Numero1 - Numero2; System.out.println("Resultado: " + resultado);}

        if(Operador.equals("*"))
        { double resultado = Numero1 * Numero2; System.out.println("Resultado: " + resultado); }

        if(Operador.equals("/"));
        { double resultado = Numero1 / Numero2; System.out.println("Resutaldo: " + resultado);  }

}}