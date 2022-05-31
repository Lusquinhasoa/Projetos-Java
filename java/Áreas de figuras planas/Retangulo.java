import java.util.Scanner;

public class Retangulo{

public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor da base do retângulo : ");
    int base = in.nextInt();

    System.out.println("Informe o valor da altura do retângulo : ");
    int altura = in.nextInt();
     
    int area = (base * altura);
    System.out.println("A área do retângulo é : " + area);
    in.close();

}
}